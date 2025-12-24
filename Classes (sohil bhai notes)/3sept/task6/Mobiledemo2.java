public class Mobiledemo2{
	public static void main(String args[]){
	
	Mobile skMobile = new Mobile();
	System.out.println(skMobile + " __________________\n");
	skMobile.details();
	skMobile.update("Oneplus","black","android",8,128,48);
	skMobile.details();
	
	System.out.println("\n___________________________\n");
	
	Mobile stuMobile = new Mobile();
	System.out.println(stuMobile +"___________________\n");
	stuMobile.details();
	stuMobile.update("Apple","black","Ios14",12,512,50);
	stuMobile.details();
	
		
	
	}//end main
}//end class