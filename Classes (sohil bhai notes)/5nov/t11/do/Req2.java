import java.util.Scanner;

public class Req2 {
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	int a;
	boolean value;
	System.out.println(" Enter int value");
	a = Integer.parseInt(scan.nextLine());	//No.FormateException

	System.out.println(" enter boolean value ");
	value = Boolean.parseBoolean(scan.nextLine());	//true=true false=false other=false
	System.out.println(" a " + a );
	System.out.println(" boolean value " + value );
	
	
	}//end main
}//end class