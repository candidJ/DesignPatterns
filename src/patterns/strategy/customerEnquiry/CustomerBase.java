package patterns.strategy.customerEnquiry;

public abstract class CustomerBase {

	int age;
	String name;
	int phone;
	String address;

	@Override
	public String toString() {
		return "CustomerBase [age=" + age + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CustomerBase(int age, String name, int phone, String address) {
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	ValidateStrategy<CustomerBase> validateStrategy = null;

	void performValidation() {
		this.validateStrategy.validate(this);
	}

	void setValidationStrategy(ValidateStrategy<CustomerBase> obj) {
		this.validateStrategy = obj;
	}

}
