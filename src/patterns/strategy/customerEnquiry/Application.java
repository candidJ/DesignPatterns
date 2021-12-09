package patterns.strategy.customerEnquiry;

public class Application {

	public static void main(String[] args) {
		CustomerBase targetCustomer = new TargetCustomer(22, "David", 77665543, "");
		targetCustomer.setValidationStrategy(new ValidationTargetCustomer());
		targetCustomer.performValidation();
		CustomerBase enquiryCustomer = new EnquiryCustomer(49, "Micheal", 999999, "wakad, pune");
		enquiryCustomer.setValidationStrategy(new ValidationEnquiryCustomer());
		enquiryCustomer.performValidation();
	}

}
