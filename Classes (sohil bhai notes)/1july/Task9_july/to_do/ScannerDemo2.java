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

  //Date  29/01/2020
 public class ScannerDemo2 {

	public static void main(String args[]){
	
	 java.util.Scanner scan =  new java.util.Scanner(System.in);
	 String firstName;
	 int age;
	 float weight ;
	 boolean fit;
	 double percentage;
	 
	 System.out.println("Enter your first name");
	 firstName = scan.next();//Take word 
	 
	 System.out.println("Enter your age");
	 age  = scan.nextInt();//take int
	 
	 System.out.println("Enter your weight");
	 weight = scan.nextFloat();
	 System.out.println("are you fit  ? true/false");
	 fit  = scan.nextBoolean();
	 System.out.println("Enter your percentage");
	 percentage = scan.nextDouble();
	 
	 //database code TODO
	  System.out.println("_____your data processed and save_______");
	  System.out.println("Name          : " +firstName);
	  System.out.println("Age             : " +age);
	  System.out.println("Weight        : " +weight);
	  System.out.println("Fit                : " +fit);
	  System.out.println("Percentage : " +percentage);
	  
	  
	}//end main

}//end class