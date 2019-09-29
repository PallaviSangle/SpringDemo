package com.bv.model;

import java.util.List;

public class Triangle {

	/*private Point A;
	private Point B;
	private Point C;

	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}

	

	public void draw() {

		Triangle triangle;
		System.out.println("A"+A.toString()+"B"+B.toString()+"C"+C.toString());
		
	*/
	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw()
	{
		for(Point point:points)
		{
			System.out.println(point.getX()+" "+point.getY());
		}
	}
}
	
