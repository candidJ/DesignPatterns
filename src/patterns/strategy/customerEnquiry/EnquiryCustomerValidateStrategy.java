package patterns.strategy.customerEnquiry;

public class EnquiryCustomerValidateStrategy implements ValidateStrategy<CustomerContext> {

	@Override
	public void validate(CustomerContext customer) {
		Validations.validatePhone(customer);
	}

}