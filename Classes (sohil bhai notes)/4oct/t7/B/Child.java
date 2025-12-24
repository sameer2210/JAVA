public class Child extends Parent {
	String name;	//over hidden super.name
	String mobile;	//over hidden super.mobile
	String email;
	String progLang;
	
	public Child(String name,String email,String progLang,
				String parentName, String parentMobile, float parentCash){
		super(parentName,parentCash,parentMobile);		
		this.name=name;
		this.mobile=mobile;
		this.email=email;
		this.progLang=progLang;
	}
	
	//override
	void show(){
		System.out.println(this + "child and parent info");
		System.out.println("parent super.name "+ super.name);
		System.out.println("child name "+this.name);
		System.out.println("child  this.name "+ this.name);
		System.out.println("______________________________");
		
		System.out.println("parent super.mobile "+ super.mobile);
		System.out.println("child mobile " + mobile );
		System.out.println("child this.mobile "+ this.mobile);
		System.out.println("_________________________________");
		
		System.out.println("child email " +email );
		System.out.println("child this.email "+ this.email );
		System.out.println("child progLang "+progLang );
		System.out.println("child this.progLang "+ this.progLang );
		System.out.println("___________________________________");
		
		//System.out.println(email);		//OK
		//System.out.println(this.email);	//OK
		//System.out.println(super.email);//ERROR CTE nor exist in parent class
		
		System.out.println("cash = " + cash);		//OK Parent
		System.out.println("super.cash = " +super.cash);	//OK Parent
		System.out.println("this.cash = " +this.cash);		//OK Parent because child has not
		//System.out.println(super.cash);
	}
	
}//end class