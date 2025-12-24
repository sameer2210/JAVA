import java.util.Random;

public class NumberBox{
private int number;

	public NumberBox(){
		number = new Random().nextInt(1000) + 1;
		System.out.println(this + " created with no arg constructor");
	}
	public NumberBox(int number){
		this.number=number;
		System.out.println(this + " created with 1 arg constructor");
	}
	
	void showNumber(){
		System.out.println(this + " number = " + number);
		if((number%2==0) || ((number%2)*(-1)==0)){
		}else{
			System.out.println("Odd number");
		}
		
		//prime number ??
		if(number>1){
		
		System.out.println();
		}else{
		System.out.println("Not prime");
		}
		
		//palindrom ??
		//armstromg ??
	}
	
	
}//end class