public class Spe2 {
	public static void main(String args[]){
	
	int row=1;
	int col=1;
	for(int task=1;task<=100;task++){
	
	int result = (10*(col-1))+row;
//	int result = col*row;

		System.out.printf("%4d",result);
		col++;
		if(task%10==0){
			row++;
			col=1;
		System.out.print("\n");
		}
	}

System.out.println("______________________________________________");

}
}