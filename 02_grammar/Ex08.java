class Ex08 {
	public static void main(String[] args) {
		// 참조 자료형: 클래스를 자료형으로 사용함
		// String 클래스: 문자열 처리하는 기능을 갖고 있는 클래스
		// 기본자료형 x, 참고형
		// 자료형처럼 사용하려면 반드시 "" 사용해야함

		String str = "hello";
		System.out.println(str);

		// String + 연산 : String에서 +는 덧셈 아님. 문자연결자임
		// +연산하면 결과는 무조건 String

		str = "10000";
		int su = 10000;

		System.out.println(str + 10);
		System.out.println(su + 10);

		int su1 = 20;
		int su2 = 4;
		System.out.println(su1 + su2);
		System.out.println("결과 : " + su1 + su2);
		System.out.println("결과 : " + (su1 + su2));

		int su3 = su1 + su2;
		System.out.println("결과 : " + su3);

	}
}