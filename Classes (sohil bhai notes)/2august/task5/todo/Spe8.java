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

  //Date  18/03/2020
 public class Spe8 {

	public static void main(String args[])throws Exception{
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	  java.util.Random rand  = new java.util.Random();
	   int [][]data=  null;
	  //create required array
		System.out.println("how many set required?");
	   data = new int [scan.nextInt()][];
	    for(int set=1;set<=data.length;set++){ 
		System.out.println("in set#"+set +" how many element required?");
			data[set-1] = new int[scan.nextInt()];
		}	   
	   //fill data
	   
	    for(int set=1;set<=data.length;set++){
		       for(int e=1;e<=data[set-1].length;e++){
			    data[set-1][e-1] = rand.nextInt(10000);//
			   }
		}
	   
	   for(int set=1;set<=data.length;set++){
		  System.out.println("set#"+set);
		  System.out.println("setref="+data[set-1]);
		  System.out.println("total elements="+data[set-1].length);
		       for(int e=1;e<=data[set-1].length;e++){
			   int  value = data[set-1][e-1];
			      System.out.println("element#"+e +" = " + value);
				  Thread.sleep(200);
			   }
		System.out.println("___________________________");
		}
		System.out.println("__________matrix_________________");
		
		for(int set=1;set<=data.length;set++){
		       for(int e=1;e<=data[set-1].length;e++){
				int  value = data[set-1][e-1];
			      System.out.printf("%5d ", value);
				  Thread.sleep(200);
			   }
			   
		System.out.print("\n");
		}
	   
	}//end main

}//end class