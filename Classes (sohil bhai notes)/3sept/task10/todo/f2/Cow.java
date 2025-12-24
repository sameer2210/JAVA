
public class Cow {
	String name;
    int totalCow;//0 it must be static type its not obj var
    int totalCowPopulation;	//  static  
    
	public Cow() {
		totalCow++;
		totalCowPopulation++;
		System.out.println(this  +" object created totalCow#"+ totalCow  +" totalCowPopulation= " +totalCowPopulation );
	}
  
  
}
