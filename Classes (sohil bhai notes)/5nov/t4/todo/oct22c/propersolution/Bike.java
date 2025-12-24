
public abstract class Bike {
	
 public void start(){
	 System.out.println(this  +" started...");
 }
 
 public void stop(){
	 System.out.println(this  +" stoped...");
 }
 public void run(){
	 System.out.println(this  +" running...");
 }

 public void fillFuel(float totalLtr){
	 System.out.println(this  +" filled..with."+ totalLtr +"ltr");
 }
//some have normal brake
	//some have disk brake
 public abstract void brake() ;
 
 //public  void fly(){}
 //public abstract void fly() ;
 //public abstract void swim() ;
 //public void swim(){} ;

}
