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
#app3  take student name from cmd line
java StudentApp  ravi gita sita

1 ravi
2 gita 
3 sita
	
java StudentApp "ravi yadav" gita "rita singh"
 */
  //Date  18/08/2020
 public class StudentApp {

	public static void main(String args[]){
	int totalStudent  = args.length;
	System.out.println("total Student " + totalStudent);
	  
	 for(int stu=1;stu<=args.length;stu++){
	 String name  = args[stu-1];
	  System.out.println("sno "+stu  +"     =  " + name);
	 
	 } 
	}//end main

}//end class