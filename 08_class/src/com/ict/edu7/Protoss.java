package com.ict.edu7;

// Unit �߻� Ŭ�����ϱ� �Ϲ� Ŭ������ Protoss�� �ݵ�� �������̵�

public class Protoss extends Unit{
	String name;
	int energy;
	boolean fly ;
	
	public Protoss() {
	
	}
	
	public Protoss(String name, int energy, boolean fly) {
		super();
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy = energy - 2 ;
	}
	
	
}
