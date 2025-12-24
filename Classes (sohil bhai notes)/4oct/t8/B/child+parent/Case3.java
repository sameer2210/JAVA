public class Case3{
	public static void main(String args[]){
	
	Parent p1 = new Parent();
	Child c1 = new Child();
	
	Parent parentRef = null;
	System.out.println("parentRef = "+ parentRef);			//null
	System.out.println("________________________");
	
	parentRef = p1;
	System.out.println("parentRef = " + parentRef);
	
	parentRef.eat();			//..... eat parent 
	parentRef.speak();		//..... speak parent
	parentRef.walk();		//.... walk parrent
	System.out.println("_______________________");
	
	parentRef = c1;
	System.out.println("parentRef = " + parentRef);		//parentRef = Child@6d06d69c
	parentRef.eat();			//Child@6d06d69c--- eat .... Parent
	parentRef.walk();		//Child@6d06d69c --- walk.... Parent
	parentRef.speak();		//Child@6d06d69c---- professional speaking..by Child
	
	//parentRef.coding();
	//parentRef.devlopSw();	
	
	
	
	}//end main
}//end class