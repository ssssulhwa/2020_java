package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
		// break와 continue
		// break : 현재 위치에 블록을 탈출 할 때 사용하는 예약어
		// continue : continue문 이하 수행문을 포기하고 다음 회차로 진행하는 예약어 
		//			  continue문 이하 수행문을 포기하고 바로 증감식으로 감, 해당 회차만 안함
		// break, continue 둘 다 if문과 함께 사용됨
		
		// 1-10까지 출력
			for (int i = 1; i < 11; i++) {
				System.out.print(i + "\t"); //t는 tab의 약자
				
			}
			System.out.println();
			
			// i가 6일 때 break; // 6전 까지 나옴
			for (int i = 1; i < 11; i++) {
				if (i == 6) break;
				System.out.print(i + "\t"); //t는 tab의 약자
				
			}
			System.out.println();
			
			// i가 6일 때 continue; //6만 빼고 나옴
			for (int i = 1; i < 11; i++) {
				if (i == 6) continue;
				System.out.print(i + "\t"); //t는 tab의 약자
				
			}
			System.out.println();
			
			// 0-10 짝수 출력
			for (int i = 0; i < 11; i++) {
				if(i % 2 == 0) {
					System.out.print(i+ "");
				}
			}
			System.out.println();
			
			// 짝수만 출력하자= 홀수를 출력하지 말자
			for (int i = 0; i < 11; i++) {
				if(i % 2 == 1) continue;
					System.out.print(i+ " ");
			
			}
			System.out.println();
			
			
			
			
	}

}
