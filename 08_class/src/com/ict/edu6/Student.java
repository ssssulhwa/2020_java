package com.ict.edu6;

public class Student extends Person{	// <-여기
	private int id ;

	/*
	public Student() {
		// 	super(); 오류 원인
		
		//	< 오류 해결방법 >
		//	super("태권브이", 24) 이름,나이 넣어주기
		// 	Person클래스에 기본 생성자 넣기
	}
	*/
	
	public Student(String name, int age, int id) {
		super(name, age);	// 오류원인
		this.id = id;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("이름 : " + super.getName() + ", 나이 :" + getAge() + ", 학번 :" + id);
	}
	
	
}
