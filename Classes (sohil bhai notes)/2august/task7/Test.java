public class Test {
	public static void main(String args[]){
	
	//size 8 	total element 5
	String arr[] ={"aaa","bbb","ccc","ddd","eee",null,null,null};
	int totalElement=5;
	for(int e=1 ;e<=totalElement;e++){
	 System.out.println("index =" +(e-1) +"pos = "+e +" = " +arr[e-1]);
	}

	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("enter delete pos 1-5 ");
	int deletePos = Integer.parseInt(scan.nextLine());
	System.out.println();

	int deleteIndex = deletePos-1;
	int lastShiftIndex = totalElement-1;

	//shift element
	for(int s=deleteIndex;s<=lastShiftIndex;s++){
	 System.out.println(s);
	  arr[s] = arr[s+1];
	}
	totalElement--;
	
	System.out.println("____________________________");
	for(int e=1 ;e<=totalElement;e++){
	System.out.println("index =" +(e-1) +" pos = "+e+" = " +arr[e-1]);
	}

}
}

