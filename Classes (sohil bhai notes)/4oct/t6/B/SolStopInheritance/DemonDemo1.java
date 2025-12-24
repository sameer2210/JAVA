
public class DemonDemo1{
	public static void main(String args[]){
	
	Demon rakshas1 = new Demon();
		rakshas1.eat();
		try{Thread.sleep(1000);} catch(Exception e) {}
		rakshas1.kill();
		try{Thread.sleep(2000);} catch(Exception e) {}
		rakshas1.run();
		try{Thread.sleep(1000);}catch(Exception e){}
		
		Human gaddar = new Human();
			gaddar.name= "Aayush maliviya ";
			
		System.out.println("____________________");
			rakshas1.killAndEat(gaddar);	
	
	
	}//end main
}//end class