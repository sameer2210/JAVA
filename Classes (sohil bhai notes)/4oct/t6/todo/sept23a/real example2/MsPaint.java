public class MsPaint extends Software {
	 
	void draw() {
		System.out.println(this  + " drawing...");
	}

	void erase() {
		System.out.println( this  + " erase...");
	}
 //OVERRRIDE
 void close(){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("do you want to save and exit ?true/false");
	boolean save= scan.nextBoolean();
	if(save){
	System.out.println("Saved your file   and Colose" +this);
   System.exit(0);
   }else{
     System.out.println("continue work " +this );
   }
 }
	
//CAN NOT Override	
//void move(){System.out.println(this +"***sw move in ms paint");}	

//BUT override open style
void open(){
System.out.println("loading....");
try{ Thread.sleep(3000); } catch(Exception e){}
System.out.println(this +"***sw open in ms paint");

}	

	
}
