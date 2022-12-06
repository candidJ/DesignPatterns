package patterns.decorator.lab2;

public class PhoneNumberValidation extends ValidateDecorator{

	BasicValidation validation;

	public PhoneNumberValidation(BasicValidation validation) {
		super(validation);
		this.validation = validation;
	}

	@Override
	void validate(CustomerBase customer) {
		this.validation.validate(customer);
		if(customer.getPhone().isEmpty()) {
			try {
				throw new Exception("Please enter phone number");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Phone number is valid");
		}
	}

}
