public class Demo2 {
	public static void main(String args[]){
	
	java.util.Random rand = new java.util.Random();
	// sometime ball sometime No Ball 
	
			Ball b1 = null;
		if(rand.nextBoolean()){
			b1 = new Ball();
		}
		System.out.println(" b1 = " + b1 );
	
	try{ 
			b1.bounce();
	}catch(NullPointerException e){
		// System.out.println("Error : " + e.getMessage());
		System.out.println("Error :  No Ball found for Bouncing ");
	}
	
	}//end main
}//end class