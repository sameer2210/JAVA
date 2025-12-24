
public class BallGame2 {

	public static void main(String[] args) throws Exception{
		Ball b1  = new Ball();
		Ball b2  = new FootBall();
		Ball b6  = new LightBall();
		Ball b8  = new LightBall();
		Ball b3  = new FootBall();
		Ball b4  = new FootBall();
		Ball b5  = new FanyBall();
		Ball b7  = new LightBall();
		
		Ball [] ballList  = {b1,b2,b3,b4,b5,b6,b8,b7,new FootBall(),new FanyBall()};
		System.out.println("total balls" +ballList.length);
		
	Student stu = new Student("abhishek");
	for(int bn=1;bn<=ballList.length;bn++){
		Ball pickBall = ballList[bn-1];
		Thread.sleep(1000);
		System.out.println("picked ball #"+bn +" = "+pickBall);
		stu.performBallAction(pickBall);
	}
		
		
		

	}

}
