public class Spe {
	public static void main(String args[]){
/*
	for(int task=1;task<=100;task++){
	 int num = ((int)(Math.random()*100))+1;
		System.out.printf(%4d",4d",num);
	}
*/
/*
	for(int task=1001;task<=1100;task++){
	 int num = ((int)(Math.random()*100))+1;
		System.out.printf(%4d",num);
	}
*/
/*	
	int num=1;
	for(int task=1001;task<=1100;task++){
		System.out.printf("%4",num);
		num++;
	}
*/


	int num=1;
	for(int task=1001;task<=1100;task++){
		System.out.printf("%4d",num);
		num++;
		if(task%10==0){
		System.out.print("\n");
		}
	}


}
}