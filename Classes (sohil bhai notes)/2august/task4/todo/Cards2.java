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
 public class Cards2 {

	public static void main(String args[]) throws Exception{ 
	
	  String []cardList={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	  
	  System.out.println("total cards "+ cardList.length);
	  for(int cardNumber=1;cardNumber<=cardList.length;cardNumber++){
	    String faceValue = cardList[cardNumber-1];
		System.out.print(faceValue+" ");
	  }
	  
	  System.out.println();
	  java.util.Random rand  = new java.util.Random();
	  
	  for(int cardNumber=1;cardNumber<=cardList.length;cardNumber++){
		   Thread.sleep(100);
		   
		   int firstIndexPos = cardNumber-1;
		   int secondIndexPos = rand.nextInt(cardList.length);
		   String  temp  = cardList[firstIndexPos];
		   cardList[firstIndexPos] = cardList[secondIndexPos];
		   cardList[secondIndexPos] = temp;
		   
		   System.out.println("round#"+cardNumber);
		     for(int cn=1;cn<=cardList.length;cn++){
			String faceValue = cardList[cn-1];
				if(cardNumber==cn){
				  System.out.print("{"+faceValue+"}");
				}else if((secondIndexPos+1)==cn){
				  System.out.print("["+faceValue+"]");
				}else{
				  System.out.print(faceValue+" ");
				}
			}
			System.out.println();
		   
	  }
	  
	  System.out.println("after suffle");
	  
	  	  for(int cardNumber=1;cardNumber<=cardList.length;cardNumber++){
	    String faceValue = cardList[cardNumber-1];
		System.out.print(faceValue+" ");
	  }

	}//end main

}//end class