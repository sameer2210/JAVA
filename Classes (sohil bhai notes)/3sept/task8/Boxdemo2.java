public class Boxdemo2{
	public static void main(String args[]){
	
	Box b1 = new Box();
	Box b2 = new Box();
	b1.showDetails();
	b2.showDetails();
	
	b1.setBrandName("DELL");
	b1.setColor("black");
	b1.setPrice(99999);
	b1.setHeight(10);
	b1.setBreadth(20);
	b1.setLength(30);
	b1.setWeigth(400);
	b1.showDetails();
	
	b2.setBrandName("mi");
	b2.setColor("white");
	b2.setPrice(250);
	b2.setHeight(22);
	b2.setBreadth(33);
	b2.setLength(44);
	b2.setWeigth(55);
	b2.showDetails();
	
	
	

	
	}//end main
}//end class