public class Case1 {
	public static void main(String args[]){

			int a = 100;
			int b = 200;
			int c = 300;
			System.out.println(" a = " + a);
			System.out.println(" b = " + b);
			System.out.println(" c = " + c);
			System.out.println(" a == b " + (a==b));	//f
			System.out.println(" a ==c " + (a==c));		//f

		//heap
		Integer iOb1 = new Integer(100);
		Integer iOb2 = new Integer(200);
		Integer iOb3 = new Integer(300);
		System.out.println(" iOb1 = " + iOb1);	//100
		System.out.println(" iOb2 = " + iOb2);	//200
		System.out.println(" iOb3 = " + iOb3);	//300
		System.out.println(" iOb1 ==iOb2 " + (iOb1==iOb2));		//f
		System.out.println(" iOb1 ==iOb3 " + (iOb2==iOb3));		//f
		
		iOb1 = null;
		iOb2 = null;
		iOb3 = null;

		System.out.println(" iOb1 = " + iOb1);	//null
		System.out.println(" iOb2 = " + iOb2);	//null
		System.out.println(" iOb3 = " + iOb3);	//null

	
	}//end main
}//end class