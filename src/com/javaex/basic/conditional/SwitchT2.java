package com.javaex.basic.conditional;

import java.util.Scanner;



public class SwitchT2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 :");
		
		int score = scanner.nextInt();
		String message;
		
	
		if (score >= 90) {
			message = "A등급";
	}	else if (score >= 80) {
			message ="B등급";
	}	else if (score >= 70) {
			message ="C등급";
	}	else if (score >= 60) {
			message ="D등급";
	}	else {
			message ="F등급";
	}
		
		System.out.println(message);
		
		scanner.close();

	}

}
