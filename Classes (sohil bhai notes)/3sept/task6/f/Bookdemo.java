public class Bookdemo{
	public static void main(String args[]){
	
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.info();
		b2.info();
		b3.info();
		
		b1.updateInfo("html",150,30.50f);
		b2.updateInfo("c",170,150.50f);
		b3.updateInfo("java",500,600.50f);
		
		b1.info();
		b2.info();
		b3.info();
			
	
	}//end main
}//end class