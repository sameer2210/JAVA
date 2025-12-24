public class SisGreetGui extends SisGreet {

	public void showMessage(){
	
		String msg ="welcome user " +getUserName()+"\n";
		msg = msg+"today date is " + getFormatedDate();
		
		javax.swing.JOptionPane.showMessageDialog(null,msg);
		
	}
	
}//end class