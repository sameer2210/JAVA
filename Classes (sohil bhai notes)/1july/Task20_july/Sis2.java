 public class Sis2 {
	public static void main(String args[]){
	String str="SISJAVA";
		
	for(int task=1;task<=str.length();task++){	//ROW
	 //sun task partA
		for(int print=1;print<=task;print++){	//COL
			char ch =str.charAt(print-1);
			System.out.print(ch);
		  }
	//sub task PartB
		for(int plus=1;plus<=str.length()-task;plus++){
			System.out.print("+");
		}
	//sub task PartC
		System.out.print("\n");
	}
System.out.println("______________________________________________");

	for(int task=1;task<=str.length();task++){	//ROW
	//sub task partA
		for(int plus=1;plus<=str.length()-task;plus++){
			System.out.print("+");
		}
	//sub task PartB
		for(int print=1;print<=task;print++){	//COL
			char ch =str.charAt(print-1);
			System.out.print(ch);
		}
	//sub task PartC
		System.out.print("\n");
	}

}
}

