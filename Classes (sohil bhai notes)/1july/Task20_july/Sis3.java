 public class Sis3 {
	public static void main(String args[])throws Exception{
/*	String str="SISJAVA";

	for(int task=1;task<=str.length();task++){		//ROW
	//sub task partA
		for(int plus=1;plus<=str.length()-task;plus++){
			System.out.print("  ");
		}
	//sub task partB
		for(int print=1;print<=task;print++){	//COL
			char ch =str.charAt(print-1);
			System.out.print(ch);
		 }
	//sub task partC
		System.out.print("\n");
	}
*/
System.out.println("_______________________________________________");

	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("enter your text");
	
	String str=scan.nextLine();
	 for(int task=1;task<=str.length();task++){	//ROW
	 //sub task partA
		for(int print=1;print<=task;print++){	//COL
			char ch =str.charAt(print-1);
			System.out.print(ch);
			Thread.sleep(40);
		}
	//sub task partB
		for(int plus=1;plus<=str.length()-task;plus++){
			System.out.print("+");
		}
	//sub task partC
		System.out.print("\n");
	}

}
}