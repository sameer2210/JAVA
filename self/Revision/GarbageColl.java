package Revision;

public class GarbageColl {

	public void finalize() {
		System.out.println("object is garbage collected ");
	}

	public static void main(String[] args) {

		GarbageColl c1 = new GarbageColl();
		GarbageColl c2 = new GarbageColl();

		c1 = null;
		c2 = null;

		System.gc();


	}

}
