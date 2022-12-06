package patterns.decorator.lab2;

// an abstract class which would be implemented by decorator(ValidateDecorator) 
// and it's subclasses(AddressValidation, PhoneNumberValidation, NameValidation)
public abstract class BasicValidation {
	abstract void validate(CustomerBase customer);
}