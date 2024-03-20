package com.javaex.basic.loop;

public class RandomEx {

	public static void main(String[] args) {
		
//		forLotto();
		whileLotto();
		System.out.println();
	}
	
		public static void forLotto() {
			for (int i = 0; i < 6; i ++) {
				System.out.print((int) (Math.random() * 45) + 1 + " ");
			}
		}
		
		public static void whileLotto() {
			int i = 0;
			while(i < 6) {
				System.out.print((int) (Math.random() * 45) + 1 + " ");
				i += 1;
			}
			
			
		}
		
		
}


		
			
	