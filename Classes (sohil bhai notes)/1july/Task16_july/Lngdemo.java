 public class Lngdemo {

	public static void main(String args[]){
	  java.util.Scanner scan  = new java.util.Scanner(System.in);

	  System.out.println("enter lang for details");
	String lng = scan.nextLine();
	  switch(lng){
	   case "c":
		System.out.println("mother language");
	break;
	case "cpp":
		System.out.println("c++support oops,oo...");
	break;
	case"java":
		System.out.println("java ,pi,secure,robust,simple,.........");
	break;
	case"html":
		System.out.println("use for create web pages......");
	break;
	default :
		System.out.println("not details found");	
	break;
	}


System.out.println("____________________________________________");
		
	System.out.println("enter number between 0-3");
	int option =scan.nextInt();
	
	switch(option){
	case 0:
		System.out.println("zero");
		break;
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	default :
		System.out.println("not in range");
		break;
	
	}

	}
}