class Ex08 {
	public static void main(String[] args) {
		// ���� �ڷ���: Ŭ������ �ڷ������� �����
		// String Ŭ����: ���ڿ� ó���ϴ� ����� ���� �ִ� Ŭ����
		// �⺻�ڷ��� x, ������
		// �ڷ���ó�� ����Ϸ��� �ݵ�� "" ����ؾ���

		String str = "hello";
		System.out.println(str);

		// String + ���� : String���� +�� ���� �ƴ�. ���ڿ�������
		// +�����ϸ� ����� ������ String

		str = "10000";
		int su = 10000;

		System.out.println(str + 10);
		System.out.println(su + 10);

		int su1 = 20;
		int su2 = 4;
		System.out.println(su1 + su2);
		System.out.println("��� : " + su1 + su2);
		System.out.println("��� : " + (su1 + su2));

		int su3 = su1 + su2;
		System.out.println("��� : " + su3);

	}
}