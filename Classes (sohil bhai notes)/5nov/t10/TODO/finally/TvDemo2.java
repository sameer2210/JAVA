import java.util.Random;


public class TvDemo2 {

	public static void main(String[] args) {
		
		Television tv=null;
		
		tv=new Television();
		tv.on();
		tv.volumeUp();
		tv.volumeDown();
		tv.channelUp();
		System.out.println("+++++++++++++++++++++++");
		String str  = "Sis";//   0-4
		System.out.println("str"+str);
		System.out.println(str.charAt(new Random().nextInt(5)));
		// java.lang.StringIndexOutOfBoundsException
		System.out.println("+++++++++++++++++++++++");
		tv.jumpChannel(200);
		tv.channelDown();
		tv.off();
		
		System.out.println("_______________________");
		System.out.println("happy ending ");
		
		
		
		
		

	}

}
