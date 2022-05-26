package com.ami.combinatorDesignPattern;

import java.util.function.Function;

public interface CustomerValidatorService extends Function<Customer, ValidationResult> {

	static CustomerValidatorService isIdValid() {
		return customer -> customer.getId() > 0 ? 
				ValidationResult.SUCCESS : ValidationResult.ID_NOT_VALID;
	}
	
	static CustomerValidatorService isEmailValid() {
		return customer -> customer.getEmail().contains("@") ?
				ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
	}
	
	static CustomerValidatorService isPhoneValid() {
		return customer -> customer.getPhone().startsWith("+91") ? 
				ValidationResult.SUCCESS : ValidationResult.PHONE_NOT_VALID;
	}
	
	default CustomerValidatorService and(CustomerValidatorService other) {
		return customer -> {
			ValidationResult result = this.apply(customer);
			return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
		};
	}
	
}
