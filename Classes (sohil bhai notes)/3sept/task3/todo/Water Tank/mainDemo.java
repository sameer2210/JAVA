public class mainDemo{

	public static void main(String args[]){
	
		WaterTank wt  = new WaterTank();	
		
		wt.showInfo();
		 System.out.println("_____________________");
		
		Human h1=new Human();
		h1.name="karan";
	        h1.fill(5,wt);
		wt.showInfo();
	        h1.fill(15,wt);
		wt.showInfo();
	        h1.fill(2,wt);
		wt.showInfo();
		 
		 System.out.println("_____________________");
	}


}