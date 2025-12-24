public class HumanDemo{
	public static void main(String args[]){
	
	System.out.println(Human.totalPopulation);
	System.out.println("__________________________");
	
	Human h1 = new Human();
	Human h2 = new Human();
	Human h3 = new Human();
	
	System.out.println("___________________________");
	h1.show();		//null 
	h2.show();		//null
	h3.show();		//null
	
	h1.name="sameer";
	h2.name="raj";
	h3.name="ayush";
	h1.age=21;
	h2.age=20;
	h3.age=19;
	
	System.out.println("_____________________________");
	h1.show();		//name : sameer age :21
	h2.show();		//............................
	h3.show();		//..................
	
	System.out.println("____________________________");
	System.out.println(h1.totalPopulation);	//3
	System.out.println(h2.totalPopulation);	//3
	System.out.println(h3.totalPopulation);	//3
	System.out.println("____________________________");

	System.out.println("totalPopulation = " +Human.totalPopulation);	//3
	
	
	
	}//end main
}//end class