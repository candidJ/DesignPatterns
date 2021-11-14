package patterns.decorator.lab2;

public class Shop {

	public static void main(String[] args) {

//		BasicValidation basic = new NameValidation();
//		BasicValidation phone = new PhoneNumberValidation(basic);
//		BasicValidation address = new AddressValidation(phone);
		BasicValidation address = new AddressValidation(new PhoneNumberValidation(new NameValidation()));
		CustomerBase customer = new TargetCustomer(20, "s", "s", "sahdjh ashdj", address);
	}

}
