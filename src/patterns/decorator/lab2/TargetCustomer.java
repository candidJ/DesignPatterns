package patterns.decorator.lab2;

public class TargetCustomer extends CustomerBase {

	BasicValidation validation; // composition 

	public TargetCustomer(int age, String name, String phone, String address, BasicValidation validation) {
		super(age, name, phone, address);
		this.validation = validation;
		this.validation.validate(this); // only target customer needs to be validated
	}

}
