package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		//switch ~ case : if문과 같은 조건문
		// if문: 조건식이 boolean형 즉, 비교연산, 논리연산, boolean형 사용
		// switch문: 인자값이 byte, short, int, char, String 일 때 사용
		// switch(인자값){
		//	case 조건값1 : 인자값과 조건값1과 같을 때 수행 할 문장 ; break ;
		//	case 조건값2 : 인자값과 조건값2과 같을 때 수행 할 문장 ; break ;
		//	case 조건값3 : 인자값과 조건값3과 같을 때 수행 할 문장 ; break ;
		//  default : 조건값1,2,3 모두 같지 않을 때, 수행 할 문장 ;
		// }
		// break 없으면 break를 만날 때까지 모든 실행문을 실행\
		// break 역할: 현 실행하고 있는 범위를 벗어나는 역할 
		
		// char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다, 나머지 한국
		char k1 = 'B';
		String res = "";
		switch (k1) {
		case 'A': System.out.println("아프리카"); 
		case 'B': System.out.println("브라질");
		case 'C': System.out.println("캐나다");
		default :  System.out.println("한국");
		}
		char k2 = 'B';
		switch (k1) {
		case 'A': res = "아프리카" ;
		case 'B': res = "브라질";
		case 'C': res = "캐나다"; 
		default : res = "한국"; 
		}
		System.out.println("결과 : " + res);
		
		// char k3이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지 한국 
		char k3 ='A';
		switch (k3) { 
		case 'A': res = "아프리카"; break;
		case 'a': res = "아프리카"; break;
		case 'B': res = "브라질"; break;
		case 'b': res = "브라질"; break;
		case 'C': res = "캐나다"; break;
		case 'c': res = "캐나다"; break;
		default: res = "한국"; break;
		}
		System.out.println("결과 : " + res);
		
		switch (k3) { 
		case 'A': 
		case 'a': res = "아프리카"; break;
		case 'B': 
		case 'b': res = "브라질"; break;
		case 'C': 
		case 'c': res = "캐나다"; break;
		default: res = "한국"; break;
		}
		System.out.println("결과 : " + res);
		

		// int k4가 1 또는 3이면 남자, 2 또는 4이면 여자
		int k4 = 1 ;
		switch (k4) {
		case 1 :
		case 3 : res = "남자"; break;
		case 2 : 
		case 4 : res = "여자"; break;
		}
		System.out.println("결과 : " + res);
		
		// String k5가 한국이면 서울, 중국이면 북경, 일본이면 동경, 미국이면 워싱턴
		String k5= "한국" ;
		 switch (k5) {
		 case "한국" : res = "서울"; break;
		 case "중국" : res = "북경"; break;
		 case "일본" : res = "동경"; break;
		 case "미국" : res = "워싱턴"; break;
		 }
		 System.out.println("결과 : " + res);
		 
		 // switch문은 범위가 넓어지면 사용 안함 (if문 사용)
		 // int k6
		int k6 = 94 ;
		switch ((int)(k6/10)) {
		case 10:
		case 9: res = "A"; 	break;
		case 8: res = "B"; 	break;
		case 7: res = "C"; 	break;

		default: res = "F"; 	break;
		}
		System.out.println("결과 : " + res );
		}
	}