public class Maindemo{
	public static void main(String args[]){
	
	WaterTank wt = new WaterTank();
	
	wt.showInfo();
	System.out.println("_____________________________");
	
	Human h1 = new Human();
	h1.name ="Sameer";
	
	h1.fill(5,wt);
		wt.showInfo();
	h1.fill(15,wt);
		wt.showInfo();
	h1.fill(2,wt);
		wt.showInfo();
		
		System.out.println("___________________________");
			
	
	}//end main
}//end class