public class Stringspedemo {
	public static void main(String args[]){
	
	String info=">>Softwere Architect and Corporate Trainer \n"+
	">>+11 year exp in(mumbai,pune,hyd,bangaluru) \n"+
	">>java Certified SCJP & SCWCD with 98% \n"+
	"Trained more then 5k student and employees. \n"+
	"MCA from (NIT)National Institute of Technology Raipur(C.G.) \n"+
	"Email : sur.nit.mca@gmail.com\n"+
	"Mobail 7987919160 , 7987919160 \n";

	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println(info);
	
	System.out.println("enter text for search");
	String searchText = scan.nextLine();
/*
		if(info.equalsIgnoreCase(searchText)){
			System.out.println("found");
		}else{
			System.out.println("NOT found");
		}
*/	
	//if(info.contains(searchText)){
	if((info.toLowerCase()).contains(searchText.toLowerCase())){
		System.out.println("found");
	}else{
		System.out.println("NOT found");
	}
	
}
}
