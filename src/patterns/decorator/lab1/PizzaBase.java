package patterns.decorator.lab1;

// Interface/Abstract class with functionality/methods which the decorator and target class implements
public abstract class PizzaBase {

    String description = "Pizza";

    protected String getDescription() {
        return this.description;
    }

    protected abstract double cost();

}
