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
 public class Spe4 {

	public static void main(String args[])throws Exception{
	
	  // int [][]data= new int[2][6];
	   int [][]data=  null;
	   System.out.println(data);
	 //RTE   System.out.println("total set " + data.length);
	   //how many set required
	   data = new int [2][];
	   System.out.println(data);//ref 
	   System.out.println("total set " + data.length);//2
	   System.out.println("set1 " +data[0]);//null
	   System.out.println("set2 " +data[1]);//null
	   //create first set data array
	   System.out.println("____________________");
	   data[0] = new int[6];
	   
	   System.out.println("set1 " +data[0]);//ref
	   System.out.println("set2 " +data[1]);//null
	   //create 2nd set data array
	   data[1] = new int[6];
	   
	   System.out.println("____________________");
	  
	   System.out.println("set1 " +data[0]);//ref
	   System.out.println("set2 " +data[1]);//ref
	   System.out.println("set1 size = " +data[0].length);//6
	   System.out.println("set2 size = " +data[1].length);//6
	   
	   java.util.Random rand  = new java.util.Random();
	   
	    for(int set=1;set<=data.length;set++){
		       for(int e=1;e<=data[set-1].length;e++){
			    data[set-1][e-1] = rand.nextInt(1000);//scanner
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
	   
	}//end main

}//end class