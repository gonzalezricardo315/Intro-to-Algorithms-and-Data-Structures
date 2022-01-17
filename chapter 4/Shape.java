
public abstract class Shape 
{
	double posx;
	double posy;
    public abstract double area( );
    public abstract double perimeter( );
    
    public Shape(double posx, double posy) {
    	this.posx = posx;
    	this.posy = posy;
    }
    
    public double semiperimeter( )
    {
        return perimeter( ) / 2; 
    }
    
    
    public static double distance(Shape sh1, Shape sh2) {
    	
    	return Math.sqrt(Math.pow(sh2.posx - sh1.posx, 2) + Math.pow(sh2.posy - sh1.posy, 2));
    }
//    public static void stretchAll(WhatType[] arr, factor) {
//    	for(WhatType s: arr) {
//    		s.stretch(factor);
//    	}
//    }
}
