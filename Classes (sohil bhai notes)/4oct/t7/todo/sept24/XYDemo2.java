
public class XYDemo2 {

	public static void main(String[] args) {
		Y ob1  = new Y();
		ob1.show();
		System.out.println("#############################");
		Y ob2  = new Y(10,20,30);
		ob2.show();
		System.out.println("#############################");
		Y ob3  = new Y(100,200,300,400);
		ob3.show();
		System.out.println("#############################");
		Y ob5  = new Y(1,2,3,4,5);
		ob5.show();

		System.out.println("#############################");
		Y ob6  = new Y(11,22,33,44,55,66);
		ob6.show();
	}

}
