package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 배열: 같은 자료형의 여러 데이터들을 한 곳에 모아둔 묶음
		//		 반드시 같은 자료형이여야 함
		//		 생성 할 때 크기를 지정하고, 지정된 크기는 변경 불가
		//		 배열 출력 할 때, 일반적으로 for문 사용함
		
		//	배열 생성 순서 ; 선언 - 생성 - 데이터 저장
		// 	1. 선언: 자료형[] 이름 ;
		//			 자료형 이름[] ;
		
		int[] su ; // 스택
		
		// 2. 생성 : 이름 = new 자료형[배열의 크기 = 방의 수 = 1부터 시작] ;
		// new는 예약어 메모리에 데이터를 저장 할 공간을 만들어라
		// (=인스턴스, 객체생성)
		
		su = new int[4]; // 힙
		

		// 3. 데이터 저장 : 이름[방번호= index= 0부터 시작] - 저장 할 데이터
		// 이때 자료형은 같아야 함 (단, 작은 자료형은 큰 자료형에 저장 가능)
		su[0] = 100;
		su[1] = 200;
		
		su[2] = 'a';
		// su[3] = '3.14'; 큰 자료형은 작은 자료형에 저장 불가
		
		su[3] = 300;
		su[3] = 100; 
		// 데이터 중복  가능, 현재 데이터가 있어도 저장 가능
		
		// su[4] = 500; 방의 크기를 벗어나면 실행할 때 오류 뜸
		
		// 배열의 주소(생성ID)가 출력됨
		System.out.println(su);
		
		// 배열 안에 있는 데이터 출력하기
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println("==================");
		
		// for문 안의 i < 4에서 4는 배열의 크기임
		for (int i = 0; i < 4; i++) {
			System.out.println(su[i]);
			
		}
		System.out.println("==================");
		
		// for문 사용하기 su.length = 배열 su의 길이(크기)
		 for (int i = 0; i < su.length; i++) {
			 if(i == 2) {
				 System.out.println((char)(su[i]));
			 }else {
			 System.out.println(su[i]);
			
		}
		 
		 // 개선된 for문: 주로 배열이나 컬랙션에 사용됨 (foreach 4번째)
		 // -> 배열 전체에 대한 정보 가공 가능, but 개별로는 가공 불가
		 // su의 모든 것을 k에 저장
		 
		 for (int k : su) {
			 System.out.println((char)(k));
			 
			
		}
		
		
		
		 }
		 }
	}


