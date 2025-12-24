
public class Case1 {

	public static void main(String[] args) {
	
		int a  = 1000;
		int b=2000;
		int c  = 1000;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		System.out.println("a==b" +(a==b));//f
		System.out.println("a==c" +(a==c));//t
		
		//heap 
		Integer iOb1 = new Integer(1000);
		Integer iOb2 = new Integer(2000);
		Integer iOb3 = new Integer(1000);
		System.out.println("iOb1 = " + iOb1);//1000
		System.out.println("iOb2 = " + iOb2);//1000
		System.out.println("iOb3 = " + iOb3);//1000
		System.out.println("iOb1==iOb2 " +(iOb1==iOb2));//False // according to obj address
		System.out.println("iOb1==iOb3 " +(iOb2==iOb3));//false // according to obj address
		
		
		/*iOb1= null;
		iOb2= null;
		iOb3= null;
		System.out.println("iOb1 = " + iOb1);
		System.out.println("iOb2 = " + iOb2);
		System.out.println("iOb3 = " + iOb3);
		*/
	}

}
