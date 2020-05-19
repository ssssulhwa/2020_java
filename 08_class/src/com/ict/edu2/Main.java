package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DCaPhone dca = new DCaPhone();
		dca.call();  // �θ�
		dca.sms();   // �θ� 
		dca.dca();   // �ڽ�
		System.out.println("==================");
		
		MP3Phone mp3 = new MP3Phone();
		mp3.call();    // �θ�
		mp3.sms();     // �θ� 
		mp3.sound();   // �ڽ�
		System.out.println("==================");
		
		// �ڽ� Ŭ���� = �ڽ� Ŭ����
		GamePhone gp = new GamePhone();
		gp.call();   // �θ�
		gp.sms();    // �θ�
		gp.play();   // �ڽ�
		System.out.println("==================");
		
		// �θ�Ŭ���� = �ڽ�Ŭ����
		Phone p1 = new DCaPhone();
		p1.call();   // �θ�
		p1.sms();    // �θ�
		// p1.dca();   // �ڽ� (�����߻�)
		
		Phone p2 = new MP3Phone();
		p1.call();   // �θ�
		p2.sms();    // �θ�
		// p2.sound();
	}
}
