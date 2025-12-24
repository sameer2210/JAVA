
public class Req1 {

	public static void main(String[] args) {

		Shape s1  = new Circle();
		Shape s2  = new Cube();
		Shape s3  = new Rectangle();
		
		
		
		s1.setBgColor("red");
		s1.setBorderColor("green");
		s2.setBgColor("white");
		s2.setBorderColor("green");
		s3.setBgColor("blue");
		s3.setBorderColor("pink");
		s1.showDetails();
		s2.showDetails();
		s3.showDetails();
		
		s1.draw();
		s2.draw();
		s3.draw();
		s1.calculateArea();
		s2.calculateArea();
		s3.calculateArea();
	}

}
