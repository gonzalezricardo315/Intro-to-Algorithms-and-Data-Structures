public class Person implements Comparable<Person>
{
    public static <AnyType extends Comparable<? super AnyType>> Comparable findMax( Comparable [ ] a )
    {
        int maxIndex = 0;
        
        for( int i = 1; i < a.length; i++ )
            if( a[ i ].compareTo( a[ maxIndex ] ) > 0 )
                maxIndex = i;
            
        return a[ maxIndex ];    
    }
    
    public int compareTo(Person other){
    	return getName().compareTo(other.getName());
    }
    
	
    public Person( String n, int ag, String ad, String p )
    {
        name = n; age = ag; address = ad; phone = p;
    }
    
    public String toString( )
    {
        return getName( ) + " " + getAge( ) + " " + getPhoneNumber( );
    }
    
    public final String getName( )
    {
        return name;
    }
    
    public final int getAge( )
    {
        return age;
    }
    
    public final String getAddress( )
    {
        return address;
    }
    
    public final String getPhoneNumber( )
    {
        return phone;
    }
    
    public final void setAddress( String newAddress )
    {
        address = newAddress;
    }
    
    public final void setPhoneNumber( String newPhone )
    {
        phone = newPhone;
    }
    
    private String name;
    private int age;
    private String address;
    private String phone;
    
    
    public static void main( String [ ] args ){
    	Person p1 = new Person("ris", 0, "", "");
    	Person p2 = new Person("dfs", 0, "", "");
    	Person[]arr = {p1, p2};
    	
    	System.out.println(findMax(arr));
    	System.out.println(p2.compareTo(p1));
    }
}