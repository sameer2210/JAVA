
public class Student {
	
	String name;
		int totalEatAndAns;
	
	void whatYouEat(){
		System.out.println(this + " name " + name + " eat# " + ++totalEatAndAns );
		
		whatYouEat();
	}	
		
}//end class		