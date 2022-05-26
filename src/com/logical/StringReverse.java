package com.logical;

public class StringReverse {
	
	public static void main(String[] args) {
		
		
		//String reverse
		String str = "India is my country";
		
		for(int i=str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		//Palindrome
		String p = "liril";
		
		String r = "";
		
		for(int i=p.length()-1; i >=0; i--) {
			r=r+p.charAt(i);
		}
		
		if(p.equals(r) && p.hashCode()==r.hashCode()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		//Febonacci
		//1+2+3+5+8
		
		int prev=0;
		int next=1;
		for(int i=1; i<10; i++) {
			
			if(i==1) {
				System.out.print("1 ");
			}
			
			int k = next;
			next = prev+next;
			System.out.print(next+" ");
			prev = k;
		}
		
		System.out.println();
		
		//factorial
		
		int fact=1;
		
		for(int i=1; i<6; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial "+fact);
		
		int res = StringReverse.fact(4);
		System.out.println(res);
		
		
		
	}
	
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}

}
