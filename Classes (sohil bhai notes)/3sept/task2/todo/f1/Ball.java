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

  //Date  02/09/2020
 public class Ball{ 
   boolean isMoving;//
   boolean isRolling;
   
  void bounce(int force){
    System.out.println("ball starting boncing with force " + force);
	
	int totalBounce = force/10; 
    for(int b=1;b<=totalBounce;b++){
	isMoving=true;
	 System.out.println("bouncing #"+b);
		  try{ 
			Thread.sleep(1000); 
		  }catch(Exception e){ 	  }//
		  show();
	}//loop
  
     	isMoving=false;
		  show();

  }//end  method 
   
   void show(){
     System.out.println("ball status***is moving " + isMoving +" is  rolling " + isRolling);
   }
   
   
   void roll(String direction,int force){
   System.out.println("ball starting rolling with force " + force +" and direction "+ direction);
       //10 =1f 20 =2f
	   
	   int totalFeet = force/10; 
	   for(int f=1;f<=totalFeet;f++){
			isMoving=true;
			isRolling=true;
			System.out.println("moved "+f+"feet and rolled");
			try {
				Thread.sleep(1000);
			} catch(Exception e){}
			show();
	   }//end loop
	   isMoving=false;
	   isRolling=false;
	   show();
   }
   
   
 }//End of class 
