public class CaseDemo1 {
	public static void main(String args[]){
	
		X ref1 = new X();												  //all true
			System.out.println(ref1 instanceof X);
			System.out.println(ref1 instanceof I1);
			System.out.println(ref1 instanceof I2);
			System.out.println("________________\n");
			
		I1 ref2 = new X();
			System.out.println(ref2 instanceof X);
			System.out.println(ref2 instanceof I1);
			System.out.println(ref2 instanceof I2);
			System.out.println("_______________\n");
	
		I2 ref3 = new X();
			System.out.println(ref3 instanceof X);
			System.out.println(ref3 instanceof I1);
			System.out.println(ref3 instanceof I2);
	
	
	}//end main
}//end class