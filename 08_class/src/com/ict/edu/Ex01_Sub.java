package com.ict.edu;

//�ڽ� Ŭ���� : �ڽ�Ŭ�������� �θ�Ŭ������ ��Ӱ��� ����
public class Ex01_Sub extends Ex01_Sup{
	String name = "ȫ����";
	int age = 13;
	
	public Ex01_Sub() {
		//	super(); �θ������ ȣ��  this(); �����Ǿ����� 
		//  �θ������ ȣ��					  �ڽ��� ����
		System.out.println("�ڽ�Ŭ���� ������ : " + this);
	}
	
	public void play() {
		System.out.println(name); // ȫ����
		
		// ���������� �켱
		String name = "ȫ�β�";
		System.out.println(name); // ȫ�β�
		
		
		// ����X, ����X, �θ�O
		System.out.println(addr); 
		System.out.println(this.addr); 
		System.out.println(super.addr); 
		
		int age = 3 ;
		System.out.println(age); // 3 (����)
		System.out.println(this.age); // 13 (����)
		System.out.println(super.age); // 57 (�θ�)	
		
	}
	
	public void play2() {
		// private �� ����̿��� ���� �Ұ�
		// System.out.println(dog);
		System.out.println(GENDER);
		System.out.println(car);
	}
}
