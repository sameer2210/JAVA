public class Scanlive {
	public static void main(String args[]){

/*	boolean happyOption;
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("are you happy ? true/false");
	happyOption =scan.nextBoolean();
	
	if(happyOption){
		System.out.println("good");
	}else{
		System.out.println("try to be happy");
	}
*/
	System.out.println("__________________________________________________________________________________________________");
/*
	String happy=null;
	java.util.Scanner Scan = new java.util.Scanner(System.in);
	
	System.out.println("type password............? sameer/don't know");
	happy=Scan.nextLine();

	if("sameer".equalsIgnoreCase(happy)){
		System.out.println("go to hospital");
	}else{
		System.out.println("then why are you act like passionate");
	}
*/
	System.out.println("__________________________________________________________________________________________________");


	java.util.Scanner Scan = new java.util.Scanner(System.in);
	
	System.out.println("are you passionate ? y/n");

	String temp =Scan.nextLine();
	temp = temp.trim();
	temp = temp.toLowerCase();
	char happy = temp.charAt(0);
	
	if( 'y'==happy){
		System.out.println("go to hospital");
	}else{
		System.out.println("then why are you act like passionate");
	}

}
}