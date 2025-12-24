public class Mathdemo3 {
	public static void main(String args[]){

	int n1= (int) (Math.random()*10);
	int reqNum1 = 15 + (n1%6);
		System.out.println(reqNum1);

	int n2 = (int) (Math.random()*100);
	int reqNum2 = 15 + (n2%11);
		System.out.println(reqNum2);
	System.out.println("_____________________________");

	int n3 = (int) (Math.random()*100);
	int reqNum3 = 15 + (n3%51);
		System.out.println(reqNum3);

	int n4 = (int) (Math.random()*100);
	int reqNum4 = n4%26;
		System.out.println(reqNum4);
	System.out.println("____________________________");

	int n5 = (int) (Math.random()*100);
	int reqNum5 = 65+n5%26;
		System.out.println(reqNum5);
	System.out.println("_____________________________");
	
	int num = (int) (Math.random()*100);
	int upperAlphabetAscii = 65 + (num%26);
	System.out.println(upperAlphabetAscii);
	System.out.println((char)upperAlphabetAscii);	


}
}







