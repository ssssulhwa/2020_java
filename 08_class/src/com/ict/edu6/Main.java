package com.ict.edu6;

public class Main {
	public static void main(String[] args) {
		
		// ��� : �ڽ� -> �θ�
		
		// super�� super() , this�� this()
		// this :	��ü ���ο��� �ڱ� �ڽ��� ��Ī�ϴ� �����
		// 			���������� ���������� �̸��� ���� ��
		// 			�������� �� this�� ����ؼ� �������� ���� �� �� ����

		// this([����]) :	'��ü�� ������'�� ��Ī�ϴ� �����
		// 					�����ڿ��� �ڽ��� �ٸ� �����ڸ� ȣ���� �� ���
		// 					�ݵ�� ������ ù �ٿ� �����ؾ� ��

		// super :	�θ� Ŭ������ ����ʵ带 ��Ī�ϴ� �����
		// 			�ڽ� Ŭ������ ���������� �̸��� ���� ��, �θ� Ŭ���� ����ʵ� �տ� �����
		// 			�θ� Ŭ���� ����ʵ� �տ� �����
		//

		// super([����]) :	�θ��� �����ڸ� ��Ī�ϴ� �����
		// 					�θ� �����ڸ� ȣ���� �� ���
		// 					�ݵ�� ������ ù �ٿ� �����ؾ� ��
		// 					this(), super() ���� ���Ұ� (������ ���� �Ǿ� �ִ� ��)
		
	
		
		Person s = new Student ("ȫ�浿 �л�", 24, 25000) ;
		Person t = new Teacher ("���浿 ����", 54, "�ڹ�") ;
		Person e = new Employee ("�Ѹ� ������", 45, "������") ;
		
		// ���� Person print() ������, Student(), Teacher(), Employee()�� print()�� �־ ���Ұ�` 
		s.print();
		t.print();
		e.print();
		
		
		
		//

	}
}