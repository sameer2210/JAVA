public class SisBike extends Bike implements Swimmable,Flyable {
	
@Override 
		public void brake(){
			System.out.println(this + "has Disk Brake ......***** ");
		}
		
@Override 
		public void swim(){
			System.out.println(this + " swimming .....**** ");
		}
		
@Override 
		public void fly(){
			System.out.println(this + " flying.....**** ");
		}
		
}//end class