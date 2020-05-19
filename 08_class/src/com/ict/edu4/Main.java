package com.ict.edu4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 오버로딩	  : 한 클래스 안에서 같은 이름의 메소드가 여러 개 존재하는 것
		//			  	( 인자의 자료형, 갯수 다름 )
		
		// 오버라이딩 : 상속관계에서 부모 메소드와 자식 메소드가 같은 것
		//				이때 자식 클래스가 부모 메소드를 갖다 쓰는 대신에 내용은 자신에 맞게 변경해서 사용하는 것
		//		 ▲      * 부모 메소드가 숨겨짐 ( =캡슐화, 은닉화)
		//		 ▼		* 같은 메소드를 호출해도 다른 내용을 실행함 (다형성)
		
		// final	  : 종단, 끝의 의미
		// final class ▷ 상속 불가
		// final method ▷ 오버라이딩 불가
		// final 변수 ▷ 값 변경 불가 (상수)
		
		
		Animal d = new Dog();
		Animal c = new Cat();
		
		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.like();
		d.sound();
		System.out.println("==============");
		
		System.out.println(d.eyes);
		System.out.println(d.legs);
		c.like();
		c.sound();
		System.out.println("==============");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요 >> 1. 고양이 2. 강아지");
		int su = sc.nextInt();
		
		/*
		if(su==1) {
			Cat cat = new Cat() ;
			cat.sound() ;
			cat.like();
			cat.hobby();
		} else if(su==2) {
			Dog dog = new Dog() ;
			dog.sound();
			dog.hobby();
		}
		*/
		Animal a = null;
		if(su==1) {
			a = new Cat() ;
		}else if (su==2) {
			a = new Dog();
		}
		a.sound();	// 부모와 자식 다 갖고 있음
		a.like();	// 부모만 갖고 있음
		// a.hobby(); 부모는 없고 자식만 갖고 있어서 사용불가
		
		}
		
		
	}

