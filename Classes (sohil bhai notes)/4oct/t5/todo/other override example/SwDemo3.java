
public class SwDemo3 {

	public static void main(String[] args) {
		
		  MsPaint p1  = new MsPaint();
		p1.open();//S
		p1.min();//S
		p1.max();//S
		p1.restore();//S
		p1.move();//S

		p1.draw();//p
		p1.erase();//p

		p1.close();//  P override
		  System.out.println("_____________***********_________________");
        
		
	}

}
