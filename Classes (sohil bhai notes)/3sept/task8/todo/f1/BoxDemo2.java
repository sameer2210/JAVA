
public class BoxDemo2 {

	public static void main(String[] args) {
		
		Box b1  = new Box();
		Box b2  = new Box();
		b1.showDetails();
		b2.showDetails();
		
		b1.setBrandName("aris");
		b1.setColor("brown");
		b1.setPrice(200);
		b1.setHeight(10);
		b1.setBreadth(20);
		b1.setLength(30);
		b1.setWeigth(300);
		b1.showDetails();
		
		
		b2.setBrandName("radox");
		b2.setColor("white");
		b2.setPrice(250);
		b2.setHeight(30);
		b2.setBreadth(30);
		b2.setLength(30);
		b2.setWeigth(350);
		b2.showDetails();
		

	}

}
