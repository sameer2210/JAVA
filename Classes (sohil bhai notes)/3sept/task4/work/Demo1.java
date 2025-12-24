public class Demo1{
	public static void main(String args[])throws Exception{
	
	Kbook item1 = new Kbook();
	Kpen item2 = new Kpen();
	Kmobile item3 = new Kmobile();
	Kmouse item4 = new Kmouse();
	
	Human h1 = new Human();
	h1.name="Sameer";
			System.out.println("_____________");
		h1.actionWithKbook(item1);
			System.out.println("_____________");
			Thread.sleep(2000);
		
		h1.actionWithKpen(item2);
			System.out.println("_____________");
			Thread.sleep(2000);
		
		h1.actionWithKmobile(item3);
			System.out.println("______________");
			Thread.sleep(2000);
			
		h1.actionWithKmouse(item4);
			System.out.println("_____________");
			Thread.sleep(2000);
			
	
	
	}//end main
}//end class