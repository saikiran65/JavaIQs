package in.codedecode.lambdaexpressions;

public class LambdaThread {
	
	public static void main(String[] args) {
		
		Runnable rn = () -> System.out.println("Thread1 is running");
		
		Thread tr = new Thread(rn);
		
		tr.start();
	}

}
