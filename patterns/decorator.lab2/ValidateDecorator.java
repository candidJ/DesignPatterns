package patterns.decorator.lab2;

public abstract class ValidateDecorator extends BasicValidation {

//	BasicValidation validation;

//	public ValidateDecorator(BasicValidation validation) {
//		this.validation = validation;
//	}

	@Override
	abstract void validate(CustomerBase customer);

}
