public class SisSpecial {
	public static void main(String args[]){
	
		Human h1 = new Human();
		Student s1 = new Student();
		Trainer t1 = new Trainer();
		
	System.out.println(t1);
	System.out.println("t1 instence Of Trainer "+ (t1 instanceof Trainer));		//t
	System.out.println("t1 instence Of Student "+ (t1 instanceof Student));	//t
	System.out.println("t1 instence Of Human "+ (t1 instanceof Human));		//t
	System.out.println("_______________________________");
	
	System.out.println(s1);
	System.out.println("s1 instance of Trainer "+ (s1 instanceof Trainer));	//f
	System.out.println("s1 instance of Student "+ (s1 instanceof Student));	//t
	System.out.println("s1 instance of Human "+ (s1 instanceof Human));	//t
	System.out.println("_____________________________________________________");
	
	System.out.println(h1);
	System.out.println("h1 instance of Trainer " + ( h1 instanceof Trainer));		//f
	System.out.println("h1 instance of Student " + ( h1 instanceof Student));	//f
	System.out.println("h1 instance of Human " + ( h1 instanceof Human));		//t
	System.out.println("h1 instance of Singer " + ( h1 instanceof Singer));		//f
	
	
	
	}//end main
}//end class