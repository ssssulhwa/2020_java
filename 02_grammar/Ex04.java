class Ex04 {

	private static char[] num1;

	public static void main(String[] args) {
		// 숫자: 정수형(소숫점 없음) < 실수형(소숫점 있음)
		// 정수: byte < short < int < long
		// 정수형의 기본 int

		// 실수형: float < double
		// 실수형의 기본 double

		// byte: 정수형 중 가장 작은 단위 (-128~127 사이의 숫자만 저장 가능)

		byte b1 = 127;
		System.out.println(b1);

		// 계산식은 결과만 저장됨
		// byte b2 = 15 + 120 ;
		// System.out.println(b2);

		// short : -32768 ~ 32767 사이의 값만 저장
		short s1 = -32768;
		System.out.println(s1);

		short s2 = 32767;
		System.out.println(s2);

		// int와 long은 숫자 범위 외울 필요 없음
		// 앞으로 일반적인 int 사용
		// 아주 큰 정수를 사용할 때만 long 사용

		int su1 = 247;
		int su2 = 7777777;
		System.out.println(su1);
		System.out.println(su2);

		// long: int보다 더 넓은 범위 갖고 있음
		// 기본적으로 숫자 뒤 L 또는 l 붙임 (생략가능)
		long numl = 124L;
		System.out.println(num1);

		// 작은 자료형이 큰 자료형에 저장되는 것은 오류 안남
		long num2 = 124;
		System.out.println(num2);

		// 정수 sul를 long num3에 저장
		long num3 = su1;
		System.out.println(num3);

		// short s1을 long num4에 저장
		long num4 = s1;
		System.out.println(num4);

		// short s1을 int su3에 저장
		int su3 = s1;
		System.out.println(su3);

		char c1 = '가';
		System.out.println(c1);

		int su4 = c1;
		System.out.println(su4);
	}
}