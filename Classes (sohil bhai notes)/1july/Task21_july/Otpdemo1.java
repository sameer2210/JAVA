
 public class Otpdemo1 {
	public static void main(String args[]){

	java.util.Random rand=new java.util.Random();
	String otp="";
	
	for(int reqChar=1;reqChar<=4;reqChar++){
/*		int digit = rand.nextInt(10);
		otp = otp+ digit;
	}
	
	System.out.println("4digit otp ="+ otp);

System.out.println("______________________________________________");
	
	int asciiUpper = rand.nextInt(26)+65;
		char ch = (char)asciiUpper;
		otp = otp+ ch;
	}
	System.out.println("4 digit otp = "+otp);
*/	
System.out.println("______________________________________________");
	
	int asciiUpperLower;
		if(rand.nextBoolean()){
		//upper logic
		asciiUpperLower= rand.nextInt(26)+65;
		}else{
		//lower logic
		asciiUpperLower= rand.nextInt(26)+97;
		}
	char ch = (char)asciiUpperLower;
	otp = otp+ ch;
	}
	System.out.println("4digit otp ="+ otp);

	
}
}
