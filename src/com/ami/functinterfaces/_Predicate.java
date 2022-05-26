package com.ami.functinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _Predicate {
	
	public static void main(String[] args) {
		
//		Predicate<T>
		
//		Eg1
		Predicate<Integer> even = num -> num%2==0;
		String res = even.test(98) ? "EVEN" : "ODD";
		System.out.println(res);
		
//		Eg2
		List<Integer> numbers = Arrays.asList(73,90,87,78,93);
		Predicate<Integer> evenNum = num -> num%2==0;
		
		numbers.stream().filter(evenNum).forEach(System.out::println);
		
	}

}
