public class Arraytest3 {
	public static void main(String args[]){
	
	int []arr= new int[5];
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	System.out.println("____________________________________");
	arr[0]=1001;
	arr[1]=1002;
	arr[2]=1003;
	arr[3]=1004;
	arr[4]=1005;
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	
	for(int pos=1;pos<=5;pos++){
	System.out.println("sno"+pos +"=" +arr[pos-1]);
	}
}
}
