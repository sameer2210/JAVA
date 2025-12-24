
public class SisSpecialCase1 {

	public static void main(String[] args) {
		Parent p1  = new Parent();
		 p1.eat();//ok
	     p1.sleep();//ok
   
	    System.out.println("p1.password" + p1.password);
		p1.drinkWine();//CTE 
		p1.abuse();//CTE
	
	}

}
