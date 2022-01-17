import java.util.Scanner;
public class chapter3programing  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		
		
		System.out.println("guess the the 3 digit combination :");
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		input3 = sc.nextInt();
		combination lock = new combination(input1, input2, input3); 

		lock.Opened(input1, input2, input3);
		
		if(lock.isLockopened() == true) {
			lock.changeCombo();
		}
	}
	
	
}
