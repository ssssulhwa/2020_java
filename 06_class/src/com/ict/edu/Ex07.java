package com.ict.edu;

public class Ex07 {
	private String name = "커피우유" ; //전역변수
	private int su = 100 ;
	private int price = 1100 ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// 전역변수와 지역변수 이름 같을 때
		// 전역변수에 this 붙임
		// 이유 : 전역변수와 지역변수 이름 같으면 우선순위는 지역변수니까 지역변수만 사용하게 됨
		// 무조건 우선순위는 지역변수!니까 지역변수만
		// 지역변수는 해당 메소드를 호출할 때 생성됨
		this.name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		price = price;
	}
	
}
