public class ChildParentCaseB {
	public static void main(String[] args) {

	Parent p1  = new Parent();
	Child c1  = new Child();
	 
	Parent parentRef = null;
	System.out.println("parentRef = " +parentRef);
	parentRef = p1;
	System.out.println("parentRef = " +parentRef);
	parentRef = c1;
	System.out.println("parentRef = " +parentRef);
	
	
	
	}
}
