package patterns.decorator.lab2;

public class Application {

	public static void main(String[] args) {

		BasicValidation nameValidation = new NameValidation();
		BasicValidation phoneValidation = new PhoneNumberValidation(nameValidation);
		BasicValidation validation = new AddressValidation(phoneValidation);
		// alternative way to decorate
		// BasicValidation validation = new AddressValidation(new PhoneNumberValidation(new NameValidation()));
		CustomerBase customer = new TargetCustomer(20, "Steve", "9999999999", "new york", validation);
		System.out.println(customer);
	}

}
