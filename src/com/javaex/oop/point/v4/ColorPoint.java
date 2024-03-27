package com.javaex.oop.point.v4;

//	상속 extends
public class ColorPoint extends Point {
	// 필드
	private String color;
//	ColorPoint cp1 = new ColorPoint("red");
//	ColorPoint cp2 = new ColorPoint(10, 10, "blue");

	// 생성자
	public ColorPoint(String color) {
		// 생성자 내에서 부모 생성자를 호출하지 않으면 부모의 생성자를 호출
		super(0, 0);
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모 생성자 호출
		this.color = color;
	}

	// getters/setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override // 현재 메서드가 Override인지 확인
	public void draw() {
		// getter 이용 우회접근
//		System.out.printf("색깔점[x=%d ,y=%d, color =%s] 점을 찍었습니다.%n",
//				super.getX(), super.getY(), color);
		System.out.printf("색깔점[x=%d ,y=%d, color=%s] 점을 찍었습니다.%n", x, y, color);
	}

	// void draw(boolean) 오버라이드
	public void draw(boolean bDraw) {
		String message = String.format("새깔점 [x=%d, y=%d, color%s]을", x, y, color);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
}
