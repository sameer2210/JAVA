
public class TypeCheck {
public static void main(String[] args) {
  //human has 2 method
	  
	Human h1  = new Human();
	Student  s1  = new Student();
	Trainer t1  = new Trainer();
	Doctor d1  = new Doctor();
	Sparrow b1 = new Sparrow();
	System.out.println("h1 instance of Human " +(h1 instanceof Human));
	System.out.println("h1 instance of Student " +(h1 instanceof Student));
	System.out.println("h1 instance of Trainer " +(h1 instanceof Trainer));
	System.out.println("h1 instance of Doctor " +(h1 instanceof Doctor));
	System.out.println("h1 instance of object " +(h1 instanceof Object));//T
	System.out.println("__________________________");
	

	System.out.println("s1 instance of Human " +(s1 instanceof Human));//T
	System.out.println("s1 instance of Student " +(s1 instanceof Student));//T
	System.out.println("s1 instance of Trainer " +(s1 instanceof Trainer));//F
	System.out.println("s1 instance of Doctor " +(s1 instanceof Doctor));//F
	System.out.println("__________________________");
	System.out.println("s1 instance of object " +(s1 instanceof Object));//T
	System.out.println("__________________________");

	
	
	System.out.println("t1 instance of Human " +(t1 instanceof Human));//T
	System.out.println("t1 instance of Student " +(t1 instanceof Student));//T
	System.out.println("t1 instance of Trainer " +(t1 instanceof Trainer));//t
	System.out.println("t1 instance of Object " +(t1 instanceof Object));//T
	System.out.println("__________________________");
	System.out.println("b1 instance of Bird " +(b1 instanceof Bird));//T
	System.out.println("b1 instance of Sparrow " +(b1 instanceof Sparrow));//T
	System.out.println("b1 instance of Object " +(b1 instanceof Object));//T
System.out.println("++++++++++++++++++++++++++++++++++++++");
	Ball ball1  = new Ball();
	System.out.println("ball1 instanceof Ball " + (ball1 instanceof Ball));
	System.out.println("ball1 instanceof Object " + (ball1 instanceof Object));
	
}
}
