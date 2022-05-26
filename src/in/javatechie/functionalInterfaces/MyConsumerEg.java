package in.javatechie.functionalInterfaces;

import java.util.function.Consumer;



public class MyConsumerEg {

	public class MyConsumer implements Consumer<Integer>{
		@Override
		public void accept(Integer t) {
			System.out.println("Printing : "+t);
		}
	}
	

	public static void main(String[] args) {
		
		/*
		 * MyConsumer mce = new MyConsumer(); mce.accept(5);
		 */
		
		Consumer con = t -> System.out.println("Printing : "+t);
		con.accept(9);
	}
	


}
