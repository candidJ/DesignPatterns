package patterns.strategy.customerEnquiry;

public interface ValidateStrategy<T> {

	public void validate(T customer);
}
