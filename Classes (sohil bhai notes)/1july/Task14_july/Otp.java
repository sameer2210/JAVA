public class Otp {
	public static void main(String args[]){

	String s1="";
	int temp1 = (int)(Math.random()*10);
	int option1 = temp1%3;
	if(option1==0){
		s1 += (((int)(Math.random()*100))%26+65);
	}else if(option1==1){
		s1+=(char)(((int)(Math.random()*100))%26+65);
	}else if(option1==2){
		int t = ((int)(Math.random()*100))%26+97;
	char ch = (char)t;
		s1 += ch;
	}
	
	System.out.println(s1);

}
}













//____________________________________________________________