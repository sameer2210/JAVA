public class App2 {
	public static void main(String args[]){
	
	Y ref = new Y();
		
		ref.mySpecialMethodNumber1();
		ref.mySpecialMethodNumber2();
		ref.mySpecialMethodNumber3();
	
	System.out.println("ref = " + ref);
		
	
	}//end main
}//end class

/*	this is y class object info  m1 from X
	this is y class object info  m2 from Y ........ Override
	this is y class object info  m3 from X
	ref = this is y class object info

*/