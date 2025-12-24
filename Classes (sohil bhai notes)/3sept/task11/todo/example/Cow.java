
import java.util.Random;


public class Cow {
 private String name;
 private String color;
 private float weight;
  static int totalCows;
 public final static String COLOR_TYPES="white,red,brown,black";
 
 public Cow(String name,String color,float weight){
	 this.name=name;
	 this.color=color;
	 this.weight=weight;
	 totalCows++;
	 System.out.println(this  +" created #"+totalCows);
	 
 }

 
 void eat(){
	 int foodInKg  = new Random().nextInt(10)+1;
	 System.out.println(this +" "+name  +" eating..."+foodInKg +" kg grass");
	 
 }
 
 void details(){
	 System.out.println(this+ "[name=" + name 
			 + ", color=" + color
			 + ", weight=" + weight
				+ "]");
	 }
	 
 //common of all cows 
 static void whatIsCow(){
	 System.out.println("___________________________");
	 System.out.println("cow pet animal");
	 System.out.println("it has "+2 +" ears and "+2 +" eyes");
	 System.out.println("it has "+4+"legs");
	 System.out.println("and "+1 +" tails &"+ 2+"horns" );
	 System.out.println("its gives us milk");
	 System.out.println("___________________________");
	 
 }
 
}
