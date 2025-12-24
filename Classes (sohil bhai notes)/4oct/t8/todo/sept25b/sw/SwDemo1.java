
public class SwDemo1 {

	public static void main(String[] args) {
		
		Calculator c1  = new Calculator();
		c1.open();//S
		c1.min();//S
		c1.max();//S
		c1.restore();//S
		c1.move();//S

		c1.add(1,2);//C
		c1.sub(5,2);//C

		c1.close();//S
		  System.out.println("______________________________");
        
		
	}

}
