public class Stringdemo123{
	public static void main (String args[]){
	
	String s1="java";
	String s2="sis";
	System.out.println("s1=" +s1);		//s1=java
	System.out.println("s2=" +s2);		//s2=sis
	System.out.println(s1.concat(s2));	//javasis
	System.out.println("***********************");
	
	System.out.println("s1=" +s1);		//s1=java
	System.out.println("s2= "+s2);		//s2=sis
	
System.out.println("____________________________________________");
	
	System.out.println(s1);		//java		
	System.out.println(s1.toUpperCase());	//JAVA
	System.out.println(s1);		//java
System.out.println("____________________________________________");
	
	//String s1=new String("java");
	System.out.println(s1);		//java
	s1.concat("sis");		
	System.out.println(s1);		//java	
	System.out.println("************************");	
		
	StringBuilder sb=new StringBuilder("java");
	System.out.println(sb);		//java
	sb.append("sis");
	System.out.println(sb);		//javasis
	
}
}
