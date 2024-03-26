package com.javaex.oop.tv;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);

		tv.status();	//	꺼져있는 상태

		tv.power(true);	//	전원 켜기
		tv.volume(120);	//	용량의 범위를 벗어남
		tv.status();

		tv.volume(false);
		tv.status();

		tv.channel(0);	//	채널 범위를 벗어남
		tv.status();

		tv.channel(true);	//	channel + 1
		tv.channel(true);	//	channel + 1
		tv.channel(true);	//	channel + 1 
		tv.status();

		tv.power(false);
		tv.status();
	}

}
