public class Date {
	public static void main(String args[])throws Exception{
	
/*
	java.util.Date now =new java.util.Date();
	System.out.println(now);
	String str ="";
	str = str +now;
	System.out.println(str);
	System.out.println(str.substring(11,19));
*/
	
	while(true){
		Thread.sleep(1000);
		java.util.Date now = new java.util.Date();
		String str ="" + now;
		//str =str.substring(11,19);
		//System.out.println(str);
		//System.out.println(str);
	str = "\r"+str.substring(11,19);
		System.out.println(str);
	}
}
}