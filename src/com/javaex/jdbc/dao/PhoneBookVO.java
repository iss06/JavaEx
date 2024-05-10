package com.javaex.jdbc.dao;

public class PhoneBookVO {

	private Long phoneId;
	private String phoneName;
	private String phoneHp;
	private String phoneTel;

	public PhoneBookVO() {

	}

	public PhoneBookVO(Long phoneId, String phoneName, String phoneHp, String phoneTel) {
		super();
		this.phoneId = phoneId;
		this.phoneName = phoneName;
		this.phoneHp = phoneHp;
		this.phoneTel = phoneTel;
	}

	public PhoneBookVO(String phoneName, String phoneHp, String phoneTel) {
		super();
		this.phoneName = phoneName;
		this.phoneHp = phoneHp;
		this.phoneTel = phoneTel;
	}

	public Long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneHp() {
		return phoneHp;
	}

	public void setPhoneHp(String phoneHp) {
		this.phoneHp = phoneHp;
	}

	public String getPhoneTel() {
		return phoneTel;
	}

	public void setPhoneTel(String phoneTel) {
		this.phoneTel = phoneTel;
	}

	@Override
	public String toString() {
		return "PhoneBookVO [phoneId=" + phoneId + ", phoneName=" + phoneName + ", phoneHp=" + phoneHp + ", phoneTel="
				+ phoneTel + "]";
	}

}
