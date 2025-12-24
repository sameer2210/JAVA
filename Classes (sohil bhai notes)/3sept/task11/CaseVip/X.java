public class X{
	int a;
	static int b;
	void m1(){
		System.out.println(this + "m1 method object");
	}
	void m2(){
		System.out.println(this + "m2 method object");
	}
	void m3(){
		System.out.println(a);
		System.out.println(b);
		m2();
		ms1();
	}
	
	static void ms1(){
		//CTE System.out.println(this);
		//error: non-static variable this cannot be referanced from a static context
	
	System.out.println("static method sm1() ");
	}
	
	static void ms2(){
		//sop(this);
		//error: non-ststic variable this cannot be referenced from a static context
	
	System.out.println("static method sm2() ");
	}
	
	static void ms3(){
		//system.out.println(this);
		//error : non -static variable this can't be referenced from a static context
		
	System.out.println("static method sm3() ");
	
		//CTE sop(a);
		//non-static(object) variable can't be referenced from a static context
	
	System.out.println(b);
	
		//CTE m1();
		//non -static (object) method m1() can't be referenced from a static context
	
	ms1();

	}
	
}//end class
	
	
	
	
	
	
	
	
	
	
	