import java.util.Scanner;


public class AxisBanATMDemoV1 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		//card axis
		//card sbi
		System.out.println("Welecome to AXIS ATM");
		System.out.println("_____________________________");
		System.out.println("Enter sbi card details");

		System.out.println("account number");
		String givenAcNumber = scan.nextLine();
		System.out.println("pin");
		String givenPinNo  = scan.nextLine();
		System.out.println("amount");
		float amount  = Float.parseFloat(scan.nextLine());
		
		SbiBankServer sbiServer = new SbiBankServer();
		
		sbiServer.withdraw(givenAcNumber, givenPinNo, amount);
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Thank you...plz come again");
		System.out.println("happy to help you");
		System.out.println("+++++++++++++++++++++++++++");
	}

}
