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

  //Date  21/02/2020
 public class Session1 {

	public static void main(String args[]){
	
	   boolean isTrainerAvailable;
	   boolean isStudentAvailable;
	   boolean isResourcesAvailable;
	   java.util.Scanner  scan = new  java.util.Scanner(System.in);

	   //input
	   
	   System.out.println("is trainer available? true/false");
	   isTrainerAvailable= scan.nextBoolean();
	   
	   System.out.println("is student available? true/false");
	   isStudentAvailable= scan.nextBoolean();
	   
	   System.out.println("is resources available? true/false");
	   isResourcesAvailable= scan.nextBoolean();
	   
	   //________________________________________
	   System.out.println("____________way1________________");
	   
	   if(isTrainerAvailable){
					if(isStudentAvailable){
							if(isResourcesAvailable){
								System.out.println("training done successfuly.");
							}
					
					}
	   }//end
	   
	   System.out.println("____________way2________________");
	   
	    if(isTrainerAvailable){
					if(isStudentAvailable){
							if(isResourcesAvailable){
								System.out.println("training done successfuly.");
							}else{
								System.out.println("training Failed. why? resources not available");
							}
					
					}else{
								System.out.println("training Failed. why? student not available");
					
					}
	   }else{
				System.out.println("training Failed. why? trainer not available");
	   
	   }
	   

	   
	   System.out.println("____________way3________________");
	   
	    if(isTrainerAvailable){
					if(isStudentAvailable){
							if(isResourcesAvailable){
								System.out.println("training done successfuly.");
							}else{
								System.out.println("training Failed. ");
							}
					}else{
								System.out.println("training Failed.");
					}
	   }else{
				System.out.println("training Failed.");
	   }
	   
	     System.out.println("____________way4________________");
		boolean isSuccess1=false;
	       if(isTrainerAvailable){
					if(isStudentAvailable){
							if(isResourcesAvailable){
								 isSuccess1=true;
							}
					}
		}				
	   System.out.println(isSuccess1==true?"Trainer success":"training un-success");
	   
	    System.out.println("____________way5________________");
		boolean isSuccess2=false;
	       if(isTrainerAvailable&&isStudentAvailable&&isResourcesAvailable){
								 isSuccess2=true;
			}				
	   System.out.println(isSuccess2==true?"Trainer success":"training un-success");
	   
	   
	   
	    System.out.println("____________way6________________");
	       if(isTrainerAvailable&&isStudentAvailable&&isResourcesAvailable){
				System.out.println("training done successfuly.");
			}else{
				System.out.println("training not successfuly.");
			}				
	   
	   
	  
	}//end main

}//end class