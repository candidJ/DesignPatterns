package patterns.decorator.lab2;

public class Application {

    public static void main(String[] args) {

        Validator nameValidation = new NameValidator();
        Validator phoneValidation = new PhoneNumberValidator(nameValidation);
        Validator validation = new AddressValidator(phoneValidation);
        // alternative way to decorate
        // BasicValidation validation = new AddressValidation(new PhoneNumberValidation(new NameValidation()));
        CustomerBase customer = new TargetCustomer(20, "Steve", "306-490-0017", "New York", validation);
        System.out.println(customer);
    }

}
