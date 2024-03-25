package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
//		Point x1 = new Point();
//
//		x1.setName("x");
//		x1.setCoordinate(5);
//
//		Point x = new Point();
//		x.setName("x");
//		x.setCoordinate(10);
//
//		Point y1 = new Point();
//
//		y1.setName("y");
//		y1.setCoordinate(5);
//
//		Point y = new Point();
//		y.setName("y");
//		y.setCoordinate(23);
//
//		System.out.printf("점[%s = %d,", x1.getName(), x1.getCoordinate());
//		System.out.printf(" %s = %d]을 그렸습니다.", y1.getName(), y1.getCoordinate());
//		System.out.printf("%n점[%s = %d,", x.getName(), x.getCoordinate());
//		System.out.printf(" %s = %d]을 그렸습니다.", y.getName(), y.getCoordinate());

		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);

		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);

		p1.draw();
		p2.draw();
	}

}
