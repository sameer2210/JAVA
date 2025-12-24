 public class Otpdemo2{

	public static void main(String args[]){
	java.util.Random rand  = new java.util.Random();
	String otp="";
	
	for(int reqChar=1;reqChar<=4;reqChar++){
	int asciiUpperLower =rand.nextBoolean() ?(rand.nextInt(26)+65) : (rand.nextInt(26)+97);
		char ch = (char)asciiUpperLower;
		otp = otp+ ch;
	}
	System.out.println("4 digit otp ="+ otp);

System.out.println("______________________________________________");
	
	for(int reqChar=1;reqChar<=4;reqChar++){
		if(rand.nextInt(2)==0){	
		int asciiUpperLower = rand.nextBoolean() ?(rand.nextInt(26)+65) : (rand.nextInt(26)+97);
		otp = otp+ (char)asciiUpperLower;
		}else{
			otp = otp+rand.nextInt(10);
		}
	}
	System.out.println("4 digit otp = "+ otp);
	
}
}


