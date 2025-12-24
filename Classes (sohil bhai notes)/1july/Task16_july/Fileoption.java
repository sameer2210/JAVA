public class Fileoption {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.println("select your option");
	System.out.println("1:file");
	System.out.println("2:edit");
	System.out.println("3:view");
	System.out.println("4:help");
	int option =scan.nextInt();
	  switch(option){
	    case 1:
			System.out.println("File operation");
			System.out.println("select option");
			System.out.println("n:new");
			System.out.println("o:open");
			System.out.println("s:save");
			System.out.println("x:exit");
		String fileOperationStr=scan.next();
		char fileOperationChar=fileOperationStr.charAt(0);
		switch(fileOperationChar){
	case 'n':
	System.out.println("opened new file");
		//TODO
		break;
	case 'o':
	System.out.println("opened old file");
		//TODO
		break;
	case 's':
	System.out.println("file savaed");
		//TODO
		break;
	case 'x':
	System.out.println("exit program");
		//TODO
		break;
	}
	break;
	case 2:
		System.out.println("Edit operation");
	break;
	case 3:
		System.out.println("View operation");
	break;
	case 4:
		System.out.println("help");
		System.out.println("sis :version 1.0");
	break;

	default :
	System.out.println("invalid operation");
	break;
	}

}
}