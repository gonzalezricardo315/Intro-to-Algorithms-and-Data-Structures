import java.math.BigDecimal;
import java.math.BigInteger;

 public class BigRational
 {
 public static final BigRational ZERO = new BigRational( );
	 private BigDecimal input1; 
	 private BigDecimal input2;
	 private String str;
	 
	public BigRational( ){
			this(BigDecimal.ZERO); 
		}
	 public BigRational( BigDecimal input1 ){ 
		 	this(input1, BigDecimal.ZERO); 
		 }
	 public BigRational( BigDecimal n, BigDecimal d ){
		 input1 = n; 
		 input2 = d; 
	 }
	 public BigRational( String str ){ 
	 if( str.length( ) == 0 )
		 throw new IllegalArgumentException( "Zero-length string" );
		 
		 // Check for '+' and '-'
		 int slashIndex1 = str.indexOf('+');
		 int slashIndex2 = str.indexOf( '-' );
		 if(slashIndex1 == -1 && slashIndex2 == -1)
		 {
			 input1 = new BigDecimal( str.trim( ) );
			 input2 = BigDecimal.ZERO; 
		 }
		 else if(slashIndex2 == -1)
		 {
			 input1 = new BigDecimal( str.substring( 0, slashIndex1 ).trim( ) );
			 input2 = new BigDecimal( str.substring( slashIndex1 + 1 ).trim( ).replace("i", "") );
		 }
		 else if(slashIndex1 == -1) {
			 input1 = new BigDecimal( str.substring( 0, slashIndex2 ).trim( ) );
			 input2 = new BigDecimal( str.substring( slashIndex2 + 1 ).trim( ).replace("i", ""));
		 }	 
 	}
 
	 public BigDecimal getInput1() {
		return input1;
	}
	public void setInput1(BigDecimal input1) {
		this.input1 = input1;
	}
	public BigDecimal getInput2() {
		return input2;
	}
	public void setInput2(BigDecimal input2) {
		this.input2 = input2;
	}
	//public String getStr() {
	//	return str;
	//}
	//public void setStr(String str) {
	//	this.str = str;
	//}
	
	public BigRational add( BigRational other ){ 
		BigDecimal n = getInput1().add(other.getInput1());
		BigDecimal d = getInput2().add(other.getInput2());
		System.out.println(new BigRational(n, d));
		return new BigRational(n, d);
	 }
	 public BigRational subtract( BigRational other ){ 
		 BigDecimal n = getInput1().subtract(other.getInput1());
		 BigDecimal d = getInput2().subtract(other.getInput2());
		 System.out.println(new BigRational(n, d));
		 return new BigRational(n, d);
	 }
	
	 public boolean equals( Object other )
	 { 
		 if( ! ( other instanceof BigRational ) )
			return false;
		 
			BigRational rhs = (BigRational) other;
	
			return getInput1().equals( rhs.getInput1() ) && getInput2().equals( rhs.getInput2() );
	 }
	 public String toString()
	 { 
		//if(((BigRational) other).getStr() == "+") {
			 return getInput1().toString() + " + " + getInput2().toString() + "i";
		//}
		//else{
			//return getInput1().toString() + " - " + getInput2().toString() + "i";
		//}
	 }

}