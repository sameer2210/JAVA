import java.util.Random;
public class TvDemo2Sol {
	public static void main(String args[]){
	
		Television tv = new Television();
	try{
		 tv.on();
		 tv.volumeUp();
		 tv.volumeDown();
		 tv.channelUp();
		 System.out.println("____________________");
		 
		 String str = " Sis ";
		 System.out.println(" Str " + str );
		 System.out.println(str.charAt(new Random().nextInt(5)));
		 // java.lang.StringIndexOutOfBoundsException;
		 System.out.println("________________________");
		 
		 tv.jumpChannel(200);
		 tv.channelDown();
			//tv.off();
	}catch(Exception e){
			  System.out.println(" Error " + e.getMessage());
	}finally{
			tv.off();
	}
	System.out.println("_________________________");
	System.out.println(" happy ending ... ");
	
	}//end main
}//end class