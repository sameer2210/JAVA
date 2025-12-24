
public class PartternQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parttern6(5);
		
	}
		 static void parttern1(int n) {
			 for (int row=1; row<=n; row++) {
				 for(int col=1; col<=row; col++) {
					 System.out.print("* ");
				 } 
				 System.out.println(" ");
			 }
		 } 

		 
	static void parttern2(int n) {
		for (int row=1; row<=n; row++) {
			for(int col=1; col<=n; col++) {
				System.out.print("* ");
			} 
			System.out.println(" ");
		}
	} 
	
	
	static void parttern3(int n) {
		for (int row=1; row<=n; row++) {
			for(int col=1; col<=n-row+1; col++) {
				System.out.print("* ");
			} 
			System.out.println(" ");
		}
	} 
	
	 
	static void parttern4(int n) {
		for (int row=1; row<=n; row++) {
			for(int col=1; col<=n-row+1; col++) {
				System.out.print(col);
			} 
			System.out.println(" ");
		}
	} 

	
	static void parttern5(int n) {
		for (int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col);
			} 
			System.out.println(" ");
		}
	} 
	
	
	static void parttern6(int n) {
		for (int row=1; row<2*n; row++) {
			int rowend= row>n ? 2*n-row : row;
			for(int col=1; col<rowend+1; col++) {
				System.out.print(col + " ");
			} 
			System.out.println(" ");
		}
		
		
	}

}
