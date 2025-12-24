public class Siscal {
	public static void main(String args[]){
		
	if(args.length!=2){
	 System.out.println("enter two number only");
	  System.exit(0);
	}
	String num1Str =args[0];
	String num2Str =args[1];
	
	int num1 = Integer.parseInt(num1Str);
	int num2 = Integer.parseInt(num2Str);
	int sum = num1+num2;
	
	System.out.println("num1= "+num1Str);
	System.out.println("num2 =" +num2Str);
	System.out.println("sum = "+ sum);

	//System.out.println(num1Str + num2Str);

}
}