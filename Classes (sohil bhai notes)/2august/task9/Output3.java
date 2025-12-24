public class Output3 {
	public static void main(String args[]){
	
	System.out.println("start");
	int counter =0;
	
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			for(int k=1;k<=5;k++){
			 System.out.println("loop "+ ++counter);
		
			  if(i==2&&j==2&&k==2){
				break;
					//stop loop
			   }
			  }//k loop
			if(i==2&j==2)break;
		}// j loop	
		  if(i==2){ break;}
		}
	

myBreakPointLable:
	
	for(int i=1;i<5;i++){
		for(int j=1;j<=5;j++){
			for(int k=1;k<=5;k++){
			 System.out.println(" loop "+ ++counter  +" i = "+i  +  "j = " +j  +  "k = "+k);
			  if(i==2&&j==2&& k==2){
				break myBreakPointLable;
			  }
			 }// k loop
		}// j loop
	}
	System.out.println("end  ");
}
}
