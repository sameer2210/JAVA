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

  //Date  23/02/2020
 public class HrShortListProcess {

	public static void main(String args[]){
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
	  String  hasMasterSkill;
	  boolean isNitStudent;
	  int totalProject;

		System.out.println("has master skill? yes/no");
		hasMasterSkill = scan.next();
		System.out.println("is Nit student? true/false");
		isNitStudent = scan.nextBoolean();
		System.out.println("how many number of  project done? ");
		totalProject = scan.nextInt();

		 if( "yes".equalsIgnoreCase(hasMasterSkill)
		    && isNitStudent==true
			&& totalProject>=3 ){
		  System.out.println("your are sortlisted");
		}else{
		  System.out.println("try..again...");
		}
		
 
	  
	}//end main

}//end class