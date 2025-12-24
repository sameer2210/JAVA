public class Y extends X {
	
@Override
	void mySpecialMethodNumber2(){
		System.out.println(this + " m2 from Y ........ Override ");
	}

	// error : method does not Override or implement a method from a superType method
	
@Override
	void myspecialMethodNumber3(){
		System.out.println(this + " m3 from Y ...... Override ____");
	}

	
@Override
	public String toString(){
		return "this is y class object info ";
	}
	
}//end class