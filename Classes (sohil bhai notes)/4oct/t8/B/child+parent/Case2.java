public class Case2{
	public static void main(String args[]){
	
	Parent p1 = new Parent();
	Child c1 = new Child();
	
	Parent parentRef = null;
	System.out.println("parentRef =  " +parentRef);
	parentRef = p1;
	System.out.println("parentRef = " + parentRef);
	parentRef = c1;
	System.out.println("parentRef = " + parentRef);
	
	/*
			parentRef =  null
			parentRef = Parent@15db9742
			parentRef = Child@6d06d69c
	*/	
	
	
	}//end main
}//end class