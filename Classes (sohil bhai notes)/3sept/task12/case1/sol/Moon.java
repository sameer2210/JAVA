public class Moon {

//step1 

	private Moon(){
	 System.out.println(this + " created " );
	}

//step2 
	
	private static Moon moonRef;
	
//step3

	public static Moon getInstance(){
//logic 
	if(moonRef==null){
		moonRef = new Moon();
	}
	return moonRef;
	}
	
}//end class 
