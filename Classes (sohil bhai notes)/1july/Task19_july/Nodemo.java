public class Nodemo {
	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	
	int count=1;
	while(count<=5){
	System.out.println("enter number #"+count);
	int input = scan.nextInt();

	count++;
	}
	
System.out.println("_____________________________________________"); 

	while(true){
	System.out.println("enter number");
	int input = scan.nextInt();
	String option=scan.next();
	if("no".equals(option)){
	break;
	}
	}

System.out.println("______________________________________________");

	int input=0;
	System.out.println("for exit enter -99999");
	while(input!=-99999){
	System.out.println("enter number");
	input = scan.nextInt();
	}

	
}
}