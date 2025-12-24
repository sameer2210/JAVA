
public class DemonDemo2 {

	public static void main(String[] args) {
		
		SpecialDemon sd = new SpecialDemon();
		sd.eat();
		try{ Thread.sleep(1000); } catch(Exception e){}
		sd.kill();
		try{ Thread.sleep(1000); } catch(Exception e){}
		sd.run();
		try{ Thread.sleep(1000); } catch(Exception e){}
		
		Human gaddar = new Human();
		gaddar.name="vijay maliya";
		
		System.out.println("_____________");
		sd.killAndEat(gaddar);
		
		
		sd.fly();
		sd.makeFire();
		sd.magic();
		sd.invisible();
		
		
		

	}

}
