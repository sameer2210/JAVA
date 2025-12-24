public class Tdemo1{
	public static void main(String args[]){

	Television t1 = new Television();
	t1.brandName="Sony";
	t1.modelNumber="sort450";
	t1.price=123456;
	t1.type="LED";
	t1.size="51nm\"";
	
	t1.showDetails();
	t1.on();
	t1.showDetails();
	t1.off();
	t1.showDetails();
		
	}//end main
}//end class