package com.ict.edu8;

public class Ex02 {
	public static void main(String[] args) {
		// 객체 생성 없이 호출가능 ▶ staic 
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.SU3);
		System.out.println(Ex01.SU4);
		
		// 값 변경 안됨 ▶ final
		// System.out.println(Ex01.su1++);
		// System.out.println(Ex01.su2++);
		// System.out.println(Ex01.SU3++);
		// System.out.println(Ex01.SU4++);
	}
}
