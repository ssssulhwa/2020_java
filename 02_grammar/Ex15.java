class Ex15{
	public static void main(String[] args){


	// 논리연산자 : &&(AND, 논리곰), ||(OR, 논리함), !(NOT, 논리부정)
	// 논리연산자의 대상(들어오는 정보) : boolean형, 비교연산, 논리연산
	// 논리연산의 결과: boolean형 즉, 조건식에 사용됨

	// AND (&&, 논리곰)
	// - 주어진 조건이 모두 true 일 때 결과는 true
	// - 주어진 조건들 중 false를 만나면 결과는 false
	// - false를 만나면 이후 연산은 안함
	// '- a >= 10 && a <= 20'의 의미는 a는 10부터 20까지의 범위를 의미
	
	int su1 = 10 ;
	int su2 = 7 ;
	boolean result = false;

	result = (su1 >=7) && (su2 >=5); // true = true && true
	System.out.println("결과 : " + result);
	
	result = (su1 >=7) && (su2 <=5); // false = true && false
	System.out.println("결과 : " + result);
	
	result = (su1 <=7) && (su2 >=5); // false = false && true
	System.out.println("결과 : " + result);

	result = (su1 >=7) && (su2 >=5); // false = false && false
	System.out.println("결과 : " + result);
	System.out.println("=========================");

	result = ((su1 = su1 + 2)> su2) && (su1 == (su2 = su2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);
	
	System.out.println("=========================");

	// AND는 false를 만나면 결과는 false, 뒤 조건은 연산 안함
	result = ((su1 = su1 + 2)< su2) && (su1 == (su2 = su2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);
	
	su1 = 34;
	// su1의 값이 20~30 사이의 값인가?
	result = (su1>=20) && (su1<=30);
	System.out.println("결과 : " + result);

	// char c1이 소문자인가?-아스킷코드
	char c1 = 'G' ;

	result = (c1>='a') && (c1<='z');
	System.out.println("결과 : " + result);


	
	



	
}
	
}