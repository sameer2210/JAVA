  //Date  17/03/2020
 public class Cards {

	public static void main(String args[]){
	
	  String []cardList={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	  
	  System.out.println("total cards "+ cardList.length);
	  for(int cardNumber=1;cardNumber<=cardList.length;cardNumber++){
	    String faceValue = cardList[cardNumber-1];
		System.out.print(faceValue+" ");
	  }
	  
	  System.out.println();
	  java.util.Random rand  = new java.util.Random();
	  
	  for(int cardNumber=1;cardNumber<=cardList.length;cardNumber++){
		   int firstIndexPos = cardNumber-1;
		   int secondIndexPos = rand.nextInt(cardList.length);
		   String  temp  = cardList[firstIndexPos];
		   cardList[firstIndexPos] = cardList[secondIndexPos];
		   cardList[secondIndexPos] = temp;
		   System.out.println("round#"+cardNumber);
		     for(int cn=1;cn<=cardList.length;cn++){
			String faceValue = cardList[cn-1];
				System.out.print(faceValue+" ");
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