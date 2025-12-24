
public class Y extends X {
		int c=300;
		int b=400;
		
		public Y() {
			System.out.println("Y object created...."+ this );
		}
		
	void sumShow(){
		System.out.println("X a = " +a);
		System.out.println("X super.b = "+ super.b);
		System.out.println("y b = " + b);
		System.out.println("Y c = " + c);
		System.out.println("__________________");
		
		int sum = a + super.b + b +c;
		System.out.println("sum " + sum);
	}
	
}//end class