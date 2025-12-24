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

  //Date  24/08/2020
 public class Card1 {

	public static void main(String args[]) throws Exception{
	
	String []cards =  {"ACE","KING ","QUEEN" ,"JACK" ,"10","9","8","7","6","5","4","3","2"};
	System.out.println("total cards " + cards.length);
	//PICK 1 BY 1
	for(int c=1;c<=cards.length;c++){
	 String name  = cards[c-1];
	 System.out.println(name);
	 }
	 String arrStr  =java.util.Arrays.toString(cards);
	 System.out.println(arrStr);
	 /*swap 
	 int pos1 =7;
	 int pos2 =2;
	 String temp = cards[pos1-1]; 
	 cards[pos1-1] = cards[pos2-1];
	 cards[pos2-1]=temp;
	 */
	 java.util.Random rand  = new 	 java.util.Random();
	 for(int c=1;c<=cards.length;c++){
	  int pos1=c;//1 2 ..13
	  int pos2=rand.nextInt(cards.length)+1 ;//1 -13 random
	  String temp  = cards[pos1-1];
	  cards[pos1-1]= cards[pos2-1];
	  cards[pos2-1]=temp;
	  Thread.sleep(500);
	 System.out.println(java.util.Arrays.toString(cards));
	 }//loop
	 
	 System.out.println(java.util.Arrays.toString(cards));	
	  
	}//end main

}//end class