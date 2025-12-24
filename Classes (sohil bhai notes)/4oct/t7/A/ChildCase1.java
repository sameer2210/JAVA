
public class ChildCase1 {
	public static void main(String [] args){

	Parent p1 = new Parent("baburao ","maharashta");
			p1.showInfo();
			System.out.println("___________________");
			
	Child c1 = new Child("raakaa ","raipur","gopi modi");
			c1.showInfo();
	}

/*	
		Parent@15db9742________Parent_______
		name baburao
		address maharashta
		___________________
		Child@6d06d69c __________Child___________
		name gopi modi
		parent name raakaa
		address raipur
*/	

}//end class