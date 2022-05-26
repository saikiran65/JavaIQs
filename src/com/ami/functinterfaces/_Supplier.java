package com.ami.functinterfaces;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	
	public static void main(String[] args) {
		
//		Supplier<T> [T return type arg, get() method which takes no arg but has return type]
		
//		Eg1
		Supplier<String> str = () -> "Hi hello!";
		System.out.println(str.get());
		
//		Eg2
		Supplier<List<String>> names = () -> List.of("pat","jim","tim");
		System.out.println(names.get());
		
	}

}
