package com.ict.edu5;

public abstract class Animal {
	// 추상 클래스 : 추상 메소드를 갖고 있는 클래스
	//	(abstract)	 일반적인 멤버필드와 멤버메소드도 가질 수 있음
	
	// 추상 메소드 : body({실행내용})가 없는 메소드 
	//				 반드시 abstract 예약어를 사용해야 함
	
	int su1 = 10;				// 인스턴스 변수
	static int su2 =20;			// static 변수
	final int SU3 = 30;			// 인스턴스 변수
	static final int SU4 = 40;	// static 상수
	
	// 인스턴스 메소드
	public void play() {
		su1++;
		su2++;
		// SU3++;	상수는 값 변경불가
		// SU4++;	상수는 값 변경불가
		
	}
	// static 메소드
	public static void prn() {
		int k1 = 100;
		// 지역변수에는 static 사용불가
		// static int k2 = 200;
		
		// static 메소드는 전역변수에서 static만 사용가능
		// System.out.println(su1);
		System.out.println(su2);
		// System.out.println(SU3);
		System.out.println(SU4);
	}
	
	// 추상메소드: 반드시 abstract 사용 (클래스도 붙여야함)
	public abstract void like() ;
}
