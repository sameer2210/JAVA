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

  //Date  02/03/2020
 public class NitStudent {

	public static void main(String args[]){
	//user input java.util.Scanner scan  = new java.util.Scanner(System.in);
	java.util.Random rand  = new java.util.Random();
	
	for(int dept=1;dept<=3;dept++){
	
	 System.out.println("dept#"+dept+"_________");
	 
			for(int year=1;year<=3;year++){
				System.out.println("\t year#"+year+"_________");
				 int totalStudent=rand.nextInt(5)+5;//5-9
	
				for(int student=1;student<=totalStudent;student++){
						 int per= rand.nextInt(61)+40;
					System.out.println("\t\t student#"+student+"_ per="+per+"%");
				
				}//stu per
			}//year
	}//end dept
	}//end main

}//end class