package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : ���ǽ��� �� �϶��� ������ �� ���� ������ ó��
		// ���� : if (���ǽ�) {
		//				���ǽ��� �� �϶� ���� ����;
		//				���ǽ��� �� �϶� ���� ����;
		//		} else {
		// 		���ǽ��� ���� �� �� ���� ����;
		// 		���ǽ��� ���� �� �� ���� ����;
		// 		}
		
		//  int k1�� 60 �̻��̸� �հ�, ������ ���հ�
		int k1 = 78 ;
		String res = "" ;
		if (k1 >= 60) {
			res = "�հ�" ;
			
		} else {
			res = "���հ�" ;
					

		}
		System.out.println("��� : "+ res) ;
		
		// Ȧ�� ¦�� �Ǻ�
		int k2 = 42 ;
		if (k2 % 2 == 0) {
			res = "¦��" ;
			
		} else {
			res = "Ȧ��" ;

		}
		System.out.println("��� : "+ res) ;
		
		// �빮��, �ҹ��� �Ǻ�
		char k3 = 'q';
		if (k3>='a' && k3<='z') {
			res = "�ҹ���" ;
			
		} else {
			res = "�빮��";

		}
		System.out.println("��� : "+ res) ;
		
		// 1 �Ǵ� 3 �̸� ����, �ƴϸ� ���� 
		int k4 = 2 ;
		if (k4 == 1 || k4 == 3) {
			res = "����" ;
			
		} else {
			res = "����";
		}
		System.out.println("��� : "+ res) ;
		
		// �ٹ��ð� 8�ð� ������ �ñ� 8590
		// 8�ð� �ʰ��� �ð� ��ŭ�� 1.5�� ������
		// ���� �ٹ��� �ð��� 10�ð�
		// �󸶸� �޾ƾ� �ϴ°�
		int time = 7 ;
		int dan = 8590 ;
		int pay = 0 ;
		if (time > 8) {
			pay = (8*dan) + (int)((time-8) * dan * 1.5) ;
		} else {
			pay = time * dan ;
		}
		System.out.println("��� : "+ pay) ;
		
		// �� �� �� ū ���� ��� �Ͻÿ�
		int k5 = 42;
		int k6 = 32 ;
		int result = 0 ;
		if (k5 > k6) {
			result = k5;
		} else {
			result = k6 ;
		}
		System.out.println("��� : "+ result) ;
		
		
		
	}
}
