package com.ict.edu;

public class Ex11_main {
	public static void main(String[] args) {

	// ��ü ����
	 Ex11 t1 =new Ex11();
	 
	 System.out.println(t1.getName());
	 System.out.println(t1.getAge());
	 System.out.println(t1.getAddr());
			 
	 // t1 �����͸� �����ϱ�
	 // �Ѹ�, 5000, �������� �����ϱ�
	 
	 t1.setName("�Ѹ�");
	 t1.setAge(5000);
	 t1.setName("����");
	 System.out.println(t1.getName());
	 System.out.println(t1.getAge());
	 System.out.println(t1.getAddr());
	 System.out.println("==============");
	 
	 Ex11 t2 = new Ex11();
	 System.out.println(t2.getName());
	 System.out.println(t2.getAge());
	 System.out.println(t2.getAddr());
	 System.out.println("==============");
	 
	 
	 
}
}