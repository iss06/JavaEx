package com.javaex.basic.loop;

public class ForWhileEx2 {

	public static void main(String[] args) {
		
		int num = 1; 
		int dan = 1;
		
		for(num = 1; num <= 9; num++) 
		for(dan = 1; dan <= 9; dan++) {
			System.out.println(num + "*" + dan + "=" + (num * dan));
		}
		
		

	}

}
