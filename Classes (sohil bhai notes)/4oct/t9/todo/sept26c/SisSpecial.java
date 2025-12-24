
public class SisSpecial {

	public static void main(String[] args) {
		Human h1  = new Human();
		Student s1  = new Student();
		Trainer t1  = new Trainer();

		System.out.println(t1);
		System.out.println("t1 instanceof Trainer "+(t1 instanceof Trainer));
		System.out.println("t1 instanceof Student "+(t1 instanceof Student));
		System.out.println("t1 instanceof Human "+(t1 instanceof Human));
		System.out.println("__________________________________");
		System.out.println(s1);
		System.out.println("s1 instanceof Trainer "+(s1 instanceof Trainer));
		System.out.println("s1 instanceof Student "+(s1 instanceof Student));
		System.out.println("s1 instanceof Human "+(s1 instanceof Human));

		System.out.println("__________________________________");
		System.out.println(h1);
		System.out.println("h1 instanceof Trainer "+(h1 instanceof Trainer));
		System.out.println("h1 instanceof Student "+(h1 instanceof Student));
		System.out.println("h1 instanceof Human "+(h1 instanceof Human));
		System.out.println("h1 instanceof Human "+(h1 instanceof Singer));

	}

}
