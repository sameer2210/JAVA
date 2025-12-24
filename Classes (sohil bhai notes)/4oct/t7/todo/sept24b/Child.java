
public class Child extends Parent{
	
	String name;   //overr hidden  super.name
	String mobile;////overr hidden  super.mobile
	String email;
	String progLang;

	
	public Child(String name, String mobile, String email, String progLang,
			String parentName, String parentMobile, float parentCash) {
		super(parentName,parentCash,parentMobile);
		this.name=name;
		this.mobile=mobile;
		this.email=email;
		this.progLang=progLang;
		
	}
	//override
	void show() {
		System.out.println(this + " child and parent info");
		System.out.println("parent  super.name " + super.name );
		System.out.println("child  name " + name );
		System.out.println("child  this.name " + this.name );
		System.out.println("_____________________________________");
		System.out.println("parent  super.mobile " + super.mobile );
		System.out.println("child  mobile " + mobile );
		System.out.println("child  this.mobile " + this.mobile );
		System.out.println("_____________________________________");
		
		System.out.println("child  email " + email );
		System.out.println("child  this.email " + this.email );
		System.out.println("child  progLang " + progLang );
		System.out.println("child  this.progLang " + this.progLang );
		System.out.println("_____________________________________");
		//System.out.println( email ); //OK
		//System.out.println( this.email );//OK
		//System.out.println( super.email );//ERRoR  CTE  not exist in parent class
		
		System.out.println("cash  = "+cash);  //ok parent
		System.out.println("super.cash  = "+super.cash);//ok parent
		System.out.println("this.cash  = "+this.cash);// ok parent because child has not 		present then it access parent data 
		//System.out.println(super.cash);
		
	}
	
}
