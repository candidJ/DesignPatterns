package patterns.decorator.lab2;

public class AddressValidation extends ValidateDecorator {

	BasicValidation validation;

	public AddressValidation(BasicValidation validation) {
		super(validation);
		this.validation = validation;
	}

	@Override
	void validate(CustomerBase customer) {
		this.validation.validate(customer);
		if (customer.getAddress().isEmpty()) {
			try {
				throw new Exception("Please enter address");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Address is valid");
		}
	}

}
