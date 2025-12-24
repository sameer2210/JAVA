public class SwDemo1{
	public static void main(String args[]){
	
	Calculator c1 = new Calculator();
		c1.open();
		c1.min();
		c1.max();
		c1.restore();
		c1.move();
		
		c1.add(1,2);
		c1.sub(5,4);
		
		c1.close();
	System.out.println("____________________");
		
	
	}//end main 
}//end class