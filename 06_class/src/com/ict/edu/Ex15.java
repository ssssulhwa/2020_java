package com.ict.edu;

public class Ex15 {
	// static 초기화
	// static{
	//	내용 ;
	// } 
	
	int s1= 100;
	static int s2 = 200;
	static int k2 = 2;
	// k3 = 5000;
	// static 초기화
	
	static {
		s2 = 100000;
		s3 = 200000;
		s4 = 300000;
	}
	// int k3;
	static int s3 = 10 ;
	static int s4 ;	// 선언을 나중에 해도 오류X
	
	static int k3 = 2 ;
	static int k4 ;
	
	public static void main(String[] args) {
		// System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("================");
		System.out.print(k2);
		System.out.print(k3);
		System.out.print(k4);
		
	}
	
}
