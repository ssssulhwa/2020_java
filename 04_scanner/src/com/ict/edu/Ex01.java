package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// java.lang ��Ű�� �ȿ� �����ϴ� Ŭ������ �ƹ��� ���� ���� ��� ����
		// �ٸ� ���� �����ϴ� Ŭ������ �ݵ�� import�� �ؾ� ���� �ȳ�
		// import ���: �ش� Ŭ���� ���� �ڿ��� ctrl + space ������
		//				ctrl + shift + o
		// Scanner Ŭ���� : Ű���� ������ �Է� �޾Ƽ� ó���ϴ� Ŭ����
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("����� �̸� : ");
		  
		  // �Է��� ������ string�� ��� ó�����
		  String name = sc.next();
		  System.out.println("�Է��� �̸� : " + name);
		  
		  // �Է��� ������ ����(����)�� ó�����
		  System.out.println("����� ���� : ");
		  int age = sc.nextInt(); 
		  System.out.println("�Է��� ���� : " + age);
		  
		  // �Է��� ������ ����(�Ǽ�)�� ó�����
		  System.out.println("����� Ű : ");
		  double height = sc.nextDouble();
		  System.out.println("�Է��� ���� : " + height);
		  
		// �Է��� ������ boolean���� ó�� �ϴ� ���
			System.out.print("����� �����Դϱ�?(true/false)");
			boolean gender = sc.nextBoolean();
			if(gender) {
				System.out.println("����� �����Դϴ�.");
			}else {
				System.out.println("����� �����Դϴ�.");
				
				// sc���� char(�� ����)ó�� ����. 
				// ���߿� String���� char ó���ϴ� ����� ����ؾ� �� 
			}
	}

}
