package com.ict.edu5;

	// 추상 메소드를 상속 받은 일반적인 클래스
	// 반드시 부모의 추상 메소드를 오버라이딩 해서 body 부분을 만듦
public class Dog extends Animal{
	
	@Override
	public void like() {
		System.out.println("늦잠 자기");
	}
}
