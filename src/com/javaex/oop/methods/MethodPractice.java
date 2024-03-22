package com.javaex.oop.methods;

public class MethodPractice {

	public static void main(String[] args) {
		// 문제1.
//		printHelloMethod();
		// 문제2.
//		printNumbers();
		// 문제3.
//		int rnd = getRandomNumber();
//		System.out.println(rnd);
		// 문제4.
//		int result = getSum();
//		System.out.println(result);
		// 문제5.
//		printOddOrEven(2024);
		// 문제6.
//		printStringLength("Java Programming");
		// 문제7.
//		int largeNumber = getLargeNumber(10, 20);
//		System.out.println(largeNumber);
		// 문제8.
//		System.out.println(concatenateStrings("Java ", "Programming"));
		// 문제9.
//		System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9));
		// 문제10.
		System.out.println(concatenateStrings("Java ", "Prongramming ", "is ", "fun!"));

	}

	// 콘솔에 “Hello Method!”를 출력하는 메서드를 작성하세요.
	private static void printHelloMethod() {
		System.out.println("Hello Method!");
	}

	// 1부터 10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요
	private static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// 0 ~ 100사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
	private static int getRandomNumber() {
		int rnd = (int) Math.random() * 101;
		return rnd;
	}

	// 1부터 10까지의 합(55)을 반환하는 메서드를 작성하세요.
	private static int getSum() {
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;
		}
		return result;
	}

	// 정수를 하나 받아 그 정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
	public static void printOddOrEven(int value) {
		// 3항 연산 : 조건식 ? 참일 때의 값 : 거짓일 때의 값
		System.out.println(value % 2 == 0 ? "짝수" : "홀수");
	}

	// 문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드를 작성하세요.
	public static void printStringLength(String str) {
		System.out.println(str.length());

	}

	// 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요.
	private static int getLargeNumber(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}

	}

	// 문자열 두 개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요.
	private static String concatenateStrings(String str1, String str2) {
		return str1 + str2;
	}

	// 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요.
	private static int sumAll(int... values) {
		int total = 0;
		for (int val : values) {
			total += val;
		}
		return total;
	}

	// 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요.
	private static String concatenateStrings(String... values) {
		String result = "";

		for (String val : values) {
			result += val;
		}
		return result;
	}

}
