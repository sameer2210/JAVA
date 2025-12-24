public class Tdemo3{
	public static void main(String args[]){
	
	Television t1 = new Television();
	t1.brandName="sony";
	t1.modelNumber="marvel420";
	t1.type="LED";
	t1.price=999999;
	t1.size="51inc\"";
	
	t1.on();
	t1.showDetails();
	t1.increaseVolume();
	t1.increaseVolume();
	t1.increaseVolume();
	t1.increaseVolume();
	t1.increaseVolume();
	t1.showDetails();
	t1.decreaseVolume();
	t1.decreaseVolume();
	t1.showDetails();
	t1.off();

	}//end main
}//end class