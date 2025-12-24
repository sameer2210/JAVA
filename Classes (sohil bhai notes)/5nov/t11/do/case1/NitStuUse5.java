public class NitStuUse5 {

	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	while(true){
		try{
			 System.out.println(" enter number ");
			 int num = Integer.parseInt(scan.nextLine());
			 boolean r = SisUtil.isValidNumberMethod2(num);
			 System.out.println(num + " is valid " + r);
			 System.out.println(" all id ok ");
	break;
		}catch(NumberFormatException e){
			System.out.println(" Error : input is not int type ");
			
		}catch(NumberRangeException e){
			System.out.println(" Range Errror  " + e.getMessage());
		}catch(Exception e){
			System.out.println("Error : " + e.getMessage());
		}
	}//end while
		
	}//end main
}//end class