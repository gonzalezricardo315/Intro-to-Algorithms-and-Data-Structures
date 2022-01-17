import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		BigDecimal inpt1 = new BigDecimal("2.4");
		BigDecimal inpt2 = new BigDecimal("3.1");
		BigDecimal inpt3 = new BigDecimal("4.3");

		BigRational b1 = new BigRational();
		BigRational b2 = new BigRational(inpt1);
		BigRational b5 = new BigRational(inpt2, inpt2);
		BigRational b3 = new BigRational(inpt1, inpt3);
		BigRational b4 = new BigRational("1.23+4i");
		
		System.out.println(b1.toString());
		
		System.out.println(b2.toString());
		System.out.println(b1.toString());
		b2.add(b1);
		b2.equals(b1);
		
		System.out.println(b3.toString());
		System.out.println(b2.toString());
		b3.add(b2);
		b3.equals(b3);
		
		System.out.println(b2.toString());
		System.out.println(b1.toString());
		b2.subtract(b1);
		b2.equals(b1);
		
		System.out.println(b5.toString());
		System.out.println(b3.toString());
		b5.subtract(b3);
		b3.equals(b3);
		
		System.out.println(b4);
		
	}

}
