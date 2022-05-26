package com.ami.functinterfaces;

import java.util.function.BiPredicate;

public class _BiPredicate {
	
	public static void main(String[] args) {
		
//		BiPredicate<T, U> [T first arg, U second Arg], 
//		test() method with boolean return type >> used for conditions with two arguments
		
//		Eg1
		BiPredicate<Integer, Integer> math = (num1,num2) -> num1>num2;
		System.out.println(math.test(92, 9));
		
	}

}
