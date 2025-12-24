import java.util.Random;

public class TvDemo1 {
	public static void main(String args[]){
	
		Television tv = null;
		
		tv = new Television();
		tv.on();
		tv.volumeUp();
		tv.volumeDown();
		tv.channelUp();
		System.out.println("____________________");
		
		String str = " java " ; 	//0-4
		System.out.println(str.charAt(new Random().nextInt(5)));
		//java.lang.StringIndexOutOfBoundsException
		System.out.println("-------------------------------------");
		tv.jumpChannel(200);
		tv.channelDown();
		tv.off();
		
	System.out.println("_________________________");
	System.out.println(" happy ending.... ");
		
		
	}//end main
}//end class