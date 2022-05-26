package com.ami.functinterfaces;

import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		
//		Function<T,R> >> T argument Type , R result type [one argument and return type]
		Function<Integer, Integer> incr = number -> number+1;
		
		System.out.println(incr.apply(121));
		
//		.andThen(); [to combine two Function<T,R> functional interfaces
		Function<Integer,Integer> multi = number -> number*10;
		
		Function<Integer, Integer> incrAndThenMulti = incr.andThen(multi);
		
		System.out.println(incrAndThenMulti.apply(80));
	}

}
