public class Mood {
	public static void main(String args[]){

/*	String moodType=null;
	int moodOption = ((int)(Math.random()*10))%2;
	
	if(moodOption==0){
		moodType="happy";
	}else{
		moodType="very happy";
	}
		System.out.println("today student mood is "+moodType);
*/

	int num1 = (int) (Math.random()*100);
	int num2 = (int) (Math.random()*100);
	int num3 = (int) (Math.random()*10);
	int num4 = (int) (Math.random()*10);
	
	char ch1 = (char)(65 +(num1%26));
	char ch2 = (char)(65 +(num2%26));
	
	String generatedOtp ="";

	generatedOtp = generatedOtp+ch1+num3+ch2+num4;
	System.out.println("your otp is "+generatedOtp);
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("enter your email/sms otp");
	
	String inputOtp = scan.next();
	
	if(generatedOtp.equals(inputOtp)){
	 System.out.println("otp matched");
	}else{
		System.out.println("sorry otp not matched try again");
	}

}
}















