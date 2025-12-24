public class Demoswap2{
	public static void main(String args[]){
	
	UpdateUtil util= new UpdateUtil();
	
	BoxType1 box = new BoxType1();
	System.out.println("main box = " + box);
	box.a=100;
	box.b =200;
	System.out.println("main a = " + box.a + " b =" +box.b);
	util.swap2(box);
	
	System.out.println("after swap main a= "+ box.a +" b= " +box.b);
		
	}//end main
}//end class