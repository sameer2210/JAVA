public class Wc1 {
	public static void main(String args[]){
		
		String s1 = new String("java");
		String s2 = new String("nit");
		String s3 = new String("java");

		System.out.println(s1==s2);			//f
		System.out.println(s1==s3);			//f
		System.out.println(s1.equals(s2));	//f
		System.out.println(s1.equals(s3));	//t
		System.out.println("_____________");
		
		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(2000);
		Integer i3 = new Integer(1000);
		
		// difrent refrence vlaue of i1,i2,i3  (this) 
		
		System.out.println("________==________");
		System.out.println(i1==i2);		//f
		System.out.println(i1==i3);		//f
		
		System.out.println("_______equals_______");
		System.out.println(i1.equals(i2));		//f
		System.out.println(i1.equals(i3));		//t
	
		//here not take refrence value its convert to int
	
		System.out.println("______ob.intValue_______");
		System.out.println(i1.intValue()==i2.intValue());		//f
		System.out.println(i1.intValue()==i3.intValue());		//t

		//all wc has equals method
		

		}//end main
}//end class