package patterns.strategy.lab2;

public class ValidationTargetCustomer implements ValidateStrategy<CustomerBase> {

	@Override
	public void validate(CustomerBase customer) {
		Validations.validateAddress(customer);
		Validations.validatePhone(customer);
		Validations.validateAge(customer);
	}
}
