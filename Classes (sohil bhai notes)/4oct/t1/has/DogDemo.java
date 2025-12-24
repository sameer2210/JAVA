public class DogDemo {

public static void main(String [] args){

	Human h1 = new Human(" Aayush ","tommy");
	System.out.println(h1.whatisYourName());
//	System.out.println(h1.whatIsLengthOfYourName());
//	System.out.println(h1.whatIsYourNameFirstChar());
	System.out.println("___________________________");
	
//	System.out.println(h1.whatIsYourDogName());
	h1.doSomethingWithYourDog();
	
	System.out.println("_____________________________");
	Dog myDog = new Dog("tiger");
	h1.doSomethingWithGivenDog(myDog);
	
	}
	
}//end class