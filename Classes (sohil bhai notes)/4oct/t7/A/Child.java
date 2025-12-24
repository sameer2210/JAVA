public class Child extends Parent {

//super name parent name
//super address parent address

	String name; 
	public Child(String parentName, String address, String name){
		super(parentName,address);
		this.name=name;
	}
	
	//OVERRIDE
	void showInfo(){
		System.out.println(this + " __________Child___________");
		System.out.println("name "+ name);
		System.out.println("parent name " +super.name);
		System.out.println("address " + address);
		System.out.println("________________________________");
	}
	
	
}//end class