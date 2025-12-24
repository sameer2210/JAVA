public class Parent {
	String name;
	float cash;
	String mobile;

	public Parent(String name, float cash, String mobile) {
		this.name = name;
		this.cash = cash;
		this.mobile = mobile;
	}

	void show() {
		System.out.println(this + " info of Parent type");
		System.out.println("name " + name);
		System.out.println("mobile " + mobile);
		System.out.println("cash " + cash);
	}
}
