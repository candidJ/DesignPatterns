package patterns.decorator.lab2;

public abstract class CustomerDecorator extends Validator {

    protected Validator decoratedValidator;

    public CustomerDecorator(Validator validator) {
        this.decoratedValidator = validator;
    }

    @Override
    void validate(CustomerBase customer) {
        this.decoratedValidator.validate(customer);
    }

}
