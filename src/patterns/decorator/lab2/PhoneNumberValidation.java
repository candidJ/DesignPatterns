package patterns.decorator.lab2;

public class PhoneNumberValidation extends ValidateDecorator{

	
	BasicValidation phone;
	public PhoneNumberValidation(BasicValidation validation) {
		super(validation);
		this.phone = validation;
	}

	@Override
	void validate(CustomerContext customer) {
		System.out.println("phone number validation...");
		this.phone.validate(customer);
		if(customer.getPhone().isEmpty()) {
			try {
				throw new Exception("Please enter phone number");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
