import java.util.Random;


public class CaseStudy1 {

	public static void main(String[] args) {
		Human list[] ={
				new Singer("soun"),
				new Dancer("mithun")
				};
		
	 	int pickIndex =new Random().nextInt(list.length);
	 	//0-1
		Human pickHuman = list[pickIndex];
		System.out.println(pickHuman);
		
		pickHuman.drinkWater();
		pickHuman.eat();
		pickHuman.speak();
		pickHuman.sit();
		
		//pickHuman.sing(); CTE big mistake
		//pickHuman.dance();CTE big mistake
		
		//dancer or singer
		if(pickHuman instanceof Singer){
			//pickHuman.sing(); CTE
			System.out.println("are ye to singer hain gaa sakta hai");
			Singer singer  = (Singer)pickHuman;
			singer.sing();
		}
		
		if(pickHuman instanceof Dancer){
			System.out.println("are ye to Dancer hain dance sakta hai");
			//pickHuman.dance();
			//Dancer dancer = pickHuman;//CTE
			Dancer dancer =(Dancer) pickHuman;//Ok
			dancer.dance();
		}
		
		
		
		
		

	}

}
