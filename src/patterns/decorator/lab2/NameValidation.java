package patterns.decorator.lab2;

public class NameValidation extends BasicValidation {

	@Override
	void validate(CustomerBase customer) {
		if (customer.getName().length() == 0) {
			try {
				throw new Exception("Please enter Customer name");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Name is valid");
		}
	}

}
