
import java.util.*;

public class chapter5program {

	public static void main(String[] args) {
		int []array = new int[] {3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9, 9, 9, 10, 11};
		
		for(int i = 0; i < array.length; i++) {
			if(i == array[i]) {
				System.out.println("Spot " + i + " has the property Ai = i, Array: " + array[i]);
			}
		}
		
		//Why isnt 459674? no even 
		//is 459673 prime? not prime either
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an intiger to see if its prime: ");
		int prime = sc.nextInt();
		
		isPrime(prime);
		
		int []A = new int[] {6, 1, 6, 4, 6, 6, 7, 6, 2};
		int []B = new int[] {6, 1, 6, 4, 6, 6, 7, 4};
		
		majorityElement(A);
		majorityElement(B);
				
	}
	public static boolean isPrime(int prime) {
		if(prime <= 1) {
			System.out.println("false");
			return false;
		}
		
		for(int i = 2; i < prime; i++) {
			if(prime % i == 0) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}
	
	public static void majorityElement(int [] A) {
		int []count = new int[10];
		boolean t = false;
	
		for(int i = 0; i < A.length; i++) {
			count[A[i]] ++;
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] > A.length/2) {
				System.out.println("Majority element: " + i);
				t = true;
			}
		}
		if(t == false) {
			
			System.out.println("No Majority element");
		}
	}
}
