package in.javatechie.functionalInterfaces;

import java.util.function.Supplier;

class MySupplier implements Supplier<String>{

	@Override
	public String get() {
		return "Supplier return";
	}
	
}

public class MySupplierEg {
	
	 public static void main(String[] args) {
		 
//		 MySupplier ms = new MySupplier();
//		 System.out.println(ms.get());
		 
		 Supplier<String> sp = () -> "Supplier return statement";
		 
		 System.out.println(sp.get());
		
	}
	

}
