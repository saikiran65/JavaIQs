package com.ami.functinterfaces;

import java.util.function.Consumer;

public class _Consumer {
	
	public static void main(String[] args) {
		
//		Consumer<T> [T input arg, but no return type like void function]
		
//		Eg1
		Student stdnt = new Student(90,"vijay",8);
		
		Consumer<Student> s = obj -> System.out.println((obj.id*2)+ " : "+obj.name);
		
		s.accept(stdnt);
		
	}
	
	static class Student{
		
		int id;
		String name;
		int std;
		
		public Student(int id, String name, int std) {
			super();
			this.id = id;
			this.name = name;
			this.std = std;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStd() {
			return std;
		}
		public void setStd(int std) {
			this.std = std;
		}
		
	}

}
