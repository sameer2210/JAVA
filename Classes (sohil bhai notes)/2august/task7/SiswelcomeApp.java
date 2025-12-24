public class SiswelcomeApp {	
	public static void main(String args[]){
	
	String showOption ="cui";
	if(args.length==1){
	
	 String option = args[0];
	 if("gui".equals(option)){
		showOption ="gui";
	}else if ("both".equals(option)){
		showOption ="both";
	}
	}

	//logic 
	String msg ="Welcome To sis To all Engineers! ";
	
	if("both".equals(showOption)){
	 System.out.println(msg);
	  javax.swing.JOptionPane.showMessageDialog(null,msg);
	}else if("gui".equals(showOption)){
		javax.swing.JOptionPane.showMessageDialog(null,msg);
	}else{
		System.out.println(msg);
	}

}
}
