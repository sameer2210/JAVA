
public class Demo1 {

	public static void main(String[] args) {
		Human h1  = new Human("Ramesh","tommy");
		System.out.println(h1.whatisYourName());
		System.out.println(h1.whatIsLengthOfYourName());
		System.out.println(h1.whatIsYourNameFirstChar());
		System.out.println("+++++++++++++++++++++++++");
		
		System.out.println(h1.whatIsYourDogName());
		h1.doSomethingWithYourDog();
		
		System.out.println("+++++++++++++++++++++++++++++++");
		Dog myDog  = new Dog("tiger");
		h1.doSomethingWithGivenDog(myDog);
		
		

	}

}
