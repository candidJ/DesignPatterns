package patterns.strategy.customerEnquiry;

public class Application {

	public static void main(String[] args) {
		CustomerContext targetCustomer = new CustomerContext(22, "David", 999999999, "Seattle, WA");
		targetCustomer.setValidationStrategy(new TargetCustomerValidateStrategy()); // behavior being set at run time
		targetCustomer.validate();

		CustomerContext enquiryCustomer = new CustomerContext(49, "Micheal", 888888888, "Covington, WA");
		enquiryCustomer.setValidationStrategy(new EnquiryCustomerValidateStrategy());
		enquiryCustomer.validate();
	}

}