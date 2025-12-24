public class Tdemo4{
	public static void main(String args[]){
	
	Television t1 = new Television();
	t1.brandName="Sony";
	t1.modelNumber="marvel420";
	t1.price=963852;
	t1.type="LED";
	t1.size="51inc\"";
	
	t1.on();
	t1.showDetails();
	
	for(int a=1;a<=10;a++){
		t1.decreaseVolume();
	}
		t1.showDetails();
		
		for(int a=1;a<=110;a++){
		t1.increaseVolume();
		}
			
	}//end main
}//end class