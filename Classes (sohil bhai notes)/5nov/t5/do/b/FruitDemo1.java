
public class FruitDemo1 {
	public static void main(String[] args){
	
		Fruit f1 = new Apple();
		Fruit f2 = new Dhatura();
			f1.grow();
			f2.grow();
			
		if(f1 instanceof Eatable){
				System.out.println(f1 + " can be eat ");
		}else{
					System.out.println(f1 + " can not be eat ");
		}
		
		if(f2 instanceof Eatable){
				System.out.println(f2 + " can be eat ");
		}else{
				System.out.println(f2 + " can not be eat ");
		}
		
}
}
		