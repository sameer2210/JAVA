public class S2 {
	public static void main(String args[]) {
	
	int [][]data= new int[2][6];
	System.out.println("total set " +data.length);
	System.out.println("ref "+data);		
	//set 1
	System.out.println("set1" + data[0]);
	System.out.println("set1 total element " + data[0].length);
	System.out.println("set2 "+data[1]);
	System.out.println("set1total element "+ data[1].length);
	//set 2
	System.out.println("first set data");
	System.out.println(data[0][0]);
	System.out.println(data[0][1]);
	System.out.println(data[0][2]);
	System.out.println(data[0][3]);
	System.out.println(data[0][4]);
	System.out.println(data[0][5]);
	
System.out.println("____________________________________________");
	
	System.out.println("2nd set data");
	System.out.println(data[1][0]);
	System.out.println(data[1][1]);
	System.out.println(data[1][2]);
	System.out.println(data[1][3]);
	System.out.println(data[1][4]);
	System.out.println(data[1][5]);
	
	//update 1st set data
	data[0][0]=10;
	data[0][1]=20;
	data[0][2]=30;
	data[0][3]=40;
	data[0][4]=50;
	data[0][5]=60;

	//update 2nd set data
	data[0][1]=70;
	data[0][2]=80;
	data[0][3]=111;
	data[0][4]=222;
	data[0][5]=333;
	data[0][6]=444;

	System.out.println("_____________after update____________");
	
	System.out.println("first set data");
	System.out.println(data[0][0]);
	System.out.println(data[0][1]);
	System.out.println(data[0][2]);
	System.out.println(data[0][3]);	
	System.out.println(data[0][4]);
	System.out.println(data[0][5]);
	
	System.out.println("2nd set data");
	System.out.println(data[1][0]);
	System.out.println(data[1][1]);
	System.out.println(data[1][2]);
	System.out.println(data[1][3]);
	System.out.println(data[1][4]);
	System.out.println(data[1][5]);

	

	   System.out.println(data[0][0]);
	   System.out.println(data[0][1]);
	   System.out.println(data[0][2]);
	   System.out.println(data[0][3]);
	   System.out.println(data[0][4]);
	   System.out.println(data[0][5]);
	  
	  
	  
	   System.out.println("2nd set data");
	   System.out.println(data[1][0]);
	   System.out.println(data[1][1]);
	   System.out.println(data[1][2]);
	   System.out.println(data[1][3]);
	   System.out.println(data[1][4]);
	   System.out.println(data[1][5]);
	
/*
	   data[0]=10;
	   data[1]=20;
	   data[2]=30;
	   data[3]=40;
	   data[4]=50;
	   data[5]=60;
	   data[6]=70;
	   data[7]=80;
	   data[8]=111;
	   data[9]=222;
	   data[10]=333;
	   data[11]=444;
*/
	for(int e=1;e<=data.length;e++){
	System.out.print(e+"# =" + data[e-1]);
		System.out.println();
	}
	

}
}
