public class Stringcase5 {
	public static void main(String args[]){
	
	String about="Author:Sameer khan Sao \n"+
	">>Software Architectand Corporate Trainer	\n"+
	">>+1 year exp in bankhedi \n"+
	">>java Certified SCJP & SCWCD with 98%\n"+
	">>Trained more than 5k student\n"+
	">>MCA from NIT National instute of Technology Raipur\n"+
	">>Email : Sameerkhan@gmail.com\n"+
	">>Mobile : 9691709556\n";

	System.out.println(about);
	System.out.println("____________________________________");
	
	System.out.println("what text do you want to find ? enter it");

	java.util.Scanner Scan = new java.util.Scanner(System.in);
	String searchText=Scan.nextLine();
	System.out.println("_____________________________________");

	if(about.contains(searchText)){
		System.out.println("found");
	}else{
		System.out.println("NOT found");
	}
	
	System.out.println("_______________IgnoreCase_______________");
	if(about.toLowerCase().contains(searchText.toLowerCase())){
		System.out.println("found");
	}else{
		System.out.println("NOT found");
	}

}
}











