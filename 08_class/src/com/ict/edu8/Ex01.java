package com.ict.edu8;

// �������̽�: ���񽺸� �����ϴ� ���
//	ex)������  ����� �߻�޼ҵ��θ� �̷�������
//				�� ������ X (��ü ���� X)
//				�����ϰ� ���� ��� ����
//				* �������̽� ���� = ��ü ���� ȣȯ����
// 

public interface Ex01 {
	// (interface�� ���� ������) ��� �� static final 
	
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	// �߻� �޼ҵ尡 �ƴ϶� ���� �߻�
	//	public void play() {} �� body. ����� �������̽�
	
	//	�Ϲ����� �߻� �޼ҵ�
	public abstract void play();
	
	// interface ������ abstract ���� �� �ᵵ �����ƴ�
	public void sound() ; 

}
