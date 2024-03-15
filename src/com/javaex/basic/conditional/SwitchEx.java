package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//	스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		//	과목번호 입력
		System.out.println("과목을 선택하세요. \n(1.자바 2.C 3.C++ 4.파이썬) \n과목번호:");
		int subject = scanner.nextInt();
		
		//	조건분기 ( Switch)
		switch(subject) {
		case 1:	//	subject == 1
			System.out.println("R101호 입니다.");
			break;
		case 2:	//	subject == 2
			System.out.println("R202호 입니다.");
			break;
		case 3:	//	subject == 3
			System.out.println("R303호 입니다.");
			break;
		case 4:	//	subject == 4
			System.out.println("R404호 입니다.");
			break;
		default:	//	else
			System.out.println("상담원에게 문의하세요.");
			break;
		}
		// 스캐너 닫기
		
		scanner.close();
	}

}
