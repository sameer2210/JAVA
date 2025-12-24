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
 public class Req4Sol {
//find search time
	public static void main(String args[]){
	
	  String [] categoryList = {"flower","fruit","divice"};
	  
	  String [][] words = new String[categoryList.length][5];
	  //search
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
	   System.out.printf("%-12s","{"+categoryList[cat-1]+"}");
		for(int item=1;item<=words[cat-1].length;item++){
		   String itemName = words[cat-1][item-1];
		  System.out.printf("%-15s",itemName);
		}
		System.out.println();
	  System.out.println("___________________________________________");
	  }
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("Enter search text");
	String searchItemName = scan.nextLine();	  
	
	
	 int foundCatIndex= -1;
	 int foundItemIndex= -1;      
	
	//start...
	  long startTime  =System.nanoTime();
	  
	  mySearchEndPoint :
	  
	 for(int cat=1;cat<=categoryList.length;cat++){
		for(int item=1;item<=words[cat-1].length;item++){
		   String itemName = words[cat-1][item-1];
		   if(searchItemName.equalsIgnoreCase(itemName)){
				foundCatIndex = cat-1;
				foundItemIndex = item-1;
				
				break mySearchEndPoint; //jump out from all loop inner and outer 
		   }//if
		}//inner oop
	}// outer loop
	//end...
	  long endTime  =System.nanoTime();
	  System.out.println("total time  " + (endTime-startTime) +"ns");
	  
	System.out.println("Report");  
	if(foundCatIndex != -1){
	  System.out.println("Found ");
	  //in category name  and position
	  String foundCatName  = categoryList[foundCatIndex];
	  System.out.println("cat position["+(foundCatIndex+1)+"]name is ["+ foundCatName  +"] item position [" + (foundItemIndex+1)+"]");
	}else{
	  System.out.println("Not Found");
	}
	  
	  
	  
	  
	}//end main

}//end class