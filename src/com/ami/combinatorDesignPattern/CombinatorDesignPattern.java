package com.ami.combinatorDesignPattern;

public class CombinatorDesignPattern {
	
	public static void main(String[] args) {
		
		Customer c = new Customer(90,"vijay","vijay@gmail.com","+91898989");
		
		ValidationResult validationResult = CustomerValidatorService.isIdValid()
								.and(CustomerValidatorService.isEmailValid())
								.and(CustomerValidatorService.isPhoneValid())
								.apply(c);
		
		System.out.println(validationResult);
		
		if(validationResult!=ValidationResult.SUCCESS) {
			throw new IllegalArgumentException(validationResult.name());
		}
		
	}

}

class Customer{
	int id;
	String name;
	String email;
	String phone;
	
	public Customer(int id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
}