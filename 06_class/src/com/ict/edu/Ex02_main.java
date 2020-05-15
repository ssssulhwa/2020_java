package com.ict.edu;

import java.util.Random;
public class Ex02_main {
	public static void main(String[] args) {
		
		// static ����ʵ� ȣ��
		System.out.println(Ex02.eng);
		System.out.println(Ex02.com);
		
		// static �ƴϴϱ� ȣ�� �Ұ�
		// System.out.println(Ex02.kor);
		// System.out.println(Ex02.math);
		
		// Ex02 Ŭ���� ��ü �����
		// Ŭ�����̸� �������� = new ������ ;
		// Ex02�� ������ ������ �⺻ �����ڷ� ����
		Ex02 test = new Ex02() ;
		
		// ����ʵ� ȣ�� ; ��ü��������.����ʵ�
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.math);
		System.out.println(test.com);
		
		System.out.println(test);
		
		// API�� �̿��ؼ� static �޼ҵ�� �ν��Ͻ� �޼ҵ� ȣ���ϱ�
		// API�� �����ϴ� Random Ŭ������ nestInt(), nextInt(int bound), nextDouble()�� ����ϴ� ��
		
		// API�� �����ϴ� Random Ŭ������ nestInt(), nextInt(int bound), nextDouble()�� static�� �ƴϹǷ� Ŭ������ ��ü�� ���� ����ؾ� ��
		
		// 1. Ŭ������ ��ü�� ����� ���
		// 	  Ŭ���� �������� = new ������
		Random ran = new Random() ;
		// nextInt() : int ���� �ȿ��� �������� ���� ����
		int res = ran. nextInt();
		System.out.println(res);
		System.out.println("===========");
		
		// nextInt(����) : ��ȯ�� ( 0-���� ������)
		res = ran.nextInt(6); // 0-5����
		System.out.println(res);
		System.out.println("==============");
		
		// �������� ���� 0.0 ~ 1.0 �̸��� �Ǽ� (�Ҽ��� ���ڸ��� X)
		double res2 = ran.nextDouble();
		System.out.println(res2);
		System.out.println("-------------");
		
		// Math Ŭ������ �޼ҵ���� static�̹Ƿ� ��ü �������� ��� ����
		// Ŭ�����̸�.����ʵ�,Ŭ�����̸�.����޼ҵ�� ���
		System.out.println(Math.random());	// 0.0 �̻� ~ 1.0 �̸�
		
		// ���ϴ� ���������� �� ������ �� ����		
		System.out.println((int)(Math.random()*6));	// 0-5 ����
		
		
		
		
		
	}

}
