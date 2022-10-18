//package com;

public class Triangle 
	extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private String errorMessage = "";
	
	public Triangle() {
	}

	public Triangle(double s1, double s2, double s3, String color, boolean filled) throws Exception {
		setSide1(s1);
		setSide2(s2);
		setSide3(s3);
		setColor(color);
		setFilled(filled);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) throws Exception {
		if(validate(side1)) {
			Exception e = new Exception(errorMessage);
        	throw e;	
		}
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) throws Exception {
		if(validate(side2)) {
			Exception e = new Exception(errorMessage);
        	throw e;	
		}
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) throws Exception {
		if(validate(side3)) {
			Exception e = new Exception(errorMessage);
        	throw e;	
		}
		this.side3 = side3;
	}

	public double getArea() {
		double perimeter = getPerimeter() / 2;
		return Math.sqrt(perimeter * ((perimeter - side1) * (perimeter - side2) * (perimeter - side3)));
	}

	public double getPerimeter() {
		return side1+side2+side3;
	}

	public String toString() {
		return "side1 = " + side1 + " \nside2 = " + side2 +
				" \nside3 = " + side3;
	}
	
		boolean validate(double value) throws Exception {
		if (value <= 0) {
			errorMessage = "Length of a side of triangle cannot be 0 or negative.";
			return true;
		} else
			return false;
	}
}