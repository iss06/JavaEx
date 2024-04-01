package com.javaex.api.objectclass.ex3;

//	객체의 복제
//	얉은 복제 : 필드의 값만 동일하게 복제한 것(프리미티브 타입일 경우)
public class Point implements Cloneable { // extends java.lang.Object
	// Object가 가진 clone() 메서드를 사용하려면
	// Cloneable 인터페이스를 구현해야 한다.

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//	getters/setters
	public int getX() {
		return this.x;	//	내부 필드를 외부로 전달
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// 전달 받은 파라미터 obj가 Point 인지 확인
			// Object -> Point로 캐스팅
			Point other = (Point) obj;
			// 두 객체의 동등성
			// 두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다.
//			return x == other.x && y == other.y;

			if (x == other.x && y == other.y) {
				return true;
			} else {
				return false;
			}
		}
		// obj가 Point가 아님
		return super.equals(obj); // 부모에게 비교 방법을 위임

	}

	// toString : 객체 정보를 문자열로 출력할 때 호출되는 메서드
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	// 객체를 복제해서 새로운 Point를 반환하는 메서드
	public Point getClone() {
		// 새로 생성될 Point 객체
		Point clone = null;

		// 복제 시도
		// clone 메서드 변환 타입은 Object
		try {
			clone = (Point) clone();
		} catch (CloneNotSupportedException e) {
			// clone의 불가능한 상황에 대한 예외 처리
		}

		return clone;
	}
}
