public class Rectangle extends Shape
{
    public Rectangle( double len, double wid, double posx, double posy )
    {
    	super(posx, posy);
    	if(len < 0 || wid < 0) {
    		throw new IllegalArgumentException ("cant be negative");
    	}
        length = len; width = wid;
       
    }
     
    public double area( )
    {
        return length * width;
    }
    
    public double perimeter( )
    {
        return 2 * ( length + width );
    }
    
    public String toString( )
    {
        return "Rectangle: " + length + " " + width;
    }
    
    public double getLength( )
    {
        return length;
    }
    
    public double getWidth( )
    {
        return width;
    }

    private double length;
    private double width;
}