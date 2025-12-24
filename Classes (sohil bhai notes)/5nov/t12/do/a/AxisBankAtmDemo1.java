import java.util.Scanner;

public class AxisBankAtmDemo1 {
	public static void main(String args[])throws Exception {
	
	Scanner scan = new Scanner(System.in);
	//card axis
	//card sbi
	System.out.println(" Welcome to AXIS ATM ");
	System.out.println("  Enter your card details ");
	System.out.println("______________________");
	
	System.out.println(" Enter your Account Number ");
	String givenAcNumber = scan.nextLine();
	System.out.println("  Enter Pin ");
	String givenPinNo = scan.nextLine();
	System.out.println(" amount ");
	float amount = Float.parseFloat(scan.nextLine());
	
	SbiBankServer sbiServer = new SbiBankServer();
	sbiServer.withdraw(givenAcNumber, givenPinNo, amount);
	
	System.out.println(" ___---------------------------------___ ");
	System.out.println(" thank you .... plz come again ");
	System.out.println(" happy to help you ");
	System.out.println(" __________________________ ");
			
	}//end main
}//end class