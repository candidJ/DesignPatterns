package patterns.strategy.customerEnquiry;

public class Application {

	public static void main(String[] args) {
		CustomerContext targetCustomer = new TargetCustomer(22, "David", 7722033747, "Muktsar, Punjab, India");
		targetCustomer.setValidationStrategy(new TargetCustomerValidateStrategy()); // behavior being set at run time
		targetCustomer.validate();

		CustomerContext enquiryCustomer = new EnquiryCustomer(49, "Micheal", 999999999, "Philippines");
		enquiryCustomer.setValidationStrategy(new EnquiryCustomerValidateStrategy());
		enquiryCustomer.validate();
	}

}
