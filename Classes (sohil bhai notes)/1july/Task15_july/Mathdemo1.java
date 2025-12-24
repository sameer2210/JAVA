public class Mathdemo1 {
	public static void main(String args[]){
/*	
	System.out.println(Math.random());	//0.2672.....
	System.out.println(Math.PI);		//3.1415....
	System.out.println(Math.max(10.5,5.6));  //10.5
	System.out.println(Math.min(10.5,5.6));   //5.6

System.out.println("________________________________________________");

	System.out.println(Math.pow(2,5));		//32.0
	System.out.println(Math.pow(2,10));		//1024.0
	System.out.println(Math.sqrt(100));		//10.0
	System.out.println(Math.cbrt(1000));		//10.0
	System.out.println(Math.PI);			//3.141592653...
	System.out.println((float)Math.PI);		//3.1415927

System.out.println("_____________________________________________");

	String str="SIS JAVA NIT";
	System.out.println("str = " + str);	//str = SIS JAVA NIT

	String sub1= str.substring(4,7);
	System.out.println(sub1);		//JAV
	String sub2 = str.substring(4,8);
	System.out.println(sub2);		//JAVA
*/
System.out.println("______________________________________________");
	
	String str="SIS JAVA NIT";
	System.out.println("str = " + str);		//str = SIS JAVA NIT
	System.out.println(str.substring(4,8));		//JAVA
	System.out.println("*****************************");
	System.out.println(str.substring(4,str.length()));	//JAVA NIT
	System.out.println(str.substring(4,12));		//JAVA NIT
	System.out.println(str.substring(4));		//JAVA NIT
	
}
}