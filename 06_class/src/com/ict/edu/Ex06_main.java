package com.ict.edu;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 e6 = new Ex06();

		System.out.println(e6.name);
		String s = e6.s_name();
		System.out.println(s);
		System.out.println();

		System.out.println(e6.age);
		int s1 = e6.s_age();
		System.out.println(s1);
		System.out.println();

		// weight이 private 이여서 바로 접근 불가
		// System.out.println(e6.weight);

		// 메소드를 이용해 접근하기 (getter)
		double s2 = e6.s_weight();
		System.out.println(s2);
		System.out.println();
		System.out.println("=====================");
		
		// 이름을 '둘리'로 변경하기 
		e6.re_name("둘리");
		// 확인
		System.out.println(e6.name);
		s = e6.s_name();
		System.out.println(s);
		System.out.println();
		
		// 나이를 5000살로 변경하기
		e6.re_age(5000) ;
		// 확인
		System.out.println(e6.age);
		s1 = e6.s_age() ;
		System.out.println(s1);
		System.out.println();
		
		// 몸무게를 10000로 변경하기
		// int는 double에 저장가능
		e6.re_weight(10000);
		s2 = e6.s_weight();
		System.out.println(s2);
		System.out.println();
	}
}
