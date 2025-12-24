 public class Sis1 {
	public static void main(String args[]){
	String str="SISJAVA";

	for(int task=1;task<=7;task++){
		//sub task1
		System.out.print(str);
		//sub task2
		System.out.print("\n");
	}	
System.out.println("________________________________________________");

	for(int task=1;task<=str.length();task++){
	 //sub task1
		for(int print=1;print<=str.length();print++){
			char ch = str.charAt(task-1);
		  System.out.println(ch);
		  }
	//sub task2
		System.out.print("\n");
	}
	
}
}