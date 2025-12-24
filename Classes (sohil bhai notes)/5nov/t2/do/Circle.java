
public class Circle extends Shape {
	protected float radius;
	
	public void draw(){
		System.out.println(" Drawing circle ");
	}
	public void calculateArea(){
		System.out.println(" area circle pi*R^2 ");
	}
	public void showDetails(){
		super.showDetails();
		System.out.println(this + " radius  "+ radius);
	}
	
}//end class