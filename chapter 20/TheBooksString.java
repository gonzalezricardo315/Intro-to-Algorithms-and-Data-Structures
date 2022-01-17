import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class TheBooksString {

	//My recreation of Figure 20.2
	public static int hash(String key, int tableSize) {
		int hashVal = 0;
		
		//doing the time and adding the character
		for(int i = 0; i < key.length(); i++) {
			hashVal = 37 * hashVal + key.charAt(i);
		}

		hashVal %= tableSize;
		if(hashVal < 0) {
			hashVal += tableSize;
		}
		
		return hashVal;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		//TODO Place the code for 20.17 here
		try {
			int fileSize = 48477;
			File file = new File("onlineDictionary.txt");
			Scanner sc = new Scanner(file);
			int tableSize = fileSize*2;
			int [] ts = new int[tableSize];
			while(sc.hasNextLine()) {
				ts[hash(sc.nextLine(), tableSize)]++;
			}
			Formatter out = new Formatter("temp.csv");
			int s = 0;
			for(int i : ts) {
				s += ts[i];
				out.format(s + "\n");
			}
		} catch(FileNotFoundException f) {
			f.printStackTrace();
		}	
	}

}
