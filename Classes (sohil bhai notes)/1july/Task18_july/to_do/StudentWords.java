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

  //Date  26/02/2020
 public class StudentWords {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	String allWords="";
	
	final int  TOTAL_REQUIRED_WORDS=5;
	int totalInputWords=1;
	
	while(totalInputWords<=TOTAL_REQUIRED_WORDS){
	  //todo1 input
	  System.out.println("enter your word #"+totalInputWords);
	  String word = scan.nextLine();
	  //todo2//process
	  allWords = allWords +"SNO#" +totalInputWords +":"+word+"\n";
	  //todo3 next counter update ++ 
	  totalInputWords++;
	
	}//while end
	
	System.out.println("++++++++++++++++++++++++++++++");
	  System.out.println("all words are bellow:");
	  System.out.println(allWords);
	System.out.println("++++++++++++++++++++++++++++++");
	  
	}//end main

}//end class