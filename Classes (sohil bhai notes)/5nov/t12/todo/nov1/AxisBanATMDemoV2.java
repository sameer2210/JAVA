import java.util.Scanner;

//real code
public class AxisBanATMDemoV2 {

	public static void main(String[] args) {
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
		try{
		//calling sbi service  so this is caller  
			sbiServer.withdraw(givenAcNumber, givenPinNo, amount);
			System.out.println("transaction done successfuly....");
		}catch(AccountNotFoundException e){
			System.out.println("Account ERROR : "+ e.getMessage());
		}catch(AccountBlockedException e){
			System.out.println("Account Block ERROR : "+ e.getMessage());
		}catch(InvalidPinException e){
			System.out.println("Pin ERROR : "+e.getMessage());
			//
		}catch(AmountInsufficientException e){
			System.out.println("Account balance ERROR : "+e.getMessage());
		}catch(AccountLimiteException e){
			System.out.println("Account Limit ERROR : "+e.getMessage());
		}catch (Exception e) {
			System.out.println("ERROR : "+e.getMessage());
		}
	       
		
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Thank you...plz come again");
		System.out.println("happy to help you");
		System.out.println("+++++++++++++++++++++++++++");
		
		
		
		
		
		
		

	}

}
