package in.codedecode.methodreference;

import java.util.function.BiFunction;

interface Sayable{
	void say();
}

class MethodReference{
	public static void saySomething() {
		System.out.println("Hello this is static method");
	}
}

class MethodReference2{
	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}
}

class add{
	public static int sum(int a , int b) {
		return a+b;
	}
}

class Work{
	public void doWork() {
		System.out.println("this is an instance method");
	}
}

interface Book{
	void read();
}

class Addition{
	public int addition(int a, int b) {
		return a+b;
	}
}

public class MethodReference1 {
	
//	Method reference is used to refer method of functional interface. 
//	It is compact and easy form of lambda expression. Each time when 
//	you are using lambda expression to just referring a method, you 
//	can replace your lambda expression with method reference
	
//	There are following types of method references in java:

//		Reference to a static method.
//		Reference to an instance method.
//		Reference to a constructor.
	
	public static void main(String[] args) {
		
//----------------Reference to a static method.-----------------------
		
		/*
		 * Sayable sayable = MethodReference::saySomething;
		 * sayable.say();
		 */
		
		/*
		 * Thread thread = new Thread(MethodReference2::ThreadStatus); thread.start();
		 */
		
		/*
		 * BiFunction<Integer,Integer, Integer> biFn = add::sum;
		 * 
		 * Integer integer = biFn.apply(10, 5); System.out.println(integer);
		 */
		
//--------------Reference to an instance method.-------------------
		/*
		Work work = new Work();
		Book book1 = work::doWork;
		book1.read();
		*/
		
//using anonymous method
		/* 
		Book book2 = new Work()::doWork;
		book2.read();
		*/
		
		/*
		 Thread t = new Thread(new Work()::doWork);
		 t.start();
		*/
		
		/*
		 * BiFunction<Integer, Integer, Integer> biFn = new Addition()::addition;
		 * Integer res = biFn.apply(11, 10); System.out.println(res);
		 */
		
		
	}
	
	
	

}
