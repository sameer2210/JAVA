public class XclassTest{
	public static void main(String args[]){
	
	String skStmt =new String ("java is simple");
	System.out.println("before in main skStmt =" + skStmt);
	Xclass ob = new Xclass();
	ob.updateInfo(skStmt);
	
	System.out.println("after in main skStmt = " + skStmt);
	
	
	}//end main
}//end class