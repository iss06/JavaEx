package com.javaex.oop.person;

public class Person {

	protected String name;
	protected int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Inside Person Constructor");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("Name: " + name + ", Age:" + age);
	}
}
