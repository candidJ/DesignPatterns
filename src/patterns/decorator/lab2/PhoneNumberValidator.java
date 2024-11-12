package patterns.decorator.lab2;

public class PhoneNumberValidator extends CustomerDecorator {

    public PhoneNumberValidator(Validator validator) {
        super(validator);
    }

    @Override
    void validate(CustomerBase customer) {
        super.validate(customer);
        if (customer.getPhone().isEmpty()) {
            throw new IllegalArgumentException("Phone number is required");
        }
        System.out.println("Phone number is valid");
    }

}
