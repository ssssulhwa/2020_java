package com.ict.edu;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// ��Ŭ�������� API  ȣ�� : �ش� Ŭ������ shift + f2
		// ���� : Math.random(), Random Ŭ����
		// 1. Random Ŭ����
		Random ran = new Random();
		
		// ���� �ڷ����� ������ �߻� : �ڷ��� ���� �ȿ��� ���� �߻�
		System.out.println("boolean�� : " + ran.nextBoolean());
		System.out.println("int�� : " + ran.nextInt());
		System.out.println("long�� : " + ran.nextLong());
		
		// float�� double�� 0.0 �̻� 1.0�̸����� ���� �߻�
		System.out.println("float�� : " + ran.nextFloat());
		System.out.println("double�� : " + ran.nextDouble());
		
		// Ư�� ������ �����ϴ� ��� : 
		// 1) nextInt(����) : 0 ~ ���� ������ �������� ���� �߻�
		System.out.println("�������� :" + ran.nextInt(5)); // 0-4�������� ���� (5�� ����X)
		// 2) (int)(nextDouble() * ����) : 0 ~ ���� ������ �������� ���� �߻�
		System.out.println("�������� :" + (int)(ran.nextDouble()*5));	// 0-4�������� ���� (5�� ����X)
		
		// 2. Math Ŭ���� : ��ü �޼ҵ尡 static�̹Ƿ� ��ü ���� ���� ȣ�� ����
		// 1) random()
		System.out.println(Math.random());	//0.0 �̻� ~ 1.0 �̸�
		// Ư�� ���� ���� ����
		System.out.println((int)(Math.random()*6));	// 0~5
		
		// 2) abs: ���밪 ����
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		
		// 3) ceil(double x), �ø�, round(double x) �ݿø�, floor(double x) ����
		System.out.println("�ø� " + Math.ceil(3.45));	// 4
		System.out.println("�ø� " + Math.ceil(3.55));	// 4
		System.out.println("�ݿø� " + Math.round(3.45));	// 3
		System.out.println("�ݿø� " + Math.round(3.55));	//4
		System.out.println("���� " + Math.floor(3.45));	// 3
		System.out.println("�ݿø� " + Math.floor(3.55));	// 3
		
		// 4) max (�ڷ��� a, �ڷ��� b) : �� �� ū �� ���
		// 5) max (�ڷ��� a, �ڷ��� b) : �� �� ���� �� ���
		System.out.println("max : " + Math.max(44.6, 45));
		System.out.println("max : " + Math.min(44.6, 45));
		
		// 6) pow (double a, double b) : ��
		System.out.println(Math.pow(2,3));	// 2�� 3�� => 8.0
		System.out.println(Math.pow(3,2));	// 3�� 2�� => 9.0
		
		
		
		
		
		
		
		
		
		
		
	}
}
