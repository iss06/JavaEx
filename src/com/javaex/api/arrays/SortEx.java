package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

//	사용자 정의 클래스를 Sort 하고자 할때, Comparable 인터페이스를 구현 해야 한다.
class Member implements Comparable {
	//	필드
	String name;
	
	//	생성자
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		
		//	두 객체의 선후 관계를 비교해서
		//	-1, 0, 1 return
		//	비교 대상이 순서가 동일 : 0
		//	작은 경우 : -1
		//	큰 경우 : 1 
		if (o instanceof Member) {
			//	Member로 캐스팅 가능
			Member other = (Member)o;
			//	대소 관계의 비교는 name 필드로 비교
			return name.compareTo(other.name);
		}
		return 0;
	}
	
	
}

public class SortEx {

	public static void main(String[] args) {
		//	1. 기본 소팅(정렬)
		basicSort();
		//	2. 역순 장렬
		basicDescSort();
		//	3. 사용자 정의 클래스 정렬
		customClassSort();
	}
	
	private static void basicSort() {
		int[] scores = {80, 50, 30, 90, 75, 88, 77};
		System.out.println("배열 원본:" + Arrays.toString(scores));
		Arrays.sort(scores);	//	작은 것 -> 큰 것 : 오름차순(Ascending)
		System.out.println("오름차순 정렬:" + Arrays.toString(scores));	
	}
	
	private static void basicDescSort() {
		Integer[] scores = {80, 50, 30, 90, 75, 88, 77};
		System.out.println("배열 원본:" + Arrays.toString(scores));
		//	내림차순
		Arrays.sort(scores,	//	정력된 배열
				Collections.reverseOrder());
		System.out.println("내림차순 정력:" + Arrays.toString(scores));
		//	객체 내부의 Compararator로 객체의 선후 관계를 규정해야 하기 때문에
		//		프리미티브타입은 역순정렬 될 수 없다.
	}
	
	private static void customClassSort() {
		//	사용자 정의 클래스의 정렬
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정")
		};
		System.out.println("원본 배열:" + Arrays.toString(members));
		Arrays.sort(members);	//	오름차순
		System.out.println("오름차순 정렬:" + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("내림차순 정렬:" + Arrays.toString(members));
		}
	

}

