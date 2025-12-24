public class Increasedemo2{
	public static void main(String args[]){
	
	UpdateUtil util=new UpdateUtil();
	
	Dabba dabba1 = new Dabba();
	dabba1.a =100;
	
	System.out.println("main a = "+ dabba1.a);
	util.increaseValue2(dabba1);
	
	System.out.println("after main a= " + dabba1.a);
		
	}//end main
}//end class