package com.ict.edu5;

public abstract class Animal {
	// �߻� Ŭ���� : �߻� �޼ҵ带 ���� �ִ� Ŭ����
	//	(abstract)	 �Ϲ����� ����ʵ�� ����޼ҵ嵵 ���� �� ����
	
	// �߻� �޼ҵ� : body({���೻��})�� ���� �޼ҵ� 
	//				 �ݵ�� abstract ���� ����ؾ� ��
	
	int su1 = 10;				// �ν��Ͻ� ����
	static int su2 =20;			// static ����
	final int SU3 = 30;			// �ν��Ͻ� ����
	static final int SU4 = 40;	// static ���
	
	// �ν��Ͻ� �޼ҵ�
	public void play() {
		su1++;
		su2++;
		// SU3++;	����� �� ����Ұ�
		// SU4++;	����� �� ����Ұ�
		
	}
	// static �޼ҵ�
	public static void prn() {
		int k1 = 100;
		// ������������ static ���Ұ�
		// static int k2 = 200;
		
		// static �޼ҵ�� ������������ static�� ��밡��
		// System.out.println(su1);
		System.out.println(su2);
		// System.out.println(SU3);
		System.out.println(SU4);
	}
	
	// �߻�޼ҵ�: �ݵ�� abstract ��� (Ŭ������ �ٿ�����)
	public abstract void like() ;
}
