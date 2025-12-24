public class Spe2{
	public static void main(String args[]){
	
	X xObj1 = new X();
	xObj1.m1();
	xObj1.m1(5);
	xObj1.m1(5,2);
	xObj1.m1(5,2,4);
	
	int []arr ={1,2,3,4,5,6};
	
	X3 x3Obj1 = new X3();
	x3Obj1.m1(1,2,3,4,5,6);
	x3Obj1.m1(arr);
	
	
	X2 x2Obj1 = new X2();
	x2Obj1.m1();
	x2Obj1.m1(arr);
	}//end class
}//end class