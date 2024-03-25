package com.javaex.oop.point.v1;

public class Point {

//	private String name;
//	private int coordinate;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getCoordinate() {
//		return coordinate;
//	}
//
//	public void setCoordinate(int coordinate) {
//		this.coordinate = coordinate;
//	}

	// 필드 (온닉)
	private int x;
	private int y;

	// getters/setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 일반 메서드
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
