public class Persondemo1 {
	public static void main(String args []) {
	
	Person p1 = new Person();
	Person p2 = new Person();
	
	p1.name ="Nobita";
	p1.gender ="male";
	p1.age =21;
	
	p2.name ="Sizuka";
	p2.gender ="female";
	p2.age =18;
	System.out.println("p1 = " + p1);
	System.out.println("p2 = " + p2);
	
	System.out.println("___________________________________");
	p1.aboutMySelf();
	System.out.println("___________________________________");
	p2.aboutMySelf();
	
}
}
