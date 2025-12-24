public class Stringdemo1 {
	public static void main(String args[]) {
	String sis="Success is sure";
	
	System.out.println(sis.length());	//15
	System.out.println(sis.charAt(0));	//s
	System.out.println(sis.charAt(1));	//u
	System.out.println(sis.charAt(2));	//c
	System.out.println(sis.toLowerCase());	//success is sure
	System.out.println(sis.toUpperCase());	//SUCCESS IS SURE
System.out.println("*****************************************************");
	String sis2="  Sameer it solution  ";	
	System.out.println(sis2);		//Sameer it solution
	System.out.println(sis2.length());	//22
	String s = sis2.trim();	
	System.out.println(s.length());		//18

System.out.println("_______________________________________________");

	String s1="SIS";
	String s2="NIT";
	String s3="SIS";
	String s4="sis";
	System.out.println("s1 = "+ s1);	//SIS
	System.out.println("s2 = "+ s2);	//NIT
	System.out.println("s3 = "+ s3);	//SIS
	System.out.println("s4 = "+s4);		//sis

	System.out.println(s1.equals(s2));	//f	
	System.out.println(s1.equals(s3));	//t
	System.out.println(s1.equals(s4));	//f
	System.out.println(s1.equalsIgnoreCase(s4));//t




}
}	