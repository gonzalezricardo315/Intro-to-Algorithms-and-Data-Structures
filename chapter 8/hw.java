import java.util.Arrays;

public class hw {
	//21 a
	public static void returnQuadrtic(Integer[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] + arr[j] == 10) {
					System.out.println("the numbers that add up to 10 are: " + arr[i] + ", " + arr[j]);
				}
			}
		}
	}
	//21 b
	public static void returnNlogN(Integer[] arr) {
		Sort.quicksort(arr);
		int right = arr.length-1;
		int left = 0;
		while(left < right){
			if(arr[left] + arr[right] == 10) {
				System.out.println("the numbers that add up to 10 are: " + arr[left] + ", " + arr[right]);
				left++;
			}
			else if(arr[left] + arr[right] < 10) {
				left++;
			}
			else if(arr[left] + arr[right] > 10) {
				right--;
			}
		}
	}
	
	
	//27
  	public static int removeDuplicate(Integer [] arr) {
  		Sort.quicksort(arr);
  		int count = 0;
  		for(int i = 0; i < arr.length-1; i++) {
  			if(arr[i].equals(arr[i +1])) {
  				arr[i] = null;
  				count++;
  			}
  		}
  		return arr.length - count;
  	}
  	
  	//33 do string look into .split 
  	public static boolean anagrams(String one, String two) {
  		String[] arr1 = one.split("-"); 
  		String[] arr2 = two.split("-"); 
  		System.out.println("Are " + one + " and " + two + " anagrams");
  		Sort.quicksort(arr1);
  		Sort.quicksort(arr2);
  		return Arrays.equals(arr1, arr2);
  	}

	
	public static void main(String[] args) {
		Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		returnQuadrtic(arr1); 
		
		System.out.println("\n");
		returnNlogN(arr1);
		System.out.println("the second one is faster with run time of N log N");
		
		System.out.println("\n");
		Integer[] arr2 = {1, 1, 3, 4, 4, 6, 7, 7, 7, 7};
		System.out.println("number of duplicates: " + removeDuplicate(arr2));
		
		
		System.out.println("\n");
		Integer[] arr3 = {7, 1, 1, 7, 4, 6, 7, 7, 7, 7, 1};
		System.out.println("number of duplicates: " + removeDuplicate(arr3));
		
		System.out.println("\n");
		String one = "i-n-c-h";
		String two = "c-h-i-n";
		System.out.println(anagrams(one, two));
		
		System.out.println("\n");
		String three = "t-a-r";
		String four = "r-a-t";
		System.out.println(anagrams(three, four));
		
		System.out.println("\n");
		String five = "c-a-r";
		String six = "a-r-c";
		System.out.println(anagrams(five, six));
		
		System.out.println("\n");
		String seven = "e-l-b-o-w";
		String eight = "b-e-l-o-w";
		System.out.println(anagrams(seven, eight));
		
		System.out.println("\n");
		String nine = "n-i-g-h-t";
		String ten = "t-h-i-n-g";
		System.out.println(anagrams(nine, ten));
		
		System.out.println("\n");
		String eleven = "d-u-s-t-y";
		String twelve = "s-t-u-d-y";
		System.out.println(anagrams(eleven, twelve));
	}
}
