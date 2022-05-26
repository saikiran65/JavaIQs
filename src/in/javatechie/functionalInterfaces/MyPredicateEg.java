package in.javatechie.functionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicateEg {
	
	public class MyPredicateConv implements Predicate<Integer>{

		@Override
		public boolean test(Integer t) {
			return t%2==0?true:false;
		}
		
	}
	
	public static void main(String[] args) {
		/*
		 * MyPredicateConv mpc = new MyPredicateConv();
		 * System.out.println(mpc.test(8));
		 */
		
//		Predicate<Integer> pr = t -> t%2==0;
//		System.out.println(pr.test(9));
		
		List<Integer> list = Arrays.asList(1,9,8,7,6);
		
		list.stream().filter(t -> t%2==0).forEach(t -> System.out.println(t));
		
		
	}

}
