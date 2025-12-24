public class Nitstu {
	public static void main(String args[]) {
	java.util.Random rand = new java.util.Random();
	
	for(int dept=1;dept<=3;dept++){
	System.out.println("dept#"+dept+"_________________");
	
		for(int year=1;year<=3;year++){
			System.out.println("\t year#"+year+"_______________");
			int totalStudent=rand.nextInt(5)+5;
			
			for(int student=1;student<=totalStudent;student++){
				int per=rand.nextInt(61)+40;
			 System.out.println("\t\t student#"+student+"_per="+per+"%");
	
			}
		}
	}

System.out.println("______________________________________________");

	int a=10;
	int b=5;

		System.out.println(a);
		System.out.println(b);


}
}




