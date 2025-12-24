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
 public class Spe3 {

	public static void main(String args[])throws Exception{
	
	   int [][]data= new int[2][6];
	  
	   data[0][0]=10;
	   data[0][1]=20;
	   data[0][2]=30;
	   data[0][3]=40;
	   data[0][4]=50;
	   data[0][5]=60;
	   
	   
	    //update 2nd set data
	   data[1][0]=70;
	   data[1][1]=80;
	   data[1][2]=111;
	   data[1][3]=222;
	   data[1][4]=333;
	   data[1][5]=444;
	   
	    System.out.println("total set "+ data.length);
		System.out.println("___________________________");
		
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
			      System.out.printf("%4d", value);
				  Thread.sleep(200);
			   }
		System.out.print("\n");
		}
		
	   
	   /* 
	   
	   data[0]=10;
	   data[1]=20;
	   data[2]=30;
	   data[3]=40;
	   data[4]=50;
	   data[5]=60;
	   data[6]=70;
	   data[7]=80;
	   data[8]=111;
	   data[9]=222;
	   data[10]=333;
	   data[11]=444;
	   for(int e=1;e<=data.length;e++){
	     System.out.print(e+"# =" + data[e-1]);
		 System.out.println();
	   }
	    */
	   
	   
	  
	}//end main

}//end class