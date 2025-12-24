import java.util.Scanner;

//real code
public class AxisBankAtmDemo2 {
	public static void main(String args[]){
	
	Scanner scan = new Scanner (System.in);
	//card axis
	//card sbi
	System.out.println(" welcome to AXIS ATM	");
	System.out.println("  Enter your sbi card details ");
	System.out.println("______________________");
	
	System.out.println("  Enter your account Number ");
	String givenAcNumber = scan.nextLine();
	System.out.println("  Enter your pin ");
	String givenPinNo = scan.nextLine();
	System.out.println(" amount ");
	float amount = Float.parseFloat(scan.nextLine());
	
	SbiBankServer sbiServer = new SbiBankServer();
	
	try{
		 //calling sbi service so this is calller
			sbiServer.withdraw(givenAcNumber, givenPinNo, amount);
			System.out.println(" transaction done successfuly .... ");
	}catch(AccountNotFoundException e){
			System.out.println(" Account Error : " + e.getMessage());
	}catch(AccountBlockedException e){
			System.out.println(" Account Block Error : " + e.getMessage());
	}catch(InvalidPinException e){
			System.out.println(" Pin Error : " + e.getMessage());
	
	}catch(AmountInsufficientException e){
		System.out.println(" Account balence Error : " + e.getMessage());
	}catch(AccountLimiteException e){
		System.out.println(" Account Limit Errror : " + e.getMessage());
	}catch(Exception e) {
		System.out.println(" Error : " + e.getMessage());
	}
	
	System.out.println(" ________________________");
	System.out.println(" Thank you ... plz come again ");
	System.out.println(" happy to help you  ");
	System.out.println(" ______________---___________ ");
		
	}//end main
}//end class