package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		// ��¥ ���� Ŭ���� : ���� ����ϰ� �ִ� ��ǻ�� ����
		// Date Ŭ����(deprecate -> �������� ���� ���� �� ����)
		// Calendar Ŭ���� -> Date Ŭ���� ��� ��� ���� Ŭ����

		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yy.M.dd hh:mm:ss");
		System.out.println(sdf2.format(date));

		System.out.println(date.getYear() + 1900 + "��"); // 2020-1900=120
		System.out.println(date.getMonth()+1+"��");	// 0-11,
		System.out.println(date.getDate()+"��");	// 
		System.out.println(date.getHours()+"��");
		System.out.println(date.getMinutes()+"��");
		System.out.println(date.getSeconds()+"��");
		
		int k = date.getDay();	// 0-6, 0=> �Ͽ���, 6=>�����
		switch (k) {
		case 0: System.out.println("�Ͽ���");break;
		case 1: System.out.println("������");break;
		case 2: System.out.println("ȭ����");break;
		case 3: System.out.println("������");break;
		case 4: System.out.println("�����");break;
		case 5: System.out.println("�ݿ���");break;
		case 6: System.out.println("�����");break;
		case 7: System.out.println("�Ͽ���");break;
	
		}
	System.out.println("===============");
	
	// Calendar Ŭ���� : new ���� �� ����ϰ� ��ü ������
	// ��, ��, ��, �� , �� ȣ����: 1) get (��������.�ʵ�)  2) Calendar.�ʵ�
	// new ���� ������� �ʰ� ��ü ������ �Ѵ�. 
			Calendar now = Calendar.getInstance();
	 
	 System.out.println(now.get(Calendar.YEAR)+"��");
	 System.out.println(now.get(Calendar.MONTH)+1+"��"); // 0-11
	 System.out.println(now.get(Calendar.DATE)+"��"); 
	 System.out.println(now.get(Calendar.DAY_OF_MONTH)+"��");
	 System.out.println("===============");
	 System.out.println(now.get(Calendar.HOUR));        // 12�ð���
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); // 24�ð���
		
		// AM => 0 , PM => 1;
		int res = now.get(Calendar.AM_PM);
		if(res == 0) {
			System.out.println("AM  " + now.get(Calendar.HOUR)+"��");
		}else if(res == 1){
			System.out.println("PM  " + now.get(Calendar.HOUR)+"��");
		}
		System.out.println(now.get(Calendar.MINUTE)+"��");
		System.out.println(now.get(Calendar.SECOND)+"��");
		
		// ���� (1(�Ͽ���)-7(�����))
		res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 1: System.out.println("�Ͽ���");break;
		case 2: System.out.println("������");break;
		case 3: System.out.println("ȭ����");break;
		case 4: System.out.println("������");break;
		case 5: System.out.println("�����");break;
		case 6: System.out.println("�ݿ���");break;
		case 7: System.out.println("�����");break;
		}
	}
}
	
	
	
	
	
	
	
	
	