package com.ict.edu;

public class Ex11_main {
	public static void main(String[] args) {

	// 객체 생성
	 Ex11 t1 =new Ex11();
	 
	 System.out.println(t1.getName());
	 System.out.println(t1.getAge());
	 System.out.println(t1.getAddr());
			 
	 // t1 데이터를 변경하기
	 // 둘리, 5000, 남극으로 변경하기
	 
	 t1.setName("둘리");
	 t1.setAge(5000);
	 t1.setName("남극");
	 System.out.println(t1.getName());
	 System.out.println(t1.getAge());
	 System.out.println(t1.getAddr());
	 System.out.println("==============");
	 
	 Ex11 t2 = new Ex11();
	 System.out.println(t2.getName());
	 System.out.println(t2.getAge());
	 System.out.println(t2.getAddr());
	 System.out.println("==============");
	 
	 
	 
}
}