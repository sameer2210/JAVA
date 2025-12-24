public class R1{
	public static void main(String args[]){
	
	String [] categoryList = {"flower","fruite","divice"};
	String [][] words = new String[categoryList.length][5];
	
	//flowers
	words[0][0]="lotus";
	words[0][1]="rose";
	words[0][2]="sunflower";
	words[0][3]="lilY";
	words[0][4]="marrygold";
	//fruits
	words[1][0]="banana";
	words[1][1]="apple";
	words[1][2]="grapes";
	words[1][3]="orange";
	words[1][4]="mango";
	//devices
	words[2][0]="laptop";
	words[2][1]="mobail";
	words[2][2]="radio";
	words[2][3]="tv";
	words[2][4]="computer";
	
	System.out.println("total category " + categoryList.length);
	
	for(int cat=1;cat<=categoryList.length;cat++){
	 String name = categoryList[cat-1];
	System.out.println("cat# " +cat +"name = " + name);
	  //System.out.println("total items "+ words[cat -1].length);
	
	String [] itemsArr = words[cat-1];
	 System.out.println("total items " + itemsArr.length);
		for(int item=1;item<= itemsArr.length;item++){
		 String itemName = itemsArr[item-1];
		System.out.println("\titem# " +item +" " +itemName);
		}
	System.out.println("________________________________");	
	}

}
}