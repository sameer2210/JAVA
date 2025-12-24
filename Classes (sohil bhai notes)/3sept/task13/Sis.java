public class Sis{

//object /non static block

	{
		System.out.println("non-Static /Object Block" +this);
	}
	
	Sis(){
		System.out.println("constructor called " + this);
	}
	
	//Static block 1 time load only
	static {
		System.out.println("Static Block******");
	}
	
}//end class