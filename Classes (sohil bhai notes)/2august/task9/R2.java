public class R2 {
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

	System.out.println("total category " +categoryList.length);
	for(int cat=1;cat<=categoryList.length;cat++){
	
	System.out.printf("%10s","{"+categoryList[cat-1]+"}");
		for(int item=1;item<=words[cat-1].length;item++){
		 String itemName = words[cat-1][item-1];
		  System.out.printf("%-12s",itemName);
		}
	System.out.println();
	System.out.println("_________________");
	}	


}
}