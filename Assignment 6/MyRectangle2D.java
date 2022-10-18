//package com;
public class MyRectangle2D {
	private double x, y; 
	private double width, height;
	String Er = "";

	public MyRectangle2D() {
		x = y = 0;
		width = height = 1;
		
	}

	public MyRectangle2D(double x, double y, double w, double h)throws Exception
	{
		setX(x);
		setY(x);
		setWidth(w);
		setHeight(h);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void setWidth(double x) throws Exception {
		if (!isValidWidth(x)) {
			throw new Exception(Er);
		}
		width = x;
	}

	public void setHeight(double y) throws Exception {
		if (!isValidheight(y)) {
			throw new Exception(Er);
		}
		height = y;
	}
	
	public boolean isValidWidth(double a) {
		if (a < 0) {
			Er = "\nIncorrect Input... Please Enter a Positive value ";
			return false;
		} else if (a == 0) {
			Er = "\nIncorrect Input... Please Enter a value which is greater than zero";
			return false;
		} else
			return true;
	}

	public boolean isValidheight(double b) {
		if (b < 0) {
			Er = "\nIncorrect Input... Please Enter a Positive value";
			return false;
		} else if (b == 0) {
			Er = "\nIncorrect Input... Please Enter a value which is greater than zero";
			return false;
		} else
			return true;
	}

	public double getWidth() {
		return width;
	}

	

	public double getHeight() {
		return height;
	}

	

	// area of the rectangle.
	public double getArea() {
		return width * height;
	}

	// perimeter of the rectangle.
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean contains(MyRectangle2D r)
	{
		if ( (r.x+r.width/2 < x+(width/2)) && (r.x-r.width/2 > x-(width/2)) && (r.y+r.height/2 < y+(height/2)) 
				&& (r.y-r.height/2 > y-(height/2)))
	      {
		     return true;
	      }
		else
		{
			return false;
		}
	}
	public boolean overlaps(MyRectangle2D r) {
		return ((!contains(r) &&
				 ((x + width / 2 > r.getX() - r.getWidth()) ||
				 (y + height / 2 > r.getY() - r.getHeight())) &&
		  		 (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) && 
				 (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2)) || contains(r));
	}

	private double getDistance(double a, double b) {
		return Math.sqrt(Math.pow(a - b, 2));
	}
	public boolean abutment (MyRectangle2D r)
	{
	  if(r.getX()+r.getWidth()/2  == this.x-width/2 || this.x+width/2 == r.getX()-r.getWidth()/2 ||
			r.getY()+r.getHeight()/2  == this.y-height/2 || this.y+height/2 == r.getY()-r.getHeight()/2 )
    { 
	    return true;
	}
	else
	{

	   return false;
	}
	}
	public boolean distinct(MyRectangle2D r)
	{
		if(!(abutment(r)) && (!overlaps(r)) && (!contains(r)))
		{
			return true;
		}
		else
		{
			return false;
		}
	  
     }
	String getErrorMessage()
	{
		return Er;
	}
	

}