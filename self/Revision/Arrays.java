package Revision;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// main 3 type of method arrays

//	int marks []= new int [5];
//		 marks[1]=54;
//		 marks[2]=64;
//		 marks[3]=84;
//		 marks[4]=44;
//		 marks[0]=44;
////		 marks[5]=54; // not working already complete 5 arrays
//		 System.out.println(marks[3]);
//		 System.out.println(marks[4]);

//		int [] marks;
//		marks=new int [5];
//
//		marks[1]=43;
//		marks[2]=93;
//		marks[3]=53;
//
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);


//		int [] marks = {54,55,45,85,85};

//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);

//		System.out.println(marks.length);
//display useing for loop

//		for(int i=0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}

//display useing for each loop
//		for(int each:marks) {
//			System.out.println(each);
//		}


		int[][]floar = new int[2][3];

		floar [0][0]=101;
		floar [0][1]=102;
		floar [0][2]=103;
		floar [1][0]=104;
		floar [1][1]=105;
		floar [1][2]=106;

//		for(int i=0; i<floar.length; i++) {
//			for(int j=0; j<floar.length; j++) {
//				System.out.print(floar[i][j]);
//			System.out.println(" ");
//			}
//			System.out.println(" ");
//		}

		for(int[] i:floar) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}





	}

}
