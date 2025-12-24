public class S6 {
	public static void main(String args[])throws Exception{
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	int [][]data = null;
	//create required array 
	System.out.println("how many set required ? ");
	data = new int [scan.nextInt()][];
	for(int set=1;set<=data.length;set++){
	 System.out.println("int set # "+set +" how many element required?");
	 	data[set-1] = new int[scan.nextInt()];
	}
	//fill data

	for(int set=1;set<=data.length;set++){
	 System.out.println("set# " + set);
		for(int e=1;e<=data[set-1].length;e++){
		 System.out.println("enter set # " +set +"value"+e);
			data[set-1][e-1] = scan.nextInt();
		}
	} 	
	
	for(int set=1;set<=data.length;set++){
	 System.out.println("set # "+set);
	 System.out.println("setref= "+data[set-1]);
	 System.out.println("total elements= "+data[set-1].length);
		for(int e=1;e<=data[set-1].length;e++){
		 int value = data[set-	1][e-1];
		 System.out.println("element# "+e +" = " + value);
			Thread.sleep(300);
		}
	 System.out.println("_______________________________");
	}

}
}
