package com.ict.edu8;

// 인터페이스: 서비스를 제공하는 목록
//	ex)충전기  상수와 추상메소드들로만 이뤄져있음
//				▷ 생성자 X (객체 생성 X)
//				유일하게 다중 상속 가능
//				* 인터페이스 같음 = 대체 가능 호환가능
// 

public interface Ex01 {
	// (interface가 쓰여 있으면) 모두 다 static final 
	
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	// 추상 메소드가 아니라서 오류 발생
	//	public void play() {} ◁ body. 없어야 인터페이스
	
	//	일반적인 추상 메소드
	public abstract void play();
	
	// interface 에서는 abstract 예약어를 안 써도 오류아님
	public void sound() ; 

}
