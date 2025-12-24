public class BoxUpdateDemo{
	public static void main(String args[]){
	
		Box BoxUpdate = new Box();
		
		Box b1 = new Box();
		b1.showDetails();
		Box b2 = new Box("Green");
		b2.showDetails();
		Box b3 = new Box("pink");
		b3.showDetails();
		Box b4 = new Box("pink");
		b4.showDetails();/* 
		Box b5 = new Box(10,10,107,"pink");
		b5.showDetails(); */
		Box b6 = new Box(50f,60f,70f,200f,"Blue");
		b6.showDetails();
		/* 
		b1.setBrandName("aris");
		b1.setColor("brown");
		b1.setPrice(200);
		b1.setHeight(10);
		b1.setBreadth(20);
		b1.setLength(30);
		b1.setWeigth(300); */
		b1.showDetails();
	
	
	
	
	}//end main
}//end class