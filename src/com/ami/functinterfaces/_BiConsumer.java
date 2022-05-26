package com.ami.functinterfaces;

import java.util.function.BiConsumer;

public class _BiConsumer {
	
	public static void main(String[] args) {
		
//		BiConsumer<T, U> [takes two arguments but returns nothing void]
		
//		Eg1
		Customer cst = new Customer(89,"ajay",89899);
		
				
		BiConsumer<Customer, Boolean> custdtls = 
				(cstm,ph) ->  System.out.println(cstm.id + " : " + cstm.name + " : " + (ph ? cstm.ph : "*****") );
		
		custdtls.accept(cst, true);
		custdtls.accept(cst, false);
	}

	static class Customer {
		int id;
		String name;
		long ph;
		
		public Customer(int id, String name, long ph) {
			super();
			this.id = id;
			this.name = name;
			this.ph = ph;
		}
		
	}
}
