package com.ict.edu;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex03 {
	public static void main(String[] args) {

		// �迭 �����ϱ�
		int[] su = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };

		int tmp = 0; // �ڸ� �ٲٱ⸦ ���� ����
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {

				// su[i] > su[j] => ��������, su[i] < su[j] => ��������
				if (su[i] > su[j]) {

					// �ڸ� �ٲٱ�
					tmp = su[i]; // tmp = su[j];
					su[i] = su[j]; // su[j] = su [i];
					su[j] = tmp; // su[i] = tmp ;
				}
			}
		}

		// ����ϱ�
		for (int k : su) {
			System.out.print(k + " ");
		}
		System.out.println("============================");

		int[] su2 = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };

		// Arrays Ŭ������ �迭, ����, ����, list�� ��ȯ�ϴ� Ŭ����
		// sort() �޼ҵ�� ���������� ����
		Arrays.sort(su2);

		// ����ϱ�
		for (int k : su2) {
			System.out.print(k + " ");
		}
		System.out.println("============================");
		
	
	}
}