
public class Student {

	public void takeBook(final Book lifeBook) {
		System.out.println("life given book " + lifeBook  +" " +lifeBook.name);
		System.out.println("after 5 year change book");
		try{ Thread.sleep(5000); } catch(Exception e){}
		System.out.println("going to change");
		
		lifeBook = new Book("advance Success ");
		System.out.println("life new  book " + lifeBook  +" " +lifeBook.name);
		
	}
     //r=2
	void calculateCircleArea(final double r){
		r++;//3
		System.out.println(Math.PI *r*r);
	}
	
}
