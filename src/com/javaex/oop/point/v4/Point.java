package com.javaex.oop.point.v4;

//	v4. 상속 연습
public class Point {
	// 필드 (자신에게 허용)
	protected int x;
	protected int y;

	// 생성자
//	public Point() {
//
//	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getters/setters
	public int getX() {
		return x;
	}

//	public void setX(int x) {
//		this.x = x;
//	}

	public int getY() {
		return y;
	}

//	public void setY(int y) {
//		this.y = y;
//	}

	// 일반 메서드
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

//	메서드 오버로딩
//		boolean bDraw -> true면 그렀스니다. -> false면 지웠습니다.
	public void draw(boolean bDraw) {
		String message = String.format("점[x=%d,y=%d]을", x, y);
		message += bDraw ? " 그렸습니다." : " 지웠습니다.";
		System.out.println(message);
	}
}
