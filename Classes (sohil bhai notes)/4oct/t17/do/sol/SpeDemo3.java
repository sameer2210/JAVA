public class SpeDemo3 {
	public static void main(String args[]){
	
	Integer iObj1 = new Integer(100);
	Integer iObj2 = new Integer(123);
	SisInteger sisIObj1 = new SisInteger(100);
	SisInteger sisIObj2 = new SisInteger(200);
	
	System.out.println(iObj1);	// 100
	System.out.println(iObj1.toString()); 	// 100
	System.out.println("_______________________");
	System.out.println(iObj2); 	//123
	System.out.println(iObj2.toString()); 	//123
	System.out.println("___________Sis Integer ___________\n");
	
	System.out.println(sisIObj1); 	//SisInteger@15......		//100
	System.out.println(sisIObj1.toString()); 	//SisInteger@15......	//100
	System.out.println(sisIObj2);		//SisInteger@6d06b......	//200
	System.out.println(sisIObj2.toString());		//SisInteger@6d0.....	//200
	
	//		SisInter@15db9742
	//		SisInter@6d06d69c
	
	}//end main
}//end class