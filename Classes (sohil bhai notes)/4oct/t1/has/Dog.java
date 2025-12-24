import java.util.Random;

public class Dog {
	String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	void run(){
		System.out.println(this + "runing " + name);
	}
	
	void eat(){
		System.out.println(this + "eating " + name);
	}
	
	void jump(){
		System.out.println(this + " jumping " + name);
	}
	
	
}//end class