public class S7 {
	public static void main(String args[])throws Exception{
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	java.util.Random rand = new java.util.Random();
	int [][]data= null;
	//creat required array
	System.out.println("how many set required ? ");
	data = new int [scan.nextInt()][];	
	 for(int set=1;set<=data.length;set++){
	  System.out.println("in set# " + set +"how many element required?");
		data[set-1] = new int[scan.nextInt()];
	  }
	//fill data
	
	for(int set=1;set<=data.length;set++){
	 for(int e=1;e<=data[set-1].length;e++){
		data[set-1][e-1]=rand.nextInt(1000);
		}
	 }	
	for(int set=1;set<=data.length;set++){
	 System.out.println("set# " +set);
	 System.out.println("setref="+data[set-1]);
	 System.out.println("total elements="+data[set-1].length);
		for(int e=1;e<=data[set-1].length;e++){
		 int value = data[set-1][e-1];
		  System.out.println("element# "+e +"= "+ value);
			Thread.sleep(300);
		}
	System.out.println("____________________________________");
	}
	System.out.println("__________matrix__________");
	
	for(int set=1;set<=data.length;set++){
	 for(int e=1;e<=data[set-1].length;e++){
		int value = data[set-1][e-1];
		System.out.printf("%5d ", value);
			Thread.sleep(300);
		}
		System.out.println("\n");
	}
	
}
}
