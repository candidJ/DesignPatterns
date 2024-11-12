package patterns.decorator.lab2;

// An abstract class to be implemented by decorator(ValidateDecorator) and it's subclasses(AddressValidation, PhoneNumberValidation, NameValidation)
public abstract class Validator {
    abstract void validate(CustomerBase customer);
}