public class Req {
	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);

	System.out.println("enter your int type number");
	long number =scan.nextLong();

	String str = number +" is ";
	
	if(number>=0&&number<=9){
		str = str+" 1 digit number";
	}else if(number>=10&&number<=99){
		str = str+" 2 digit number";
	}else if(number>=100&&number<=999){
		str = str+" 3 digit number";
	}else if(number>=1000&&number<=9999){
		str = str+"4 digit number";
	}else if(number>=10000&&number<=99999)   {
		str = str+"5 digit number";
	}//else{
		//str = str+"more than 5 digit number";
	//}
	
	System.out.println("**************************************");
	System.out.println("num = "+number);
	System.out.println(str);
	System.out.println("**************************************");
	
	String numStr =""+number;
	String msg = number +" is "+numStr.length()+"digit number";
	System.out.println(msg);

System.out.println("______________________________________________");


}
}