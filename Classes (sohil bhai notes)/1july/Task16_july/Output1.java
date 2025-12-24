public class Output1 {
	public static void main(String args[]){
	
	int r1= 10>5?1000:3000;
	System.out.println(r1);		//1000
	
	//CTE float r1 = 10>5?1000.5:3000;//need typecasting with f
	//CTE float r2 = 10>5?1000.5:3000;//need typecasting with f

	float r2 = 10>5?1000.5f:3000.5f;
	System.out.println(r2);		//1000.5
	System.out.println("_______________________________");

	float r3 = 10>55?1000.5f:3000;
	System.out.println(r3);		//3000 or 3000.0

	System.out.println("_______________________________");
	int r4 = true?65:66;
	System.out.println(r4);		//65

	System.out.println("_______________________________");
	int r5 = true?65:'B';
	System.out.println(r5);		//65
	int r6 = false?65:'B';
	System.out.println(r6);		//66
System.out.println("**************************************************************************");
	
	//String r1  =true?"sis":"nit";
	//String r1  =true?"sis":false;
	//boolean r1 =true?"sis":false;
	//boolean r1 =true?"true":false;

System.out.println("**************************************************************************");

	System.out.println(true?100:200);	//100
	System.out.println(!true?100:200);	//200
					
	System.out.println(true?'A':66);	//A
	System.out.println(!true?'A':66);	//B
	System.out.println(!true?65:'B');	//B
	System.out.println(true?65:'B');	//A
System.out.println("_______________________________________");
	System.out.println(true?"sis":"nit");	//sis
	System.out.println(true?100:200);	//100
	System.out.println(true?100:200.5);	//100.0

	//CTE String r1 = 5>7?"100":200;
	System.out.println(5>7?"100":200);	//200
	System.out.println(5>7?"100":true);	//true

}
}
