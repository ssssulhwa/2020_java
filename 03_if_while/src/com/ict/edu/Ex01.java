 package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 단순 if : 조건식이 참일 때만 실행, 거짓일 때는 if문 무시
		// 조건식 : boolean, 비교연산, 논리연산
		// 형식 : if(조건식) {
		// 				조건식일 참일 때 실행 문장 ;
		// 				조건식일 참일 때 실행 문장 ;
		// }
		// 단, 실행문장이 한 줄 일 때는 { } 생략 가능, 두 줄이상 무조건 { } 써야됨

		// int k1이 60 이상이면 합격, (거짓이면 없는 것과 같음 = 무시됨)
		int k1 = 59;
		String str = "초기값";
		if (k1 >= 60) {
			str = "합격";
		}
		System.out.println("결과:" + str);
		
		// int k2이 60 이상이면 합격, 60 미만은 불합격
				int k2 = 59 ;
				str = "초기값";
				if(k2>=60) {
					str= "합격" ;
				}
				if (k2<60) {
					str = "불합격" ;
					
					
				}
				System.out.println("결과:"+str);
				
				// int k2이 60 이상이면 합격, 60 미만은 불합격
				int k3 = 59 ;
				str = "불합격" ;
				if(k3 >=60) {
					str= "합격" ;
				}
				System.out.println("결과:"+str);
				
			// 홀수 짝수 판별
				int k4 = 7 ;
				str = "홀수" ;
				if (k4 % 2 == 0) { 
					str = "짝수" ; 
					
				}
				System.out.println("결과 :" + str );
				
			// 대문자, 소문자 판별
				char k5 = '1';
						str = "소문자" ;
			    if (k5>='A' && k5 <= 'Z') {
			    	str = "대문자" ;
			    }
			    System.out.println("결과 :" + str);
			

				
				// 1 또는 3 이면 남자, 아니면 여자 
				int k6 = 1 ;
				if (k6 == 1 || k6 == 3) {
					str = "남자" ;
				}
				
				System.out.println("결과 : " + str) ;
				
				// 근무시간 8시간 까지는 시급 8590
				// 8시간 초과한 시간 만큼은 1.5배 지급함
				// 현재 근무한 시간은 10시간
				// 얼마를 받아야 하는가
				int time = 10 ;
				int dan = 8590 ;
				int pay = time * dan ;
				
				if (time > 8 ) {
					pay = ( 8 * dan ) + (int) (((time - 8)*dan*1.5));
				} 
				System.out.println("결과 : " + pay);
				
				
				// 두 수 중 큰 값을 출력 하시오
				int k7 = 10;
				int k8 = 15;
				
				int result = k8 ;
				if(k7 > k8) {
					result = k7 ;
				}
					System.out.println("결과 :" + result);
				

	}

}
