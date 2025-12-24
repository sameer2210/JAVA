public class DemonDemo2{
	public static void main(String args[]){
	
	SpecialDemon sd = new SpecialDemon();
	sd.eat();
	try{Thread.sleep(2000);} catch(Exception e){}
	sd.kill();
	try{Thread.sleep(2000);} catch(Exception e){}
	sd.run();
	try{Thread.sleep(2000);} catch(Exception e){}
	
	Human gaddar = new Human();
	gaddar.name= "kuldeep mehra ";
	
	System.out.println("_________________________");
	sd.killAndEat(gaddar);
	
	sd.fly();
	sd.makeFire();
	sd.magic();
	sd.invisible();
		
	
	}//end main
}//end class