package com.ict.edu;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int [5][5];
				
				// 입력
				for (int i = 0; i < arr.length; i++) {
					System.out.print("번호 :");
					int no = sc.nextInt();
					System.out.print("국어점수 :");
					int kor = sc. nextInt();
					System.out.print("영어점수 :");
					int eng = sc. nextInt();
					System.out.print("수학점수 :");
					int math = sc.nextInt();
					int sum = kor + eng + math ;
					int avg = sum / 3 ;
					int hak = 0;
					if (avg >= 90) {
						hak = 'A';
					} else if(avg>=80) {
						hak = 'B';
					} else if(avg >=70) {
						hak = 'C';
					} else {
						hak = 'F';

					}
					
				}
	}

}
