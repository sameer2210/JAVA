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

  //Date  31/08/2020
 public class SisStudent {
     String name;
	 String favoriteWord;
	 int totalGivenWords;//0
	 String trainerWords[] = new String[100];
	 
	 
	 void saySomething(){
	  System.out.println("my Name is " + name);//null
	  System.out.println("my favorite word is " + favoriteWord);//null
	  System.out.println("Total GivenWords " + totalGivenWords);//0
	    for(int w=1;w<=totalGivenWords;w++){
		  System.out.println("sno#"+w +" = " + trainerWords[w-1]);
		}
	 }
	 
	 
	 void updateFovoriteWord(String word){
	   favoriteWord=word;
	   javax.swing.JOptionPane.showMessageDialog(null, name +" updated word " + word);
	 }
	 
	 
	 //start totalGivenWords =0
	 void updateWords(String word){
	 trainerWords[totalGivenWords] = word;
	 totalGivenWords++;
	 }	
	 
	 
 

}//end class