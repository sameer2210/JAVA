public class Demo{
	public static void main(String args[]){
	
	Table t1 = null;
	System.out.println(t1);
	t1 = new Table();
	
	System.out.println(t1);
	
	System.out.println("__________________________");
	Fan f1 = null;
	System.out.println("fan1 = " + f1);
	f1 = new Fan();
	System.out.println("__________________________");
	
	f1.on();
	f1.on();
	f1.off();
	
	
	}//end main
}//end class