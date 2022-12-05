package patterns.strategy.customerEnquiry;

public class Validations {

	static void validateAddress(CustomerContext customer) {
		System.out.println("validating address for:" + customer.toString());
		if (customer.getAddress().isEmpty()) {
			System.out.println("Address can't be empty");
		} else {
			if (customer.getAddress().length() < 5) {
				System.out.println("Please enter address more than 5 characters");
			} else {
				System.out.println("Address is valid");
			}
		}
	}

	static void validatePhone(CustomerContext customer) {
		System.out.println("Validating phone number..." + customer.toString());
		if (customer.getPhone() == 0) {
			System.out.println("Phone number can't be empty");
		} else {
			if (customer.getPhone() < 5) {
				System.out.println("Please enter phone number more than 5 digits");
			} else {
				System.out.println("Phone number is valid...");
			}
		}
	}

	static void validateAge(CustomerContext customer) {
		System.out.println("Validating phone number..." + customer.toString());
		if (customer.getAge() == 0) {
			System.out.println("Age can't be 0 ...");
		} else {
			if (customer.getAge() < 18) {
				System.out.println("Customer must be above 18 years");
			} else {
				System.out.println("Age is valid...");
			}
		}
	}
}
