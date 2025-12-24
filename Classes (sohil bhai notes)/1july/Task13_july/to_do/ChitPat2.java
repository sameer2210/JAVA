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

  //Date  20/02/2020
 public class ChitPat2 {

	public static void main(String args[]) throws Exception {
	  
	  //0=H  1=T
	  int headOrTail1= ( (int)(Math.random()*10)  )%2;
	  int headOrTail2= ( (int)(Math.random()*10)  )%2;
	  int headOrTail3= ( (int)(Math.random()*10)  )%2;
	  
	  System.out.println("toss no1 ");
	  Thread.sleep(5000);
	  System.out.println(headOrTail1==0?"Head":"Tail");
	  System.out.println("toss no2 ");
	  Thread.sleep(5000);
	  System.out.println(headOrTail2==0?"Head":"Tail");
      System.out.println("toss no3 ");
	  Thread.sleep(5000);
	  System.out.println(headOrTail3==0?"Head":"Tail");
	 	 
	 
	  
	  int totalHead=0;
	  int totalTail=0;
	  
	  if(headOrTail1==0){
		totalHead++;
	  }else{
		totalTail++;
	  }
	  
	  if(headOrTail2==0){
		totalHead++;
	  }else{
		totalTail++;
	  }


	  if(headOrTail3==0){
		totalHead++;
	  }else{
		totalTail++;
	  }
	  
	  
	  System.out.println("total head " + totalHead);
	  System.out.println("total Tail " + totalTail);
	  
	  
	  if(totalHead>totalTail){
	    System.out.println("winner is Head");
	  }else{
	    System.out.println("winner is tail");
	  
	  }
	  
	  System.out.println();
	  
	}//end main

}//end class