
public class BoxDemo {

	public static void main(String[] args) {
		
		Box b1  = new Box();
		b1.showDetails();
System.out.println("****************************************");
		Box b2  = new Box();
		b2.showDetails();
		
		
System.out.println("****************************************");
		Box b3  = new Box("Green");
		b3.showDetails();
		
		
		
System.out.println("****************************************");
		Box b4  = new Box("pink");
		b4.showDetails();
		
				
System.out.println("****************************************");
		Box b5  = new Box(10,10,10,107,"pink");
		b5.showDetails();
		
		
		
			
System.out.println("****************************************");
		Box b6  = new Box(50,70,90,200,"Blue");
		b6.showDetails();
		
		
		/* 
		b1.setBrandName("aris");
		b1.setColor("brown");
		b1.setPrice(200);
		b1.setHeight(10);
		b1.setBreadth(20);
		b1.setLength(30);
		b1.setWeigth(300);
		b1.showDetails();
System.out.println("****************************************");
		
		 */
		

	}

}
