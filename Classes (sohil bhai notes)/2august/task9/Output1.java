public class Output1 {
	public static void main(String args[])throws Exception{
	
	for(int i=1; i<=5;i++){
		System.out.printf("i = %3d : ",i);
		for(int j=1;j<=5;j++){
		System.out.printf("%3d ",j);
		}
	System.out.println();
	}
System.out.println("________________________");
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
		System.out.printf("[%d%d]",i,j);
		}
	System.out.println();
	}
System.out.println("_________________________");
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
		   if(i==j){
		System.out.printf("[%1d%1d]",i,j);
			}else{
		System.out.printf("[%2s]","*");
			}
		}
	System.out.println();
	}
System.out.println("__________________________");
	
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			Thread.sleep(200);
		 if(i==j){
			System.out.printf("[%1d%1d]",i,j);
		}else{
			System.out.printf("[%2s]","*");
				}
			}
		System.out.println();
		}
System.out.println("___________________________________");
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			Thread.sleep(200);
		if(i==j){
		System.out.printf("[%1d%1d]",i,j);
		}else{
		System.out.printf("[%2s]","*");
			}
		if(i==3 && j==3){
		  break;
		}
	}
	System.out.println();
		if(i==3)break;
	}	
	
System.out.println("Happy Ending.........");
	
}

} 