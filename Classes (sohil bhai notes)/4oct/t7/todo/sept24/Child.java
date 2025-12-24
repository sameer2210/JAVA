
public class Child extends Parent{

String name;
//super.name parent name 
//super.address parent address
public Child(String parentName, String address, String name) {
	super(parent Name,address);//must be first line of child constructor
	this.name=name;	
}

//OVERRIDE
void showInfo(){
	  System.out.println(this  +"_______child_________");
	  System.out.println("name "+ name);
	  System.out.println("parent name "+super.name);
	  System.out.println("address "+ address);
	  System.out.println("______________________");
}	
}//end class