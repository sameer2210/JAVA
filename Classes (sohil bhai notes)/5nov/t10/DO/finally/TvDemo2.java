import java.util.Random;
public class TvDemo2 {
	public static void main(String args[]){
	
		Television tv = null;
		
		tv = new Television();
		tv.on();
		tv.volumeDown();
		tv.channelUp();
		System.out.println("_______________________");
		
		String str = " Sis ";
		System.out.println(" Str "+ str );
		System.out.println(str.charAt(new Random().nextInt(5)));
		// java.lang.StringIndexOutOfBoundsException
		System.out.println("________________________");
		
		tv.jumpChannel(200);
		tv.channelDown();
		tv.off();
		System.out.println("_______________________");
		System.out.println(" happy ending ");
		
	}//end main
}//end class