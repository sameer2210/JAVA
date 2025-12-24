public class Cow {
	String name;
	int totalCow;		//0 it must be static type its not be obj type
	int totalCowPopulation;	//static
	
	public Cow(){
		totalCow++;
		totalCowPopulation++;
		System.out.println(this + " object created toalCow# "+ totalCow +"totalCowPopulation= " +totalCowPopulation);
	}
	
}//end class