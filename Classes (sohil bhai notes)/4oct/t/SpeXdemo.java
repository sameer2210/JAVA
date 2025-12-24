public class SpeXdemo{
	public static void main(String args[]){
	
/* 
	X o = new X();
	
	o.m1();						//0 args
	o.m1(10);					//1 args 10
	o.m1(11,22);				//2 args 11,22
	o.m1(111,222,333);	//3 args 111,333


 
	X2 o = new X2();
	o.m1();
	//CTE o.m1(10);							
	o.m1(new int[]{10});																		//1 args [10]
	o.m1(new int[]{11,22});																	//2 args [11,22]
	o.m1(new int[]{111,222,333});														//3 args [111, 222, 333]
	o.m1(new int[]{111,222,333,444,55,66,77,88});								//8 args [
	o.m1(new int[]{111,222,333,444,55,66,77,88,1,2,3,4,5,6,7,8,9});		//17 args [
	o.m1(new int[]{111,222,333,444,55,66,77,88,1,2,3,4,5});					//13 args [
	//problem with this we have to create array and pass it to arr ref			
*/

	X3 o = new X3();
	o.m1();														//0 args []
	o.m1(1,2,4,5);											//4 args [1,2,3,5]
	o.m1(1);													//1 args [1]
	o.m1(1,44,5,6,7,88,5,53,8,32,93,566,2,5);	//14 args [1.....
	o.m1(new int[]{11,22,33});						//3 args [
	int arr[]={22,33,44,55,66,77,88};				//7 args [
	o.m1(arr);													//
	
	
}//end main
}//end class