public class Mathdemo2 {
	public static void main(String args[]){
	
	double n1 = Math.random();
	int temp  = (int)(n1*10);	
	int mod = temp%6;
	int dice = mod+1;
	
	System.out.println("n1 = "+n1);
	System.out.println("temp = "+temp);
	System.out.println("mode = "+mod);
	System.out.println("dice = "+dice);
	
	System.out.println("_____________________________");
	
	int dice1 =(( (int) (Math.random()*10) )%6)+1;
	int dice2 = (( (int) (Math.random()*10) )%6)+1;
	int dice3 = (( (int) (Math.random()*10) )%6)+1;
	int dice4 =(( (int) (Math.random()*10) )%6)+1;


	System.out.println(" dice1 " + dice1);
	System.out.println(" dice2 " +dice2);
	System.out.println(" dice3 " +dice3);
	System.out.println(" dice4 " +dice4);
	
	System.out.println("_____________________________________");
/*	
	int n1 = (int) (Math.random()*10);
	int n2 = (int) (Math.random()*10);
	int n3 = (int) (Math.random()*10);
	int n4 = (int) (Math.random()*10);

	String otp="";
	otp = otp+n1+n2+n3+n4;

	System.out.println("otp = "+ otp);		
	
*/
}
}





