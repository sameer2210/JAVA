
public class PersonType5
	extends Person
	implements Seeable,Speaker,Listener{

	@Override
	public void hear() {
		System.out.println(this  +" hear");
	}

	@Override
	public void speak() {
		System.out.println(this  +" speak");
	}

	@Override
	public void see() {
		System.out.println(this  +" see");
	}

}

