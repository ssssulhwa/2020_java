package com.ict.edu;

import java.util.Random;


public class Ex02 {
	public static void main(String[] args) {
		// Random Ŭ������ ���� ��ü �����ؼ� ���
		Random ran = new Random();
		int su = ran.nextInt(10)+1; // 1-10
		System.out.println();
		System.out.println(su);
	}
}
