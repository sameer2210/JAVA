public class Case1 {
	public static void main(String args[])throws Exception{
	
	for(int gn=1;gn<=100;gn++){
	int num = ((int)(Math.random()*100))+1;
	//System.out.print(num+" ");
	//System.out.printf("%4d",num);
	System.out.printf("%-4d",num);
		if(gn%10==0){
		 System.out.println("\n");
		}
	}
System.out.println("______________________________________________________");
	
	for(int gn=1;gn<=100;gn++){
	//int num =((int)(Math.random()*100))+1;
	System.out.print("* ");
		if(gn%10==0){
		System.out.print("\n");
		}
	}
System.out.println("______________________________________________________");
	
	//mindtable
	
	for(int r=1;r<=10;r++){
	  for(int c=1;c<=10;c++){
		System.out.printf("%5d",r*c);
			Thread.sleep(30);
		}
		System.out.println("\n");
	}
	System.out.println("**************************************************************");
	for(int r=11;r<=20;r++){
	for(int c=101;c<=110;c++){
		System.out.printf("%5d",r*c);
		Thread.sleep(20);
		}
		System.out.println("\n");
	}

}
}