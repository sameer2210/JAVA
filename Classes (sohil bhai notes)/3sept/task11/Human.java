public class Human{

 String name;
 int age;
 static int totalPopulation;
 
 public Human(){
	totalPopulation++;
	System.out.println(this + " created.....totalPopulatoin = " + totalPopulation);
 }
 
 void show(){
	System.out.println(this + " name : " + name + " age : " + age);
 }
 
}//end class