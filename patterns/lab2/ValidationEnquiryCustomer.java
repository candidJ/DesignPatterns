package patterns.strategy.lab2;

public class ValidationEnquiryCustomer implements ValidateStrategy<CustomerBase> {

	@Override
	public void validate(CustomerBase customer) {
		Validations.validatePhone(customer);
	}

}