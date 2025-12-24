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

  //Date  17/03/2020
 public class Req1 {
//RAM HEAP   FILE  DB
	public static void main(String args[]) throws Exception{
	java.util.Random rand  = new java.util.Random();
	
	int [] numberList= new int[5];
	
	for(int sno=1;sno<=numberList.length;sno++){
	  int temp  = rand.nextInt(100000);
	  numberList[sno-1] = temp;
		System.out.println("number#"+sno +"created...");
		Thread.sleep(1000);
	}
	
	System.out.println("numbers are followings:");
	
	
	for(int sno=1;sno<=numberList.length;sno++){
	 
	    int currentFetchNum  = numberList[sno-1];
		System.out.println("sno#"+sno +"= " + currentFetchNum);
	}
	  
	}//end main

}//end class