public class TypeCheck1 {
	public static void main(String args[]){

			Human h1 = new Human();
			Student s1 = new Student();
			Trainer t1 = new Trainer();
			Doctor d1 = new Doctor();
			Sparrow sp1 = new Sparrow();
	System.out.println("h1 instance of Human " + (h1 instanceof Human));		//t
	System.out.println("h1 instance of Studnet " + (h1 instanceof Student));	//f
	System.out.println("h1 instance of Trainer " + (h1 instanceof Trainer));		//f
	System.out.println("h1 instance of Doctor " + (h1 instanceof Doctor));		//f
	System.out.println("h1 instance of Object " + (h1 instanceof Object));		//t
	System.out.println("______________________________________");
	
	System.out.println("s1 instance of Human " + (s1 instanceof Human));		//t
	System.out.println("s1 instance of Student " + (s1 instanceof Student));	//t
	System.out.println("s1 instance of Trainer " + (s1 instanceof Trainer));		//f
	System.out.println("s1 instance of Doctor " + (s1 instanceof Doctor));		//f
	System.out.println("---------------------");
	System.out.println("s1 instance of Object " + (s1 instanceof Object));		//t
	System.out.println("______________________________________");
	
	System.out.println("t1 instance of Human " + (t1 instanceof Human));	//t
	System.out.println("t1 instance of Student " + (t1 instanceof Student));	//t
	System.out.println("t1 instance of Trainer " + (t1 instanceof Trainer));	//t
	System.out.println("t1 instance of Object " + (t1 instanceof Object));		//t
	System.out.println("__________________________________");
	
	System.out.println("sp1 instance of Bird " + (sp1 instanceof Bird));				//t	
	System.out.println("sp1 instance of Sparrow " + (sp1 instanceof Sparrow));	//t
	System.out.println("sp1 instance of Object " + (sp1 instanceof Object));		//t	
	System.out.println("______________________________________");	
	
	
	Ball ball1 = new Ball();
	System.out.println("ball1  instance of Ball " + (ball1 instanceof Ball));			//t
	System.out.println("ball1  instance of Object " + (ball1 instanceof Object));	//t
	System.out.println("______________________________________");
	
	
	}//end class
}//end class