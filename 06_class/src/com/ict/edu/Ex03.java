package com.ict.edu;

public class Ex03 {
	// ����޼ҵ� : ���, ���
	// ��ȯ�� : �޼ҵ带 ȣ���ϸ� �ش� �޼��带 �����ϰ� ȣ���� ������ �ǵ��ư�
	// (return)	���� �� ����� �ǵ��� �� ���, ����� ���� �ڷ����� ����
	// 			���� ����� �� ������ void ����� ���
	
	int sound = 10 ;
	double sound2 = 10.0 ;
	public void add() {
		System.out.println("add_1");
		sound++ ;
		System.out.println("add_2");
	}
	
	public void sub() {
		sound-- ;
		return ;
	}
	
	public int mul() {
		System.out.println("mul_1");
		return sound;
	}
	
	// �ڷ����� �ٸ��� ����
	// public int div() {
	// return sound2	
	//	}
	
	// �ڷ����� �޶� ��ȯ���� ũ�� ����X
	public double plus() {
		return sound ;
		
		
		
		
		
	}
}

