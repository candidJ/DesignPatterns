package patterns.decorator.lab2;

public class AddressValidator extends CustomerDecorator {

    Validator validator;

    public AddressValidator(Validator validator) {
        super(validator);
        this.validator = validator;
    }

    @Override
    void validate(CustomerBase customer) {
        this.validator.validate(customer);
        String address = customer.getAddress();
        if (address == null ||address.isEmpty()) {
            throw new IllegalArgumentException("Address is required");
        }
        System.out.println("Address is valid");
    }
}
