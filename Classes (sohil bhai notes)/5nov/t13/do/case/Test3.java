public class Test3 {
	
/*	
//way 1 	//  never compile 
	public static void main(String args[]){
		X.m3();	// caller must be handled exception may be come or not 
	}
}// class
*/
/*
// Way 2  compile but wrong approch : why ?
			//  Exception must not reach to jvm... it will shutdown app
	public static void main(String args[]) {
		X.m3();	//caller must be handled exception may be come not
	}
}// class
*/

// Way 3   // try catch ()
		public void main(String args[]){
		try{
				X.m3(); 	//caller must be handled exception may be came not
		}catch(Exception e){
			System.out.println(" error found " + e.getMessage()+ " " );
			System.out.println(" ToDo for problem ..... ");
		}
	}//end main
}//end class

