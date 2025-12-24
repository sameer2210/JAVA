public class Magnifier {
	
	private Magnifier(){
	 System.out.println(this + " created...# " + ++total);
	}
	
	private static Magnifier magniObject;
	
	public static Magnifier getMagnifier(){
		if(magniObject==null){
		magniObject==null){
	}
	return magniObject;
	}
	
}//end class