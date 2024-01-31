package com.basic;

public class MyChar {
	
	private char character;
	
	MyChar(char character){
		this.character = character;
	}

	public static void main(String[] args) {
		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		myChar.printLowerCaseAlphabets();
		myChar.printUpperCaseAlphabets();

	}
	
	boolean isVowel() {
		if (Character.toUpperCase(this.character)=='A') {
			return true;
		}
		if (Character.toUpperCase(this.character)=='E') {
			return true;
		}
		
		if (Character.toUpperCase(this.character)== 'I') {
			return true;
		}
		if (Character.toUpperCase(this.character)=='O') {
			return true;
		}
		if (Character.toUpperCase(this.character)=='U') {
			return true;
		}
		return false;
	}
	
	boolean isConsonant() {
		if (this.isVowel()) {
			return true;
		}
		return false;
	}
		
	boolean isNumber(){
		if (this.character>=48 && this.character<=57) {
			return true;
		}
		return false;
	}
	
	boolean isAlphabet() {
		if ((this.character>=65 && this.character<=90)||(this.character>=97 && this.character<=122)){
			return true;
		}
		return false;
	
	}
	
	void printLowerCaseAlphabets() {
		for (char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
	}
	void printUpperCaseAlphabets() {
		for (char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
		}
	}

}
