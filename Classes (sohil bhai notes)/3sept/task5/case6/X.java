public class X{
	
	void greet(){
	 System.out.println("no arg greet called");
	}
	
	double greet(){
	 System.out.println("no greet called ");
	}
	
	void greet(String str){
	 System.out.println("1 arg greet called(String) " +str);
	}
	
	String greet(String str){
	 System.out.println("1 arg greet called(String) " +str);
	}
	
	void greet(int value){
	 System.out.println("1 arg greet called(int) " + value);
	}
	
	
}//end class