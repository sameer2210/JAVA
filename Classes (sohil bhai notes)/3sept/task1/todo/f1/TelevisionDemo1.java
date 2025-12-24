/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+11 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  01/09/2020
 public class TelevisionDemo1 {

	public static void main(String args[]){
	
	Television tv = new Television();
	tv.brandName="Sony";
	tv.modelNumber="xyz";
	tv.price=40000;
	tv.type="LED";
	tv.size="51\"";
	java.util.Scanner scan  = new java.util.Scanner(System.in);
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
	   System.out.println("8: activateCode");//TODO
	   System.out.println("9: exit");
	   
	   //int option= scan.nextInt();
	   String option= scan.nextLine();
	   
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
		 tv.jumpChannel(newChannel) ;
		break; 
		
		 case "8":
		 System.out.println("enter activation code");
		 String activationCode= scan.nextLine();  
		  //TODO
		break; 
	    case "9": 
          System.out.println("See You Again : SIS");
		  System.exit(0);
		break; 
		default :  System.out.println("Invalid input ");break;
	   }//action switch end
	   
	}//while loop for menu

	}//end main

}//end class