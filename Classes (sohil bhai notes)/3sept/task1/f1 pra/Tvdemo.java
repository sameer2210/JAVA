public class Tvdemo{
	public static void main(String args[]){
	
	Television tv = new Television();
	tv.brandName="Sony";
	tv.modelNumber="kkrh";
	tv.price=99999;
	tv.type="LED";
	tv.size="81inc\"";
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	while(true){
		System.out.println("select option");
		System.out.println("0: on");
		System.out.println("1: off");
		System.out.println("2: show info ");
		System.out.println("3: vol++");
		System.out.println("4: vol--");
		System.out.println("5: channel++");
		System.out.println("6: channel--");
		System.out.println("7: channel jump");
		System.out.println("8: activateCode");
		System.out.println("9: exit");
	
	//int option = scan.nextInt();
	String option = scan.nextLine();
	
	 switch(option){
	  case "0": tv.on(); break;
	  case "1": tv.off(); break;
	  case "2": tv.showDetails(); break;
	  case "3": tv.increaseVolume(); break;
	  case "4": tv.decreaseVolume(); break;
	  case "5": tv.channelUp(); break;
	  case "6": tv.channelDown(); break;
	  case "7":
					System.out.println("enter new channel number");
					int newChannel = Integer.parseInt(scan.nextLine());
					tv.jumpChannel(newChannel);
					break;
	
	  case "8":	
					System.out.println("enter activation code");
					String activationCode=scan.nextLine();
					break;
	  case "9":
					System.out.println("See you Again: SIS");
						System.exit(0);
					break;
					default: 
							  System.out.println("Invalid input");
							  break;
	  }//switch end
	  System.out.println("___________________________");
	 }//while loop end
	
		
	}//end main
}//end class