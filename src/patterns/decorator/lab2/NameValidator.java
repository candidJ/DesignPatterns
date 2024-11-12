package patterns.decorator.lab2;

public class NameValidator extends Validator {

    @Override
    void validate(CustomerBase customer) {
        String name = customer.getName();
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Please enter Customer name");
        }
        System.out.println("Customer Name is valid");
    }
}
