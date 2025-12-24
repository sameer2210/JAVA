
public class Software {

	final void min(){System.out.println(this + "---- sw min ");}
	final void max(){System.out.println(this + " ----sw max ");}
	final void restore(){System.out.println(this + " ---- restore");}
	final void move(){System.out.println(this + "---- sw move ");}
	
	void open(){System.out.println(this + " --- sw opened ");}
	void close(){
		System.out.println(this + " --- sw close ");
			System.exit(0);
	}
	
	
}//end class