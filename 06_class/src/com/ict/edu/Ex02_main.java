package com.ict.edu;

import java.util.Random;
public class Ex02_main {
	public static void main(String[] args) {
		
		// static 멤버필드 호출
		System.out.println(Ex02.eng);
		System.out.println(Ex02.com);
		
		// static 아니니까 호출 불가
		// System.out.println(Ex02.kor);
		// System.out.println(Ex02.math);
		
		// Ex02 클래스 객체 만들기
		// 클래스이름 참조변수 = new 생성자 ;
		// Ex02에 생성자 없으면 기본 생성자로 생성
		Ex02 test = new Ex02() ;
		
		// 멤버필드 호출 ; 객체참조변수.멤버필드
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.math);
		System.out.println(test.com);
		
		System.out.println(test);
		
		// API를 이용해서 static 메소드와 인스턴스 메소드 호출하기
		// API를 제공하는 Random 클래스의 nestInt(), nextInt(int bound), nextDouble()를 사용하는 예
		
		// API를 제공하는 Random 클래스의 nestInt(), nextInt(int bound), nextDouble()은 static이 아니므로 클래스를 객체로 만들어서 사용해야 함
		
		// 1. 클래스를 객체로 만드는 방법
		// 	  클래스 참조변수 = new 생성자
		Random ran = new Random() ;
		// nextInt() : int 범위 안에서 무작위로 정수 추출
		int res = ran. nextInt();
		System.out.println(res);
		System.out.println("===========");
		
		// nextInt(숫자) : 반환값 ( 0-숫자 전까지)
		res = ran.nextInt(6); // 0-5까지
		System.out.println(res);
		System.out.println("==============");
		
		// 정해지지 않은 0.0 ~ 1.0 미만의 실수 (소수점 한자리는 X)
		double res2 = ran.nextDouble();
		System.out.println(res2);
		System.out.println("-------------");
		
		// Math 클래스의 메소드들은 static이므로 객체 생성없이 사용 가능
		// 클래스이름.멤버필드,클래스이름.멤버메소드로 사용
		System.out.println(Math.random());	// 0.0 이상 ~ 1.0 미만
		
		// 원하는 정수까지로 안 정해진 수 지정		
		System.out.println((int)(Math.random()*6));	// 0-5 까지
		
		
		
		
		
	}

}
