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
 public class Req1 {

	public static void main(String args[]){
	
	  String [] categoryList = {"flower","fruit","divice"};
	  
	  String [][] words = new String[categoryList.length][5];
	  
	  //flower
	  words[0][0]="lotus";
	  words[0][1]="rose";
	  words[0][2]="sunflower";
	  words[0][3]="lily";
	  words[0][4]="marrygold";
	  //fruit
	  words[1][0]="banana";
	  words[1][1]="apple";
	  words[1][2]="grapes";
	  words[1][3]="orange";
	  words[1][4]="mango";
	  //device
	  words[2][0]="laptop";
	  words[2][1]="mobile";
	  words[2][2]="radio";
	  words[2][3]="tv";
	  words[2][4]="headphone";
	  
	  System.out.println("total category " + categoryList.length);
	  
	  for(int cat=1;cat<=categoryList.length;cat++){
	     String name = categoryList[cat-1];
	   System.out.println("cat#"+cat  +" name = " + name);
	   //System.out.println("total items " + words[cat-1].length);
	  
	    String [] itemsArr = words[cat-1];
	    System.out.println("total items " + itemsArr.length);
		for(int item=1;item<=itemsArr.length;item++){
		   String itemName = itemsArr[item-1]; //words[cat-1][item-1]; 
		  System.out.println("\titem#"+item +"  " + itemName);
		}
	  System.out.println("_________________________");
	  }
	  
	  
	  
	  
	  
	  
	  
	}//end main

}//end class