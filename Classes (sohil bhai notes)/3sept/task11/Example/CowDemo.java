public class CowDemo{
	public static void main(String args[]){
	
	Cow.whatIsCow();
	
	System.out.println(Cow.totalCows);
	System.out.println(Cow.COLOR_TYPES);
		Cow cow1 = null;
		Cow cow2 = null;
		Cow cow3 = null;
		Cow cow4 = null;
		
		cow1 = new Cow("ganga","white",180f);
		cow2 = new Cow("riya","black",250f);
		cow3 = new Cow("hansita","red",450f);
		cow4 = new Cow("srashti","brown",350f);
		System.out.println(Cow.totalCows);
		
		cow1.details();
		cow2.details();
		cow3.details();
		cow4.details();
		System.out.println("__________________");
		
		cow1.eat();
		cow2.eat();
		cow3.eat();
		cow4.eat();
		
	}//end main
	
}//end class