package com.ict.edu8;

// 인터페이스 상속
// 1. 일반 클래스가 상속 받으면 반드시 오버라이딩 해야 함
 class Ex03 implements Ex01{

	@Override
	public void play() {}
	@Override
	public void sound() {}
}
 // 2. 추상 클래스가 상속 받으면 오버라이딩 할 필요없음
 abstract class Ex04 implements Ex01{
	 int k1 = 10 ; // 인스턴스 변수
	 
	 public abstract void leftSound();
 }
 abstract class Ex05 implements Ex01{
	 int k1 = 10 ; // 인스턴스 변수
 }
 
	 // 3. 인터페이스가 상속을 받으면 오버라이딩 할 필요없음
	 interface Ex06 extends Ex01{
		 int k1 = 10 ; // static final 
	 }
	 
	 // 2,3번은 나중에라도 일반 클래스 상속 받으면 모두 오버라이딩 해야함
	 class Ex07 extends Ex05{

		@Override
		public void play() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sound() {
			// TODO Auto-generated method stub
			
		}
		
		class Ex08 extends Ex04{

			@Override
			public void play() {}

			@Override
			public void sound() {}

			@Override
			public void leftSound() {}
		}
		}
	 
	 
	 
	 
	 
