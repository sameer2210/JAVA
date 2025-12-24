public class Demo{
	public static void main(String args[]) throws Exception{
	
	Book item1 = new Book();
	Pen item2 = new Pen();
	Mobile item3 = new Mobile();
	Mouse item4 = new Mouse();
	
	Human h1 = new Human();
	h1.name ="doora";
	
		h1.actionWithBook(item1);
		Thread.sleep(2000);
		
		h1.actionWithPen(item2);
		Thread.sleep(2000);
		
		h1.actionWithMobile(item3);
		Thread.sleep(3000);
		
		h1.actionWithMouse(item4);
		Thread.sleep(3000);
		
	
	
	}//end main
}//end class