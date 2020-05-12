package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		
		// 순위 구하기
		// 1. 모든 사람의 순위를 1등으로 초기값 부여
		// 2. 모든 사람들과 비교 해야 함
		// 3. 나(i)보다 남(j)이 크면 내 순위 증가 시킴
		
		int[] su = { 90, 85, 70, 90, 95, 80 } ;
		int[] rank = {1, 1, 1, 1, 1, 1} ; 
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(su[i] < su[j]) {
					rank[i]++ ; // 나(i) 등수를 올림
				}
				
			}
			
		}
		for (int k : rank) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
