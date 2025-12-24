public class Boxdemo{
	public static void main(String args[]){
	
	Box b1 = new Box();
	b1.showDetails();
	System.out.println("______________________________");
		Box b2 = new Box();
		b2.showDetails();
		
	System.out.println("_____________________________");
		Box b3 = new Box("Green");
		b3.showDetails();
		
	System.out.println("______________________________");
		Box b4 = new Box("pink");
		b4.showDetails();
		
	System.out.println("______________________________");
		Box b5 = new Box(10,10,10,107,"blue");
		b5.showDetails();
		
	System.out.println("______________________________");
		Box b6 = new Box(50,70,90,200,"Blue");
		b6.showDetails();
		
		
		b1.setBrandName("Apple");
		b1.setColor("black");
		b1.setPrice(499);
		b1.setHeight(10);
		b1.setBreadth(20);
		b1.setLength(30);
		b1.setWeigth(40);
		b1.showDetails();	
	System.out.println("______________________________");

	
	
	
	
	}//end main
}//end class