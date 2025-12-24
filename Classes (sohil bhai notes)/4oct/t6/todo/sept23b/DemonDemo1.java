
public class DemonDemo1 {

	public static void main(String[] args) {
		
		Demon rakshas1 = new Demon();
		rakshas1.eat();
		try{ Thread.sleep(1000); } catch(Exception e){}
		rakshas1.kill();
		try{ Thread.sleep(1000); } catch(Exception e){}
		rakshas1.run();
		try{ Thread.sleep(1000); } catch(Exception e){}
		
		Human gaddar = new Human();
		gaddar.name="vijay maliya";
		
		System.out.println("_____________");
		rakshas1.killAndEat(gaddar);
		
		
		
		
		

	}

}
