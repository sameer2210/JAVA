package Revision;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		for(int i=0; i<=30;i++) {
//			System.out.println(i+"continue the process ");
//
//			if(i==20){
//				continue;
//			}
//				System.out.println("its over ");
//			if(i==23) {
//				break;
//			}
//			System.out.println("sameer");
//		}

//		int i=1;
//		while(i<10){
//			if(i==5) {
//				System.out.println("sameer");
//			break;
//			}
//				i++;
//				System.out.println("hero");
//		}
		int i=1;
		do {
			i++;
			System.out.println(i+"do");
		 if(i==10) {
			 System.out.println(i+"if");
			 continue;
		  }
		 System.out.println("if extra ...");
		}while(i<=25);
				System.out.println(i+"while over ");









	}
}
