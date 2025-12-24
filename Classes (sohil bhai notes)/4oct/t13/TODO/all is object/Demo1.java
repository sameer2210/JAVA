
public class Demo1 {
public static void main(String[] args) {
  //human has 2 method
	  
	Human h1  = new Human();
	h1.eat();
	h1.speak();
	System.out.println("______________________");
	//student has 4
	Student  s1  = new Student();
	s1.eat();
	s1.speak();
	s1.read();
	s1.write();
	System.out.println("______________________");
	
	//Trainer has  5 method
	Trainer t1  = new Trainer();
	t1.eat();
	t1.speak();
	t1.read();
	t1.write();
	t1.teach();
	
	System.out.println("______________________");
	//doctor has 6 
	Doctor d1  = new Doctor();
	d1.eat();
	d1.speak();
	d1.read();
	d1.write();
	d1.checkup();
	d1.operation();
	System.out.println("______________________");
	//sparrow has 2 method   
	Sparrow b1 = new Sparrow();
	b1.fly();
	b1.sing();
	
	
	
}
}
