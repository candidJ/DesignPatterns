package patterns.decorator.lab2;

public class Shop {

	public static void main(String[] args) {

		BasicValidation basic = new NameValidation();
		BasicValidation phone = new PhoneNumberValidation(basic);
		BasicValidation address = new AddressValidation(phone);
		CustomerBase customer = new TargetCustomer(20, "", "", "sahdjh ashdj", address);
	}

}
