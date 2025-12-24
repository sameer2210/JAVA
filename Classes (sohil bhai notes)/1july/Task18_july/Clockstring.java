public class Clockstring {
	public static void main(String args[])throws Exception{
	String str ="SIS JAVA NIT";
	System.out.println(str);
	System.out.println(str.substring(4));
	System.out.println(str.substring(4,7));
	System.out.println(str.substring(4,8));
	
System.out.println("________________________________________________");

	java.util.Scanner scan = new java.util.Scanner(System.in);
	String allWords="";
	final int TOTAL_REQUIRED_WORDS=5;
	int totalInputWords=1;

	while(totalInputWords<TOTAL_REQUIRED_WORDS){
	//todo 1 input
	System.out.println("enter your word #"+totalInputWords);
	String word = scan.nextLine();
	//todo2//process
	allWords = allWords +"SNO#" +totalInputWords+":"+word+"\n";

	//todo3 next counter update ++
	totalInputWords++;
	
	}
	System.out.println("*****************************************");
	System.out.println("all words are bellow:");
	System.out.println(allWords);
	System.out.println("*****************************************");	

}
}


