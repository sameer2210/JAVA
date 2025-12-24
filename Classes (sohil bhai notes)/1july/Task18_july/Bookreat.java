public class Bookreat {
	public static void main(String args[])throws Exception{
	
	System.out.println("*******************Start*********************");
	final int START_PAGE=1;
		final int END_PAGE=10;
		int totalReadPage=START_PAGE;
		java.util.Scanner scan = new java.util.Scanner(System.in);

	while(totalReadPage<=END_PAGE){
	//todo1 show title
	System.out.println("title name : title#" +totalReadPage);
	//todo2 ask for like or not
	System.out.println("do you like to read title#" +totalReadPage);
	
		String likeOption =scan.nextLine();
	
		if("no".equals(likeOption)){
		  //turn page and continue
			System.out.println("skiped reading page......");
			totalReadPage=totalReadPage+1;
		  continue;
		}
	//todo3 reading...
	System.out.println("reading.........................");
	Thread.sleep(5*1000);
	
	//todo4 ask for stop or not
	System.out.println("would you like to read more.....yes/no");
	String readMoreOption =scan.nextLine();
	if("no".equals(readMoreOption)){
	System.out.println("you have stoped reading....");
	break;
	//stop total reading no more reading.....
	}
	//todo5 turn page
	totalReadPage=totalReadPage+1;
	}
System.out.println("______________________________________________");

}
}