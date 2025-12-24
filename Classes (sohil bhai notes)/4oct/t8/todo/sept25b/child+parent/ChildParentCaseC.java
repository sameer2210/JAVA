public class ChildParentCaseC {
	public static void main(String[] args) {

	Parent p1  = new Parent();
	Child c1  = new Child();
	 
	Parent parentRef = null;
	System.out.println("parentRef = " +parentRef);
	System.out.println("__________________________");

	parentRef = p1;
	System.out.println("parentRef = " +parentRef);
	
	parentRef.eat();   //p
	parentRef.speak();//p
	parentRef.walk();//p
	System.out.println("__________________________");
	
	parentRef = c1;
	System.out.println("parentRef = " +parentRef);
	parentRef.eat();//p
	parentRef.walk();//p
	parentRef.speak();//override  child version
	
	//parentRef.coding();//CTE
	//parentRef.devlopSw();//CTE
	 
	
	}
}
