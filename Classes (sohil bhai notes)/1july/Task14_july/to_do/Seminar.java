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

  //Date  21/02/2020
 public class Seminar {

	public static void main(String args[]){
	
	String planeAvailable=null;
	String trainAvailable=null;
	String busAvailable=null;
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("is plane available? yes no");
	planeAvailable = scan.nextLine();
	
	System.out.println("is train available? yes no");
	trainAvailable = scan.nextLine();
	
	System.out.println("is bus available? yes no");
	busAvailable = scan.nextLine();
	
	
	//if("yes".equals(planeAvailable)){
	
	if("yes".equalsIgnoreCase(planeAvailable)){
			System.out.println("plane booked...");
	}else if("yes".equalsIgnoreCase(trainAvailable)){
			System.out.println("train booked...");
	}else if("yes".equalsIgnoreCase(busAvailable)){
			System.out.println("bus booked...");
	}else{
	  System.out.println("nothing booked....");
	}

	System.out.println("+++++++++++++++++++++++++++");
	if("yes".equalsIgnoreCase(planeAvailable)){
			System.out.println(" booked...");
	}else if("yes".equalsIgnoreCase(trainAvailable)){
			System.out.println("booked...");
	}else if("yes".equalsIgnoreCase(busAvailable)){
			System.out.println("booked...");
	}else{
	  System.out.println("nothing booked....");
	}
	
		
	System.out.println("+++++++++++++++++++++++++++");
	if("yes".equalsIgnoreCase(planeAvailable)
	   ||"yes".equalsIgnoreCase(trainAvailable)
	   ||"yes".equalsIgnoreCase(busAvailable) ){
	   
			System.out.println("booked...");
	}else{
	  System.out.println("nothing booked....");
	}
	
	System.out.println("+++++++++++++++++++++++++++");
	
	boolean isBooked = false;
	if("yes".equalsIgnoreCase(planeAvailable)
	   ||"yes".equalsIgnoreCase(trainAvailable)
	   ||"yes".equalsIgnoreCase(busAvailable) ){
			isBooked=true;
	}
	System.out.println(isBooked?"Booked ":" NOT BOoked");
	  
	  System.out.println("+++++++++++++++++++++++++");
	  boolean c1="yes".equalsIgnoreCase(planeAvailable);
	  boolean c2="yes".equalsIgnoreCase(trainAvailable);
	  boolean c3="yes".equalsIgnoreCase(busAvailable);
	  boolean isBooked2=c1||c2||c3;
	  System.out.println(isBooked2 ? " Booked " : " NOT BOOKED ");
	  
	  
	  System.out.println("+++++++++++++++++++++++++");

	  boolean isBooked3="yes".equalsIgnoreCase(planeAvailable)||"yes".equalsIgnoreCase(trainAvailable)||"yes".equalsIgnoreCase(busAvailable);
	  System.out.println(isBooked3?"Booked ":" NOT BOOKED");
	  
	  
	}//end main

}//end class