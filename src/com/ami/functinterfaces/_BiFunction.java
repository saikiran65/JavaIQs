package com.ami.functinterfaces;

import java.util.function.BiFunction;

public class _BiFunction {
	
	public static void main(String[] args) {
		
//		BiFunction<I, U, R> [I first arg, U second arg, R result arg]
//		Eg1
		BiFunction<Integer, Integer, Integer> math = (num1,num2) -> num1+num2;
		System.out.println(math.apply(20, 20));
		
//		Eg2
		BiFunction<String, Integer, String> inf = 
				(name,age) -> "Hi My name is " + name + ", i am " + age;
				
		System.out.println(inf.apply("Vijay", 32));
	}

}
