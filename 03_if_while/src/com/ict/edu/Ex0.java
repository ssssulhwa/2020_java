package com.ict.edu;

public class Ex0 {
	public static void main(String[] args) {
		
	}



	// int k1�� 60�̻� �հ�
	int k1 = 59;
	String str = "�ʱⰪ" ;{
	if (k1 >=60) {
		str = "�հ�" ;
		System.out.println("���:" + str);
	
	}
	// int k2�� 60 �̻��̸� �հ� , 60�̸� ���հ�
	int k2 = 59 ;
	str = "�ʱⰪ" ;
	if(k2>=60) {
		str = "�հ�" ;
	}
	if (k2<60) {
		str = "���հ�" ;
	}
	System.out.println("��� :"+str);

	
	// Ȧ��, ¦�� �Ǻ�
	int k4 = 7 ;
	str = "Ȧ��" ;
	if (k4 % 2 == 0) {
		str = "¦��" ;
	}
	System.out.println("��� :" + str);
	
	}
}
