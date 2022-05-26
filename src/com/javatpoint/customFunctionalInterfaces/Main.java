package com.javatpoint.customFunctionalInterfaces;

public class Main implements EvenFunctionalInterface {
	
	public static void main(String[] args) {
		
		Main m = new Main();
		System.out.println(m.isEven(2999));
	}

	@Override
	public boolean isEven(Integer i) {
		return i%2==0;
	}
}
