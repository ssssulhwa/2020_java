class Ex15{
	public static void main(String[] args){


	// �������� : &&(AND, ����), ||(OR, ����), !(NOT, ������)
	// ���������� ���(������ ����) : boolean��, �񱳿���, ������
	// �������� ���: boolean�� ��, ���ǽĿ� ����

	// AND (&&, ����)
	// - �־��� ������ ��� true �� �� ����� true
	// - �־��� ���ǵ� �� false�� ������ ����� false
	// - false�� ������ ���� ������ ����
	// '- a >= 10 && a <= 20'�� �ǹ̴� a�� 10���� 20������ ������ �ǹ�
	
	int su1 = 10 ;
	int su2 = 7 ;
	boolean result = false;

	result = (su1 >=7) && (su2 >=5); // true = true && true
	System.out.println("��� : " + result);
	
	result = (su1 >=7) && (su2 <=5); // false = true && false
	System.out.println("��� : " + result);
	
	result = (su1 <=7) && (su2 >=5); // false = false && true
	System.out.println("��� : " + result);

	result = (su1 >=7) && (su2 >=5); // false = false && false
	System.out.println("��� : " + result);
	System.out.println("=========================");

	result = ((su1 = su1 + 2)> su2) && (su1 == (su2 = su2 + 5));
	System.out.println("��� : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);
	
	System.out.println("=========================");

	// AND�� false�� ������ ����� false, �� ������ ���� ����
	result = ((su1 = su1 + 2)< su2) && (su1 == (su2 = su2 + 5));
	System.out.println("��� : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);
	
	su1 = 34;
	// su1�� ���� 20~30 ������ ���ΰ�?
	result = (su1>=20) && (su1<=30);
	System.out.println("��� : " + result);

	// char c1�� �ҹ����ΰ�?-�ƽ�Ŷ�ڵ�
	char c1 = 'G' ;

	result = (c1>='a') && (c1<='z');
	System.out.println("��� : " + result);


	
	



	
}
	
}