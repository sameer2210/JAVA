public class Stringcase {
	public static void main(String []args){

	//_________________________________________________________________________________________________________________________

	String s1="sis";
	String s2="nit";
	String s3="sis";
	String s4="SIS";
	String s5=s1;
	System.out.println("s1 ="+s1);
	System.out.println("s2 ="+s2);
	System.out.println("s3 ="+s3);
	System.out.println("s4 ="+s4);
	System.out.println("s5 ="+s5);
	
	System.out.println("________________________");

	System.out.println("s1==s2  "+(s1==s2));//f
	System.out.println("s1==s3  "+(s1==s3));//t
	System.out.println("s1==s4  "+(s1==s4));//f
	System.out.println("s1==s5  "+(s1==s5));//t
	System.out.println("s1.equals(s2)  = "+s1.equals(s2) );//f
	System.out.println("s1.equals(s3)  = "+s1.equals(s3) );//t
	System.out.println("s1.equals(s4)  = "+s1.equals(s4) );//f
	System.out.println("s1.equalsIgnoreCase(s4)  = "+s1.equalsIgnoreCase(s4) );//t
	System.out.println("s1.equals(s5)   = "+s1.equals(s5) );//t

	System.out.println("____________\12_____________\12____________");
	
	String s11= new String("sis");
	String s22= new String("nit");
	String s33= new String("sis");
	String s44= new String("SIS");
	String s55=  s11;

	  System.out.println("s11 = " + s11);
	  System.out.println("s22= " + s22);
	  System.out.println("s33 = " + s33);
	  System.out.println("s44 = " + s44);
	  System.out.println("s55 = " + s55);
	  
	System.out.println("________________________");

	  System.out.println("s11==s22 "  + (s11==s22));//F
	  System.out.println("s11==s33 "  + (s11==s33));//F
	  System.out.println("s11==s44 "  + (s11==s44));//F
	  System.out.println("s11==s55 "  + (s11==s55));//T

	  System.out.println("s11.equals(s22) =  "  + s11.equals(s22)   );//F
	  System.out.println("s11.equals(s33) =  "  + s11.equals(s33)  );//T
	  System.out.println("s11.equals(s44) =  "  + s11.equals(s44)  );//F
	  System.out.println("s11.equalsIgnoreCase(s44) =  "  + s11.equalsIgnoreCase(s44)  );//T
	  System.out.println("s11.equals(s55) =  "  + s11.equals(s55)  );//T
	  
//__________________________________________________________

}
}