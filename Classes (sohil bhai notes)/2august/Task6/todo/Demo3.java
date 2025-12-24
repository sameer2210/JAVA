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
 public class Demo3 {

	public static void main(String args[]) throws Exception{
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("how many number required ");
	int totalInput =scan.nextInt();
	int userData[]  = new int[totalInput];
	  
	//get all five number as input from keyboard

	for(int sno=1;sno<=userData.length;sno++){
	  System.out.println("enter #"+ sno  +"  number");
	    int inputNum = scan.nextInt();
	  userData[sno-1] =inputNum;
	}

	//show
	int totalSum =0;
	for(int sno=1;sno<=userData.length;sno++){
	     //Delay 
		 Thread.sleep(1000);//1 second=1000 ms
	    int value = userData[sno-1];
		totalSum +=value;
	  System.out.println("#"+ sno  +" =   " + value);
	   
	}
	  System.out.println("total sum"+" =   " + totalSum);
	
	  
	  
	}//end main

}//end class