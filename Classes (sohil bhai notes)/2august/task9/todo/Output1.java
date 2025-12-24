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

  //Date  20/08/2020
 public class Output1 {

	public static void main(String args[]) throws Exception{
	
	for(int i=1;i<=5;i++){
		      System.out.printf("i = %3d : ",i);
			for(int j=1;j<=5;j++){
		      System.out.printf("%3d",j);
		}
	System.out.println();
	}

System.out.println("__________");
	for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
		      System.out.printf("[%d%d]",i,j);
		}
	System.out.println();
	}

System.out.println("__________");
	for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
			     if(i==j){
		        System.out.printf("[%1d%1d]",i,j);
			  }else{
		        System.out.printf("[%2s]","*");
			  }
		}
	System.out.println();
	}

	
	
	
System.out.println("__________");
	for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
					Thread.sleep(200);
			     if(i==j){
		       			System.out.printf("[%1d%1d]",i,j);
				  }else{
					System.out.printf("[%2s]","*");
				  }
		}
	System.out.println();
	}
	
	
	//sis req   i ==3 j==3  stop print
	
System.out.println("__________");
	for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
					Thread.sleep(200);
			     if(i==j){
		           System.out.printf("[%1d%1d]",i,j);
				  }else{
					System.out.printf("[%2s]","*");
				  }
				  
				  if(i==3 && j==3){
				         break;
				  }
				  
		}//inner loop
	System.out.println();
	        if(i==3)break;
	}//outer loop
	
	
	
System.out.println("Happy Ending .......");

	
	}//end main

}//end class