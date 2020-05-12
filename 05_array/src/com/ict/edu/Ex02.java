package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// 배열: 같은 자료형의 여러 데이터들을 한 곳에 모아둔 묶음
		//		 반드시 같은 자료형이여야 함
		//		 생성 할 때 크기를 지정하고, 지정된 크기는 변경 불가
		//		 배열 출력 할 때, 일반적으로 for문 사용함
				
		// 배열 생성 순서 ; 선언 - 생성 - 데이터 저장
		
		// 선언&생성 한번에
		// char[] ch;
		// ch = new char[4];
		   char[] ch = new char [4] ;
		
	   // 데이터 저장
		   ch[0] = 'J';
		   ch[1] = 'A';
		   ch[2] = 'V';
		   ch[3] = 65 ; // 0-65535 들어갈 수 있음
		   
	   // 출력
		   for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		   System.out.println("================");
		   
		   for (char k : ch) {
			   System.out.println(k);
			   
			   System.out.println("================");
			   
		// 선언 & 생성 & 데이터 저장 한번에	 
			   char[] ch2 = {'j','a','v','a'}; 
			   int[] k2 = {100,200,300,400};
			   double[] d2 = {3.14, 71.0, 42.1};
			   String[] str = {"홍길동","이길동","김길동","박길동"};
			   
			   for (String k : str) {
				   System.out.println(k);
			   }
			   
			
			
		}
		
	}

}
