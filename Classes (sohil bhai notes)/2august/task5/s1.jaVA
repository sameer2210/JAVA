public class S1 {
	public static void main(String args[]){
	
	int []data= new int[12];
	System.out.println("ref "+data);
	System.out.println("total element "+ data.length);
	
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

	for (int e=1;e<=data.length;e++){
	System.out.println(e+" # =  " +data[e-1]);
		System.out.println();
	}
	
}
}
		