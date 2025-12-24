/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+12 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	@copyright  surendra 2020
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */
/* 
	  if(new java.util.Random().nextBoolean()) {  //true or false
	      throw new RuntimeException("My Test1 Error1 ");
	  }  */
  //Date  02/11/2020
 public class X{ 
   
   //unchecked
   public static void m1(){
	  System.out.println("m1 called...");
	   if(new java.util.Random().nextBoolean()) {  //true or false
	      throw new RuntimeException("My Test1 Error1 ");
	   }  
	}
 
   //unchecked
  public static void m2() throws RuntimeException{
	  System.out.println("m2 called...");
	  
	   if(new java.util.Random().nextBoolean()) {  //true or false
	      throw new RuntimeException("My Test2 Error2 ");
	   }  
	  
	}
 
 /*  version 3.1   CTE
   //checked  : must be handled
   // unreported exception Exception; must be caught or declared to be thrown
//CTE 
 public static void m3(){
	  System.out.println("m3 called...");
	    if(new java.util.Random().nextBoolean()) {  //true or false
	      throw new Exception("My Test3 Error3 ");
	   }
	  
	}
 */
  
  /*
  //version 3.2   NO Compile time error
   //checked  : must be handled  try catch
   // error created by me and handled me :  wrong approach
  public static void m3(){
	  System.out.println("m3 called...");
	try{  
				//create checked exception and throw
				if(new java.util.Random().nextBoolean()) {  //true or false
				  Exception  eObj  = new Exception("My Test3 Error3 ");
				  throw eObj;
			   }
		
	}catch(Exception e){  //checked execption handled here
	  System.out.println("ERROR Found:: " + e.getMessage());//ERROR Found::My Test3 Error3 
	}
  }
 */
 
 //version 3.3   NO Compile time error
   //checked  : must be handled  try catch
  
 public static void m3()throws Exception {
	  System.out.println("m3 called...");
				//create checked exception and throw
				if(new java.util.Random().nextBoolean()) {  //true or false
				  Exception  eObj  = new Exception("My Test3 Error3 ");
				  throw eObj;
			   }
	
  }
 
 }//End of class 
