package com.ict.edu6;

public class Main {
	public static void main(String[] args) {
		
		// 상속 : 자식 -> 부모
		
		// super와 super() , this와 this()
		// this :	객체 내부에서 자기 자신을 지칭하는 예약어
		// 			전역변수와 지역변수의 이름이 같을 때
		// 			전역변수 앞 this를 사용해서 전역변수 임을 알 수 있음

		// this([인자]) :	'객체의 생성자'를 지칭하는 예약어
		// 					생성자에서 자신의 다른 생성자를 호출할 때 사용
		// 					반드시 생성자 첫 줄에 존재해야 함

		// super :	부모 클래스의 멤버필드를 지칭하는 예약어
		// 			자식 클래스의 전역변수와 이름이 같을 때, 부모 클래스 멤버필드 앞에 사용함
		// 			부모 클래스 멤버필드 앞에 사용함
		//

		// super([인자]) :	부모의 생성자를 지칭하는 예약어
		// 					부모 생성자를 호출할 때 사용
		// 					반드시 생성자 첫 줄에 존재해야 함
		// 					this(), super() 같이 사용불가 (없으면 생략 되어 있는 것)
		
	
		
		Person s = new Student ("홍길동 학생", 24, 25000) ;
		Person t = new Teacher ("고길동 강사", 54, "자바") ;
		Person e = new Employee ("둘리 관리자", 45, "교무과") ;
		
		// 만약 Person print() 없으면, Student(), Teacher(), Employee()에 print()가 있어도 사용불가` 
		s.print();
		t.print();
		e.print();
		
		
		
		//

	}
}
