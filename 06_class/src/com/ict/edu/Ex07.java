package com.ict.edu;

public class Ex07 {
	private String name = "Ŀ�ǿ���" ; //��������
	private int su = 100 ;
	private int price = 1100 ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// ���������� �������� �̸� ���� ��
		// ���������� this ����
		// ���� : ���������� �������� �̸� ������ �켱������ ���������ϱ� ���������� ����ϰ� ��
		// ������ �켱������ ��������!�ϱ� ����������
		// ���������� �ش� �޼ҵ带 ȣ���� �� ������
		this.name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		price = price;
	}
	
}
