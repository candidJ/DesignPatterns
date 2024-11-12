package patterns.decorator.lab2;

public class TargetCustomer extends CustomerBase {
    Validator validator;
    public TargetCustomer(int age, String name, String phone, String address, Validator validator) {
        super(age, name, phone, address);
        this.validator = validator;
        this.validator.validate(this); // only target customer needs to be validated
    }

}
