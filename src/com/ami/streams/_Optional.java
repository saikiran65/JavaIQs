package com.ami.streams;

import java.util.Optional;

public class _Optional {
	
	public static void main(String[] args) {
		
		String str = null;
		Optional<String> name = Optional.of(str);
		
		try {
			name.ifPresentOrElse(val -> { System.out.println(val);}, ()->{System.out.println("empty");});
		}catch(Exception e) {
			System.out.println(e);
		}
		
		/*
		try {
			if(name.isPresent()) {
				System.out.println(name.get());
			}else {
				new IllegalArgumentException("EMPTY");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
	}

}
