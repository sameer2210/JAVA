class Father{
	String name;
	int age;
	String address;
	
	public Father(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void eat(){
		System.out.println(this+" eating");
	}
	void sleep(){
		System.out.println(this+" sleeping");
	}
	void run(){
		System.out.println(this+" runing");
	}
	void drinkAlcohal(){
		System.out.println(this+" drinkAlcohal");
	}

	
}