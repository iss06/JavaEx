package com.javaex.oop.tv;

public class TV {
	//	상수
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_CHANNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;

	//	필드
	private int channel;
	private int volume;
	private boolean power;

	public TV() {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}

	public TV(int channel, int volume, boolean power) {
		super();

		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel;
		}
	}

	// 채널 변경 메서드(오버로딩)
	public void channel(boolean up) {
		if (up) { // 채널 올림
			if (this.channel < MAX_CHANNEL) { // 최대 채널에 도달하지 않음
				this.channel++;
			}
		} else { // 채널 내림
			if (this.channel > MIN_CHANNEL) { // 최소 채널에 도달하지 않음
				this.channel--;
			}
		}
	}

	// 볼륨 조절 메서드
	public void volume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
		}
	}

	// 볼륨 조절 메서드(오버로딩)
	public void volume(boolean up) {
		if (up) { // 볼륨 올림
			if (this.volume < MAX_VOLUME) { // 최대 볼륨에 도달하지 않음
				this.volume++;
			}
		} else { // 볼륨 내림
			if (this.volume > MIN_VOLUME) { // 최소 볼륨에 도달하지 않음
				this.volume--;
			}
		}
	}

	public void status() {
		if (power) { // TV가 켜졌을 때만 정보를 보여주자
			System.out.println("전원: 켜짐");
			System.out.println("현재 채널: " + channel);
			System.out.println("현재 음량: " + volume);
		}
	}

}
