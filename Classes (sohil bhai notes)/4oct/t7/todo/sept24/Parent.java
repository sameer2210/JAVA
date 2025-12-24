public class Parent {
	String name;
	String address;

	public Parent(String name, String address) {
		this.name = name;
		this.address = address;
	}

  void showInfo(){
	  System.out.println(this  +"_______parent_________");
	  System.out.println("name "+ name);
	  System.out.println("address "+ address);
	  System.out.println("______________________");
  }	
}
