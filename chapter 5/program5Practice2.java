
public class program5Practice2 {

	public static void main(String[] args) {
		// A has to be all the numbers not zero 
		//store in [a]+[b]+[c]
		//5.41
		long []arr = new long[75];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = (long) Math.pow(i, 5);
		}
		
		
		for(int a = 1; a < arr.length; a++) {
			for(int b = a; b < arr.length; b++) {
				for(int c = b; c < arr.length; c++) {
					for(int d = c; d < arr.length; d++) {
						for(int e = d; e < arr.length; e++) {
							for(int f = e; f < arr.length; f++) {
								if(arr[a]+arr[b]+arr[c]+arr[d]+arr[e] == arr[f]) {
									System.out.println("Good job! " + a + "^5 " + b + "^5 " + c + "^5 " + d + "^5 " + e + "^5 = " + f + "^5 ");
								}
							}
						}
					}
				}
			}
		}
		System.out.println(makeLongString1(6));
		System.out.println(makeLongString2(4));
		//both linear looking through it once only. BigOh run time is N
	}
	//5.44
	public static String makeLongString1( int N )
	{
	 String result = "";
	 for( int i = 0; i < N; i++ )
	 result += "x";
	 return result;
	}
	public static String makeLongString2( int N )
	{
	 StringBuilder result = new StringBuilder( "" );
	 for( int i = 0; i < N; i++ )
	 result.append( "x" );
	 return new String( result );
	}
	
}
