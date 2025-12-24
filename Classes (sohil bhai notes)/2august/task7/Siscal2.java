public class Siscal2 {
	public static void main(String args[]){
	
	if(args.length==0){
	 System.out.println("no number passed plz pass numbers.....");
	  System.exit(0);
	}
	
	int sum = 0;
	for(int e=1;e<=args.length;e++){
	 String numStr = args[e-1];
		int temp = Integer.parseInt(numStr);
		sum = sum + temp;
	}

	System.out.println("sum =" + sum);
	
}
}