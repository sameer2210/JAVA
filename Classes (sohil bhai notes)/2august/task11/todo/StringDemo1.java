
public class StringDemo1 {

	public static void main(String[] args) {
		String s1 ="sis";
		String s2 ="java";
		String s3 ="nit";
  System.out.println("s1 = " + s1);
  System.out.println("s2 = " + s2);
  System.out.println("s3 = " + s3);
  System.out.println("_______________________");
  System.out.println(s1.concat(s2));//sisjava
  System.out.println("s1 = "+s1);//?? sis 
  String temp  = s1.concat(s2);
  System.out.println("temp = "+temp);//?? sisjava
	}

}
