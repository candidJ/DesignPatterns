package patterns.strategy.customerEnquiry;

public class TargetCustomerValidateStrategy implements ValidateStrategy<CustomerContext> {

	@Override
	public void validate(CustomerContext customer) {
		Validations.validateAddress(customer);
		Validations.validatePhone(customer);
		Validations.validateAge(customer);
	}
}
