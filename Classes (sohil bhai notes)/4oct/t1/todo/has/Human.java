
public class Human {
	 private String name;
	 private Dog    kutta;
	 private Heart  heart ;
	 public Human(String name,String dogName) {
		 this.name=name;
		 kutta =new Dog(dogName);
		 heart  = new Heart();
	 }

	String whatisYourName(){
		return name;
	} 
	public int whatIsLengthOfYourName(){
		return name.length();
	} 
	public char whatIsYourNameFirstChar(){
		return name.charAt(0);
	}

	public String whatIsYourDogName() {
		return kutta.name;
	}

	public void doSomethingWithYourDog() {
		System.out.println(name +" action performer with dog "+kutta);
		kutta.eat();
		kutta.jump();
		kutta.run();
	}

	public void doSomethingWithGivenDog(Dog givenDog) {
		System.out.println(name +" action performer with given dog " + givenDog);
		givenDog.eat();
		givenDog.jump();
		givenDog.run();
		System.out.println("Done action");
	}
	
	void heartAction(){
		heart.pump();
		
	}
}
