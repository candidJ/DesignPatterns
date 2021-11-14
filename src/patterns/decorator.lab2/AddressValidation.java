package patterns.decorator.lab2;

public class AddressValidation extends ValidateDecorator {

	BasicValidation address;

	public AddressValidation(BasicValidation validation) {
		super(validation);
		this.address = validation;
	}

	@Override
	void validate(CustomerBase customer) {
		this.address.validate(customer);
		if (customer.getAddress().isEmpty()) {
			try {
				throw new Exception("please enter address");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("address is valid");
		}

	}

}
