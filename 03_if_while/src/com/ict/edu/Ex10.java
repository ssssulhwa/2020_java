package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
		// break�� continue
		// break : ���� ��ġ�� ����� Ż�� �� �� ����ϴ� �����
		// continue : continue�� ���� ���๮�� �����ϰ� ���� ȸ���� �����ϴ� ����� 
		//			  continue�� ���� ���๮�� �����ϰ� �ٷ� ���������� ��, �ش� ȸ���� ����
		// break, continue �� �� if���� �Բ� ����
		
		// 1-10���� ���
			for (int i = 1; i < 11; i++) {
				System.out.print(i + "\t"); //t�� tab�� ����
				
			}
			System.out.println();
			
			// i�� 6�� �� break; // 6�� ���� ����
			for (int i = 1; i < 11; i++) {
				if (i == 6) break;
				System.out.print(i + "\t"); //t�� tab�� ����
				
			}
			System.out.println();
			
			// i�� 6�� �� continue; //6�� ���� ����
			for (int i = 1; i < 11; i++) {
				if (i == 6) continue;
				System.out.print(i + "\t"); //t�� tab�� ����
				
			}
			System.out.println();
			
			// 0-10 ¦�� ���
			for (int i = 0; i < 11; i++) {
				if(i % 2 == 0) {
					System.out.print(i+ "");
				}
			}
			System.out.println();
			
			// ¦���� �������= Ȧ���� ������� ����
			for (int i = 0; i < 11; i++) {
				if(i % 2 == 1) continue;
					System.out.print(i+ " ");
			
			}
			System.out.println();
			
			
			
			
	}

}
