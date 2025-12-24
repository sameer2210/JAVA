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
 public class Req4 {
//RAM HEAP   FILE  DB
	public static void main(String args[]) throws Exception{
	java.util.Random rand  = new java.util.Random();
	
	char [] vowelList= new char[5];//[ ' ', ' ', ' ', ' ', ' ', ' ' ]
	vowelList[0]='a';
	vowelList[1]='e';
	vowelList[2]='i';
	vowelList[3]='o';
	vowelList[4]='u';
	
	int selectedVowelIndex = rand.nextInt(vowelList.length);//0-4
    char favoriteVowel  = vowelList[selectedVowelIndex];
	System.out.println("my student said fovorite vowel is "+ favoriteVowel);	
		
	  
	}//end main

}//end class