package patterns.strategy.lab2;

public class Validations {

	static void validateAddress(CustomerBase customer) {
		System.out.println("validating address for:" + customer.toString());
		if (customer.getAddress().isEmpty()) {
			System.out.println("address can't be empty");
		} else {
			if (customer.getAddress().length() < 5) {
				System.out.println("please enter address more than 5 characters");
			} else {
				System.out.println("address is valid");
			}
		}
	}

	static void validatePhone(CustomerBase customer) {
		System.out.println("validating phone number..." + customer.toString());
		if (customer.getPhone() == 0) {
			System.out.println("phone can't be empty");
		} else {
			if (customer.getPhone() < 5) {
				System.out.println("please enter phone more than 5 digits");
			} else {
				System.out.println("phone is valid...");
			}
		}
	}

	static void validateAge(CustomerBase customer) {
		System.out.println("validating phone number..." + customer.toString());
		if (customer.getAge() == 0) {
			System.out.println("age can't be 0 ...");
		} else {
			if (customer.getAge() < 18) {
				System.out.println("customer must be above 18 years");
			} else {
				System.out.println("age is valid...");
			}
		}
	}
}
