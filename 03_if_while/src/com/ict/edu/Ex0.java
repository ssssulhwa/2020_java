package com.ict.edu;

public class Ex0 {
	public static void main(String[] args) {
		
	}



	// int k1이 60이상 합격
	int k1 = 59;
	String str = "초기값" ;{
	if (k1 >=60) {
		str = "합격" ;
		System.out.println("결과:" + str);
	
	}
	// int k2가 60 이상이면 합격 , 60미만 불합격
	int k2 = 59 ;
	str = "초기값" ;
	if(k2>=60) {
		str = "합격" ;
	}
	if (k2<60) {
		str = "불합격" ;
	}
	System.out.println("결과 :"+str);

	
	// 홀수, 짝수 판별
	int k4 = 7 ;
	str = "홀수" ;
	if (k4 % 2 == 0) {
		str = "짝수" ;
	}
	System.out.println("결과 :" + str);
	
	}
}
