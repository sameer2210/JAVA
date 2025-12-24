public class R1 {
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	
	int totalAddeWord=0;
	int curentIndex=-1;
	String [] wordList = new String[20];
	while(true){
	System.out.println("select option");
	System.out.println("1:show  2:add  3:delete  :4 exit ");
	String option = scan.nextLine();
	
	switch(option){

	case "1":
	//show
		if(totalAddeWord==0){
		System.out.println("empty word list ");
		}else{
		 for(int wordNo=1;wordNo<=wordList.length;wordNo++){
			String word = wordList[wordNo-1];
			if(word==null) break;
			System.out.println("# sno ="+wordNo +"="+word);
		}
		}
	break;

	case "2" : 	
	//add
	System.out.println("enter new word");
	String newWord = scan.nextLine();
	wordList[++curentIndex] = newWord;
	totalAddeWord++;
	break;

	case "3" :	
	//delete
	break;

	case "4" :
	//exit
		System.out.println("Application closed.....");
	System.exit(0);
	break;
	default :
		System.out.println("invalid option");
	}
		}

}
} 
	