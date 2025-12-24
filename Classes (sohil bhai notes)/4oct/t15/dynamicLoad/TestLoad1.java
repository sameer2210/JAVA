public class TestLoad1 {
	public static void main(String args[]){
	
	//static must know which blue print required
	// load it // create object 	//then use object
	//load class, static block, constractor, create object then method
	
	java.util.Random rand = new java.util.Random();
		System.out.println(rand);
		System.out.println(rand.nextInt());
		System.out.println("___________________");
		
			Trainer t = new Trainer();
				t.teach();
			
	//load class, static block, constructor, create object then method	
 
	
	}//end main
}//end class