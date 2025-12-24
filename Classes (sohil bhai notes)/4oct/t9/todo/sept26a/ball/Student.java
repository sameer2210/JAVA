
public class Student {

	private String name;
	public Student(String name) {
		this.name=name;
	}
	
	void performBallAction(Ball givenBall){
		System.out.println("__________________________________");
		System.out.println("ball action perform by "+name +" given ball "+ givenBall);
		givenBall.move();
		givenBall.roll();
		givenBall.bounce();
		
	}
	
	

}
