package com.ict.edu;

public class Ex01 {
	// - ��Ӱ��� : �ڽ�Ŭ������ �θ� Ŭ������ ����ʵ�, ����޼ҵ带 ��ü ��������
	// ������� ��� �� �� �ִ� Ŭ�������� ���踦 ���Ѵ�.
	// �ڽ�Ŭ������ �θ�Ŭ������ ���踦 �δ´�.
	// �ڽ�Ŭ���� extends �θ�Ŭ����
	// - �ڹٿ����� ���� ��Ӹ� �� �� ����. �� �θ�Ŭ������ �ϳ��� �����Ѵ�.
	// - ��� Ŭ������ Object��� Ŭ������ ��ӹް� �ִ�.
	// ������ �̸��� ���� �� : �������� > �������� > �κ�Ŭ����

	public static void main(String[] args) {
		Ex01_Sub test = new Ex01_Sub();
		System.out.println(test);
		System.out.println("==============================");
		test.play();

		// �θ�Ŭ������ �޼��� ��밡��
		test.prn1();

		// static�� ��Ӱ� ������� ��밡��
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
		Ex01_Sup.prn2();

		// private �� ����̿��� ���� �Ұ�
		// System.out.println(test.dog);

	}

}
