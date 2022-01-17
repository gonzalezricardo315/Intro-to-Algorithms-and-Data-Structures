import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class chapter7Pogramming {
	
	public static int ackermanFunction(int m, int n) {
		if(m ==0) {
			return n+1;
		}
		else if(m > 0 && n == 0) {
			return ackermanFunction(m-1, 1);
		}
		else {
			return ackermanFunction(m-1, ackermanFunction(m, n-1));
		}
	}
	
	public static int count(int N) {
		int num;
		if(N==0) {
			num = 0;
			return num;
		}
		else if(N % 2==0){
			num = count(N/2);
			return num;
		}
		else {
			num = 1+ count((N-1)/2);
			return num;
		}
	}
	
	public static void reverse(Scanner sc) {
		String str = sc.nextLine();
		if(str.length() > 0) {
			reverse(sc);
			System.out.println(str);
		}
		else {
			sc.close();
			return ;
		}
	}
	
	public static List allSums(int[] arr, int s, int e, int sum, LinkedList list) {
		if(s > e) {
			list.add(sum);
			return list;
		}
		allSums(arr, s+1, e, sum+arr[s], list);
		allSums(arr, s+1, e, sum, list);
		return list;
	}
	
	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("text.txt");
			reverse(new Scanner(file));
		
	}
}
