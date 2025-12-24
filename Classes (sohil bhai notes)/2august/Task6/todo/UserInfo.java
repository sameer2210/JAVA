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

  //Date  17/08/2020
 public class UserInfo {

	public static void main(String args[]){
	
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 int age;
	 String gender;
	 String name;
	 boolean isFit;
	 
	System.out.println("enter age");
	// age = scan.nextInt();
	age = Integer.parseInt( scan.nextLine());
	
	 System.out.println("enter gender");
	 gender = scan.nextLine();  //single word
	
	 System.out.println("enter name");
	 name = scan.nextLine();//whole line
	 System.out.println("enter is fit  true/false");
	// isFit = scan.nextBoolean();
	 isFit =Boolean.parseBoolean( scan.nextLine());
	    
	 
	 System.out.println("+++++++++++++++++++");
	 System.out.println( "age " + age);
	 System.out.println( "name " + name);
	 System.out.println( "gender " + gender);
	 System.out.println( "isFit " + isFit);
	 System.out.println("+++++++++++++++++++");
	 
	 
	 
	  
	}//end main

}//end class