public class Sun{

 private static int total;
 
	private Sun(){
	 System.out.println(this + " created...# " + ++total);
	}
	
 private static Sun sunObject;
	
	public static Sun getSunObject(){
	
		if (sunObject == null){
		sunObject = new Sun();
	}
	return sunObject;
 }
 
}//end class 