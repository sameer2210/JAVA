package india.raipur;

	public class Other1 {
		
	void m1() {
		india.raipur.Parent p = new india.raipur.Parent();
			System.out.println(p.a);	//Ok public 
			System.out.println(p.b);	//CTE private
			System.out.println(p.c);	//CTE protected as private in other location for non child
			System.out.println(p.d);	//CTE default as private in other location
	}

}//end class	
		