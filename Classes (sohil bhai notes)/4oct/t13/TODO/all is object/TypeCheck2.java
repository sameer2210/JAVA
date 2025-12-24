
public class TypeCheck2 {
public static void main(String[] args) {
  //human has 2 method
	  
	Human h1  = new Human();
	Student  s1  = new Student();
	Trainer t1  = new Trainer();
	Doctor d1  = new Doctor();
	Sparrow b1 = new Sparrow();
	Ball ball1  = new Ball();
	System.out.println("h1 instance of object " +(h1 instanceof Object));//T
	System.out.println("s1 instance of object " +(s1 instanceof Object));//T
	System.out.println("t1 instance of Object " +(t1 instanceof Object));//T
	System.out.println("d1 instance of Object " +(d1 instanceof Object));//T
	System.out.println("b1 instance of Object " +(b1 instanceof Object));//T
	System.out.println("ball1 instanceof Object " + (ball1 instanceof Object));
	
}
}
