public class S5 {
	public static void main(String args[])throws Exception{
		
	//int [][]data= new int[2][6];
	int [][]data= null;
	System.out.println(data);
	//RTE System.out.println("total set " +data.length);
	
	data = new int [2][];
	System.out.println(data);
	System.out.println("total set "+ data.length);
	System.out.println("set1 " +data[0]);
	System.out.println("set2 " +data[1]);	
	System.out.println("__________________________________");
	//creat first set data array
	data[0] = new int[6];

	System.out.println("set1 "+data[0]);
	System.out.println("set2 "+data[1]);
	//created 2nd set data array
	data[1] = new int[6];
		
	System.out.println("set1 " +data[0]);
	System.out.println("set2 " +data[1]);
	System.out.println("set1 size = " +data[0].length);
	System.out.println("set2 size = " +data[1].length);	
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	for(int set=1;set<=data.length;set++){
	 System.out.println("set'# " +set);
	  for(int e=1;e<=data[set-1].length;e++){
		System.out.println("enter set# "+set +" value"+e);
		data[set-1][e-1] = scan.nextInt();
		}
	
			Thread.sleep(2500);
	}
	for(int set=1;set<=data.length;set++){
	 System.out.println("set# "+set);
	 System.out.println("setref= "+data[set-1]);
	 System.out.println("total elements="+data[set-1].length);
		for(int e=1;e<=data[set-1].length;e++){
		 int value = data[set-1][e-1];
		  System.out.println("element# "+e +" = " + value);
			Thread.sleep(200);
		}
	System.out.println("___________________________________");
	}

}
}
