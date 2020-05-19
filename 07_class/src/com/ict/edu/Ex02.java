package com.ict.edu;

public class Ex02 {
	// String Ŭ���� �ֿ� �޼ҵ�
	public static void main(String[] args) {
		String str = "ICT���簳�߿� 2������";

		// 1.charAt(int index) : char
		// ��ġ������ ���ڷ� ������ �ش� ��ġ�� ���ڸ� ��ȯ�Ѵ�.
		char c1 = str.charAt(5);
		System.out.println(c1);
		System.out.println("=============");

		// ��� �빮�ڷ� ������ ( �빮�ڿ� �ҹ����� ���̴� 32 �̴�)
		String str2 = "���ѹα� I love You 123";
		for (int i = 0; i < str2.length(); i++) {
			char c2 = str2.charAt(i);
			// �ҹ��� ã��
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();
		System.out.println("=============");

		// 2. concat(String str) : String
		// ���� ���ڿ��� ���� ���ڿ��� ��ģ��.
		String str3 = "���ѹα�";
		String str4 = "KOREA";
		String result = str3.concat(str4);
		System.out.println(result);
		System.out.println(str3 + str4);
		System.out.println("=============");

		// 3. equals(Object anObject) : boolean
		// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false ( ��ҹ��� ����)
		// 4. equalsIgnoreCase(String anotherString) : boolean
		// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false ( ��ҹ��� ���� ����)
		String str5 = "Korea";
		String str6 = "KOREA";

		if (str5.equals(str6)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		System.out.println("=============");

		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		System.out.println("=============");

		// 5. format(String format, Object... args)
		// ������ �����ϰ� ���Ŀ� ���� ����
		String str7 = "ICT ���� ���߿�";
		String res = String.format("%s", str7);
		System.out.println(res);
		System.out.println("=============");

		// ���� �ڸ��� ����
		res = String.format("%25s", str7);
		System.out.println(res);
		System.out.println("=============");

		// ���ڶ� �ڸ��� ���X
		res = String.format("%6s", str7);
		System.out.println(res);
		System.out.println("=============");

		// 6. getBytes() : byte[]
		// �ش� ���ڿ��� byte[]�� ��ȯ��Ŵ
		// ���� ������Ҷ� ��� (��ҹ���,���ڸ� ����, �����̿��� ���ڴ� �ȵ�)
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("=============");

		// �ݴ�� �ش� byte[]�� ���ڿ��� �����
		String str9 = new String(b);
		System.out.println(str9);
		System.out.println("=============");

		// 7. indexof(int ch), indexOf(String str) : int
		// char �̳� String�� ������ �ش� ���ڿ��� char�̳� String�� ��ġ�� �˷���
		String str10 = "BufferedReader";

		// 'r'�� ��ġ���� ã��
		int k1 = str10.indexOf('r'); // 012345��°
		System.out.println(k1);
		System.out.println("=============");

		// ã�� ���ڳ� ���ڿ��� ������ -1�� ��µ�
		k1 = str10.indexOf('K');
		System.out.println(k1);
		System.out.println("=============");

		k1 = str10.indexOf("er");
		System.out.println(k1);
		System.out.println("=============");

		// 7. indextOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// ���⼭ int fromIndex�� ������ġ ����
		// 2��°, 3��° ���ڳ� ���ڸ� ã�� ����

		// ������ 'r'�� ��ġ���� 5. 6���� �ٽ� 'r'�� ã���� �ι�° 'r'�� ã�� �� ����
		k1 = str10.indexOf('r', 6);
		System.out.println(k1);

		k1 = str10.indexOf('r', str10.indexOf('r') + 1);
		System.out.println(k1);

		k1 = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(k1);
		System.out.println("=================");

		// 8. lastIndexOf(int ch), lastIndexOf(String str) : int
		// ������ ���ڳ� ���ڿ��� ã�� �� ���

		k1 = str10.lastIndexOf('d');
		System.out.println(k1);

		k1 = str10.lastIndexOf("er");
		System.out.println(k1);

		// 9. length() : int -> 1������ (index�ƴ�)
		// �ش� ���ڿ��� ���̸� ������ ( for���� ���� ����)
		String str11 = "abcABC123������";
		k1 = str11.length();
		System.out.println("���� : " + k1);

		// 10. replace( char oldChar, char newChar), replace(String oldstr, String
		// newstr) : string
		// ���ο� ���ڳ� ���ڿ��� �޾Ƽ� ġȯ�ϱ�
		String str12 = "���ѹα�";
		String str13 = str12.replace("���ѹα�", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		System.out.println("=====================");

		str12 = str12.replace("��", "�� �� ");
		System.out.println(str12);

		// 11. contains(String s) : boolean, ���ڿ� char ����
		// ���ڷ� ���� ���ڿ��� �ش� ���ڿ��� �����ϸ� true, ������ false
		String str14 = "KOREA @ ���ѹα�";
		boolean b1 = str14.contains("0");
		System.out.println(b1);

		b1 = str14.contains("����");
		System.out.println(b1);

		b1 = str14.contains("$");
		System.out.println(b1);

		b1 = str14.contains("KOR");
		System.out.println(b1);

		b1 = str14.contains("kor");
		System.out.println(b1);
		System.out.println("==================");

		// 12. isEmpty() : boolean
		// �ش� ���ڿ��� ������ true, ���� ������ false
		String str15 = "";
		b1 = str15.isEmpty();
		System.out.println(b1);

		str15 = "���ѹα�";
		b1 = str15.isEmpty();
		System.out.println(b1);
		System.out.println("==================");

		// 13. split (String regex) : String[]
		// split(String regex, int limit) : String[]
		// String regex : ������(��������), int limit => ���� �迭�� ũ��
		String str16 = "���,����, ����,������,���ξ���,�θ���";
		String[] arr1 = str16.split(",");
		for (String k : arr1) {
			System.out.println(k);
		}
		System.out.println("=========================");

		String[] arr2 = str16.split(" ");
		for (String k : arr2) {
			System.out.println(k);
		}
		System.out.println("=========================");

		String[] arr3 = str16.split(",", 3);
		for (String k : arr3) {
			System.out.println(k);
		}
		System.out.println("=========================");

		String[] arr4 = str16.split(",", 7);
		for (String k : arr4) {
			System.out.println(k);
		}
		System.out.println("=========================");

		// 14. substring(int beginIndex) : String
		// ������ġ~������ ���ڿ� ����
		// substring(int beginIndex, int endIndex) : String
		// ������ġ~ �� ��(����ġ ����X)���� ���ڿ� ����
		String str17 = "010-7777-9999";
		String msg = str17.substring(4);
		System.out.println(msg);
		System.out.println("===================");

		msg = str17.substring(4, 8); // 4~7 ����: 8-4
		System.out.println(msg);
		System.out.println("===================");

		msg = str17.substring(0, 3);
		System.out.println(msg);
		System.out.println("===================");

		String str18 = "770707-1";
		msg = str18.substring(str18.indexOf("-") + 1, str18.indexOf("-") + 2);
		System.out.println(msg);
		System.out.println("===================");

		// ���� : 010-7777-9999 => 010-7777-xxxx

		// 15. toLowerCase() : String
		// ��� �빮��-> �ҹ��ڷ�
		// 16. toUpperCase() : String
		// ��� �ҹ���-> �빮�ڷ�
		String str19 = "kOREa 19";
		msg = str19.toLowerCase();
		System.out.println(msg);

		msg = str19.toUpperCase();
		System.out.println(msg);

		msg = str19.substring(0, 1).toUpperCase() + str19.substring(1).toLowerCase();
		System.out.println(msg);
		System.out.println("===================");

		// 17. toString() : String
		// object�� toString() : ��� ��ü�� ��� ����, ��ü�� �����ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�(�������̵� ��
		// �� ���)
		// String�� toString() : ���ڿ� ��ü�� ��ȯ
		String str20 = "java 8 �ڹ� 8";
		msg = str20.toString();
		System.out.println(msg);
		System.out.println(str20);
		System.out.println(str20.toString());

		// 18. trim() : String
		// �ش� ���ڿ��� ��,�� ���� ����, �߰��� ������ ���� ����
		String str21 = "	java �ڹ�	JAVA ";
		msg = str21.trim();
		System.out.println(str21);
		System.out.println(msg);
		;
		System.out.println(str21.length());
		System.out.println(msg.length());
		System.out.println("===========================");

		// 18. valueOf(�ڷ���) : static String
		// � �ڷ����̵� String���� ���� ��Ŵ
		boolean bo1 = true;
		char ch1 = 'A';
		int num1 = 34;
		long num2 = 58L;
		float num3 = 3.14f;
		double num4 = 342.12;

		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("===========================");

		// �ڷ��� + 1
		// System.out.println(bo1+1); boolean�� + ����
		System.out.println(ch1 + 1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);
		System.out.println("===========================");

		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		System.out.println("==============");

		System.out.println(bo1 + "1");
		System.out.println(ch1 + "1");
		System.out.println(num1 + "1");
		System.out.println(num2 + "1");
		System.out.println(num3 + "1");
		System.out.println(num4 + "1");
		System.out.println("==============");

		System.out.println(bo1 + "");
		System.out.println(ch1 + "");
		System.out.println(num1 + "");
		System.out.println(num2 + "");
		System.out.println(num3 + "");
		System.out.println(num4 + "");
		System.out.println("==============");

		// 20. Wrapper class :
		// - �� �ڷ��� (�⺻ �ڷ���)�� ���¸� ���� ���ڿ��� ��¥ �ڷ������� �����Ű�� Ŭ������
		// - ���� �ǹ�: �⺻ �ڷ����� ��ü�� ���� �� ����ϴ� Ŭ���� (�ڵ����� �������)

		// ���ڿ��� boolean������ ���� : Boolean.parseBoolean()
		// "true","false"�� ��� ����
		String message = "true";
		boolean m1 = Boolean.parseBoolean(message);
		if (m1) {
			System.out.println("���漺��");
		} else {
			System.out.println("�������");
			System.out.println("==============");

			// 20-2.���ڿ��� int������ ���� : Integer.parseInt()
			message = "241";
			int m2 = Integer.parseInt(message);
			System.out.println(message + 10);
			System.out.println(m2 + 10);
			System.out.println("==============");

			// 20-3. ���ڿ��� long������ ���� : Long.parseLong();
			// "����" => 0, "����L" => X
			// message = "241L"; // �����߻�
			 message = "241";
			Long m3 = Long.parseLong(message);
			System.out.println(message + 10);
			System.out.println(m3 + 10);
			System.out.println("==============");
			
			// 20-4. ���ڿ��� float�� ���� : Float.parseFloat()
			message = "3.14f";
			float m4 = Float.parseFloat(message);
			System.out.println(message + 10);
			System.out.println(m4 + 10);
			System.out.println("==============");
			
			// 20-5. ���ڿ��� double�� ���� : Double.parseDouble()
			message = "3.14";
			double m5= Double.parseDouble(message);
			System.out.println(message + 10);
			System.out.println(m5 + 10);
			System.out.println("==============");
			
			// 20-6. ���ڿ��� char�� ���� : X �Ұ�
			// String.classAt() ���
			message = "A";
			char m6 = message.charAt(0);
			System.out.println(message );
			System.out.println(m6);
			
			// 21. toCharArray() : char[]
			// - �ش� ���ڿ��� char[]�� �������
			// - ��� ���� ��밡�� (getBytes()�� ����,���ڸ� ����)
			message = "java �ڹ� JAVA �������� 2020";
			byte[] m7 = message.getBytes();	//����,���ڸ� ����
			for (byte k : m7) {
				System.out.println(k);
			}
			
			System.out.println();
			char[] m8 = message.toCharArray();
			for (char k : m8) {
				System.out.println(k);
			}
				
			}
			
			
			
			
			
			
			
				}
}