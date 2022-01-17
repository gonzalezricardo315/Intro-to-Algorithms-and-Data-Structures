import java.math.BigInteger;
import java.util.Random;


public class hw9 {

	public static void main(String[] args) {
		BigInteger x = new BigInteger("0");
		BigInteger y = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		boolean run = true;
		int itr = 0;
		
		while(run) {
			int direction = (int)(Math.random()*4); //give you a number in the set {0,1,2,3}
			if(direction == 0){ //go right
				x = x.add(one);
			}
			if (direction ==1) {//go left
				x = x.subtract(one);
			}
			if (direction ==2) {//go up
				y = y.add(one);
			}
			if (direction ==3) {//go down 
				y = y.subtract(one);
			}
			System.out.println("(" + x + ", " + y +")");
			itr++;
			if(x.equals("0") && y.equals("0")) {
				System.out.println("back to (0, 0) in " + itr + " moves");
				run = false;
			}
		}	
	}
}
