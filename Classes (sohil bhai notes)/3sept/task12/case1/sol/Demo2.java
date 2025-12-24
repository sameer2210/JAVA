public class Demo2{
	public static void main(String args[]){
	
	System.out.println("___________________");
/*	
		Moon chandaMama = new Moon();
		Moon eidKaChand = new Moon();
		Moon chand  = new Moon();
		Moon chandrama = new Moon();
*/
	
	Moon chandaMama = Moon.getInstance();
	Moon eidKaChand = Moon.getInstance();
	Moon chand = Moon.getInstance();
	Moon chandrama  = Moon.getInstance();
	
	System.out.println("chandaMama = " + chandaMama);
	System.out.println("eid Ka chand = " + eidKaChand);
	System.out.println("chand = " + chand);
	System.out.println("chandrama = " + chandrama);

	
		
	}//end main
}//end class