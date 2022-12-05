package patterns.decorator.lab2;

public class TargetCustomer extends CustomerContext {

	BasicValidation validation;

	public TargetCustomer(int age, String name, String phone, String address, BasicValidation validation) {
		super(age, name, phone, address);
		this.validation = validation;
		this.validation.validate(this);
	}

}
