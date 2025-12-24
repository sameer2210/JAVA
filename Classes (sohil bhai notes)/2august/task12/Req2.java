public class Req2 {
	public static void main(String [] args) {
	
		String original ="sis   java    nit";
		//output ="sis java nit";
		
		String temp=original;
		//loop will run till 2 space contain "--"
		while(temp.contains("   ")){
			
			temp=temp.replace("   "," ");
		}
		System.out.println(original);
		System.out.println(temp);
	
}
}