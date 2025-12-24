import java.util.Scanner;
	
public class SisDictionary {
	public static void main (String args[]) {
	
	int totalWords=0;
	String [][]dictionary = new String [10000][3];
	//pre load some data
	dictionary[0][0]="java";
	dictionary[0][1]="programming language";
	dictionary[0][2]="y";	
	totalWords++;
	
	dictionary[1][0]="hyper text markup language";
	dictionary[1][1]="client side language web";
	totalWords++;
	dictionary[2][0]="ide";
	dictionary[2][1]="tool for development like eclipse";
	totalWords++;
	
	dictionary[3][0]="rose";
	dictionary[3][1]="flower";
	dictionary[3][2]="y";
	totalWords++;
	dictionary[4][0]="mobile";
	dictionary[4][1]="communication device";
	totalWords++;
	
	dictionary[5][0]="java script";
	dictionary[5][1]="client side web programming language";
	dictionary[5][2]="y";
	totalWords++;
	
	Scanner scan = new Scanner(System.in);
	while(true){
	
		System.out.println("___________________________");
		System.out.println("1:show all");
		System.out.println("2:add");
		System.out.println("3:delete");
		System.out.println("4:update");
		System.out.println("5:search");
		System.out.println("6:add favorite");
		System.out.println("7:show favorite");
		System.out.println("8:exit");
		System.out.println("_________________________\12");

	int menuOption = Integer.parseInt(scan.nextLine());
	switch(menuOption){
	case 1:
		for(int wordNo=1;wordNo<=dictionary.length;wordNo++){
		
		String key=dictionary[wordNo-1][0];
		String value=dictionary[wordNo-1][1];
		String favoriteType=dictionary[wordNo-1][2];
		
		if(key==null){break;}
		if("y".equalsIgnoreCase(favoriteType)){
		 System.out.printf("%3d[%1s]:%-15s = %-15s",wordNo,"*",key,value);
		}else{
		 System.out.printf("%3d%1s :%-15s = %-15s",wordNo," ",key,value);
		}
		System.out.println();
		System.out.println("___________________________");
		//if (totalWords==wordNo)break;
		}
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		//search
		System.out.println("enter your search text");
		String searchWord =scan.nextLine();
		for(int wordNo=1;wordNo<=dictionary.length;wordNo++){
		 String key=dictionary[wordNo-1][0];
		 if(key==null){break;}
	
		 //if(key.equaldIgnoreCase(searchWord)){
		 key = key.toLowerCase();
		 searchWord = searchWord.toLowerCase();
		
		 //if(key.equalsIgnoreCase(searchWord)){
			if(key.contains(searchWord)){
			  String temp =key;
			  String hightKey = temp.replace(searchWord,"["+searchWord+"]");
	
		String value=dictionary[wordNo-1][1];
		String favoriteType=dictionary[wordNo-1][2];
		if("y".equalsIgnoreCase(favoriteType)){
			System.out.printf("%3d[%1s]:%-15s = %-15s",wordNo,"*",hightKey,value);
		}else{
			System.out.printf("%3d %1s:%-15s = %-15s",wordNo," ",hightKey,value);	
		}
		System.out.println("\n_________________________");
			}//if
		}//end loop
	
	
		break;
	case 6:
		break;
	case 7:
		//show favorite
		System.out.println("your favorite word");
		for(int wordNo=1;wordNo<=dictionary.length;wordNo++){
		  String key=dictionary[wordNo-1][0];
		  String value=dictionary[wordNo-1][1];
		  String favoriteType=dictionary[wordNo-1][2];
		  if(key==null){ break;}
		
		  if("y".equalsIgnoreCase(favoriteType)){
			System.out.printf("%3d[%1s]:%15s= %-15s",wordNo,"*",key,value);
			System.out.println("\n__________________");
		  }
		}
	
		break;
	case 8:
		System.out.println("Happy Programming!");
		System.out.println("meet you soon :exit:");
		System.exit(0);
	default:	System.out.println("invalid option");
	
		}//end switch
	}//end while

}

}
