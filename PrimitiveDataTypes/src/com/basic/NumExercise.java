package com.basic;

public class NumExercise {
	
	private int number1;
	private int number2;
	
	NumExercise(int number1, int number2){
		this.number1 = number1;
		this.number2 = number2;
	}

	public static void main(String[] args) {
		NumExercise obj = new NumExercise(2,3);
		System.out.println(obj.add());
		System.out.println(obj.multiply());
		obj.Double();
		System.out.println(obj.getNumber1());
		System.out.println(obj.getNumber2());
	}
	int getNumber1() {
		return this.number1;
	}
	
	int getNumber2() {
		return this.number2;
	}
	int add() {
		return this.getNumber1() + this.getNumber2();
	}
	
	int multiply() {
		return this.getNumber1() * this.getNumber2();
	}
	
	void Double() {
		this.number1 = this.getNumber1() * 2;
		this.number2 = this.getNumber2() * 2;
	}

}
