class Ex11 {

	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수
		// 국어 90 영어 80 수학 80
		// 총점과 평균 구하기
		// 출력은 이름, 총점, 평균만 출력 ( 단, 평균은 소수점 첫째자리까지 구하기)

		// 1. 데이터 입력
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;

		// 2. 데이터 처리 ( 비지니스 로직) : 저장된 정보를 활용해 원하는 정보 구하기
		int sum = kor + eng + math;
		double avg = (int) (sum / 3.0 * 10) / 10.0;

		// 3. 원하는 정보 출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

		// 카페모카 6500원. 친구랑 둘이 15000원을 내고 주문했다.
		// 잔돈 얼마 남았나 (단, 부가세 10% 포함해서 계산하기)

		// 1. 데이터 입력
		// 2. 데이터 가공 (비지니스 로직)
		// 3. 정보 출력

		String coffee = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		int total = dan * su;
		int vat = (int) (total * 0.1);
		int output = input - (total + vat);
		System.out.println("잔돈 : " + output);

	}
}