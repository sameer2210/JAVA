public class WaterTank{

	float totalWater;
	
		void absorb(float water){
		System.out.println("water tank absorb " +water + "Ltr");
			totalWater+= water;
		}
		
		void showInfo(){
		 System.out.println("__________water_info____________");
		  System.out.println("total water " + totalWater + " ltr");
		  
		  System.out.println("______________________________");
		}
		 
}//end class