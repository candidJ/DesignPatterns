package patterns.strategy.customerEnquiry;

public interface ValidateStrategy<T> {

	void validate(T customer);
}
