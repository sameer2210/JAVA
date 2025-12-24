import java.util.Scanner;


public class BirdApp {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Enter bird (class name)type");
		String className  = new Scanner(System.in).nextLine();
		
		//load
		Class c  = Class.forName(className);
		//create object
		Object obj  = c.newInstance();
		
		//check object is bird or not
		if(obj instanceof Bird){
			System.out.println("object is  Bird type");
			Bird bird  = (Bird) obj;
			bird.fly();
			bird.makeSound();
		}else{
			System.out.println("object is not Bird type");
		}
		
		
    
	}

}
