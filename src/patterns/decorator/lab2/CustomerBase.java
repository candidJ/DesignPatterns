package patterns.decorator.lab2;

public abstract class CustomerContext {

	int age;
	String name;
	String phone;
	String address;

	@Override
	public String toString() {
		return "CustomerContext [age=" + age + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CustomerContext(int age, String name, String phone, String address) {
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

}
