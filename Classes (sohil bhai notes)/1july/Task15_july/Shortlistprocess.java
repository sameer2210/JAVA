public class Shortlistprocess {
	public static void main(String args[]){

	java.util.Scanner scan = new java.util.Scanner(System.in);

	String hasMasterSkill;
	boolean isNitStudent;
	int totalProject;

		System.out.println("has master skill? yes/no");
		hasMasterSkill = scan.next();
		System.out.println("is Nit student? true/false");
		isNitStudent = scan.nextBoolean();
		System.out.println("how many number of project done?");
		totalProject = scan.nextInt();
	
	if( "yes".equalsIgnoreCase(hasMasterSkill)
	   &&isNitStudent==true
	   && totalProject>=3 ){
	System.out.println("your are sortlisted");
	}else{
		System.out.println("try...again....");
	}
}
}