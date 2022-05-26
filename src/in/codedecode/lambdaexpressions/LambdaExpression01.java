package in.codedecode.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

class Product{
	Integer id;
	String name;
	Double price;
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpression01 {
	
	public static void main(String[] args) {
		
		
//--------sum of two numbers using lambda expression-----------------------
		
//		BiConsumer<Integer, Integer> biCo = (a,b) -> System.out.println(a+b);
//		biCo.accept(10, 5);
		
//--------to provide the implementation for functional interface----------------------
		
//		Add adtn = ()-> System.out.println("hello");
//		adtn.add();
		
		
		/*
		 * Multiplication mlp = (a,b)-> {return a*b;}; 
		 * int res = mlp.multiplication(10,11);
		 * System.out.println(res);
		 * 
		 * Multiplication mlp1 = (a,b)->{return a+b;}; int r = mlp1.multiplication(10,
		 * 20); System.out.println(r);
		 */
		
//---------- to iterate through forEach() loop ---------------
		
		/*
		 * List<String> names = new ArrayList<>();
		 * 
		 * names.add("happy"); names.add("buddy"); names.add("super");
		 * names.add("fast");
		 * 
		 * names.forEach((a)->System.out.println(a));
		 */
		
//-----------comparator--------------------
		
		List<Product> plist = new ArrayList<>();
		plist.add(new Product(11,"Bat",898f));
		plist.add(new Product(13,"Racket",98f));
		plist.add(new Product(19,"gloves",18f));
		
		Collections.sort(plist, (p1,p2)->{return p1.price.compareTo(p2.price);});
		
		for(Product p : plist) {
			System.out.println(p.id+" : "+p.name+" : "+p.price);
		}
		
		
		
	}

}
