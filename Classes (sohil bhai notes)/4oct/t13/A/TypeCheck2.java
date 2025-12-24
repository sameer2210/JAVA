public class TypeCheck2 {
	public static void main(String args[]){

			Human h1 = new Human();
			Student s1 = new Student();
			Trainer t1 = new Trainer();
			Doctor d1 = new Doctor();
			Sparrow sp1 = new Sparrow();
			Ball ball1 = new Ball();
		
		System.out.println("h1 instance of Object " + (h1 instanceof Object));		//t
		System.out.println("s1 instance of Object " + (s1 instanceof Object));		//t
		System.out.println("t1 instance of Object " + (t1 instanceof Object));			//t
		System.out.println("d1 instance of Object " + (d1 instanceof Object));		//t
		System.out.println("sp1 instance of Object " + (sp1 instanceof Object));	//t
		System.out.println("ball1 instance of Object " + (ball1 instanceof Object));//t
		System.out.println("__________________________");
		

		
	}//end class
}//end class