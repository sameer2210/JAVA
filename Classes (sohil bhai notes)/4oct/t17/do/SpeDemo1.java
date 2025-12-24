import java.util.Date;
import java.util.Random;

public class SpeDemo1 {
	public static void main(String args[]){
	
		String s1 = new String("raaka it solution ");
		String s2 = new String("Sis Java Nit ");
		Integer iObj1 = new Integer(100);
		Integer iObj2 = new Integer(200);
		Boolean bObj1 = new Boolean(true);
		Boolean bObj2 = new Boolean(false);
		
		System.out.println("______________________");
		
		System.out.println(s1);		//Raaka it soluction
		System.out.println(s2);		//sis java nit
		System.out.println(iObj1);	//100
		System.out.println(iObj2);	//200
		System.out.println(bObj1);	//true
		System.out.println(bObj2);	//false
		System.out.println("____________________");
	
	Date d1 = new Date();
	System.out.println(d1);			//mon oct 31 15:43:34 Ist 2022
	Random r1 = new Random();
	
	System.out.println(r1);		//java.util.Random@3309743
		
	
	}//end main
}//end class