
public class Laptop {
    private String os;
    private int totalRam;
    private int totalHardDisk;
    public void on(){System.out.println(this+"on");}
    public void off(){System.out.println(this+"off");}
    
    public void installOs(){
    	/*os = "window";
    	   linux dos unix mac
    	  */
    }
    public void installRam(){
    /*  totalRam=4;*/ //1 2 4 8 32 126 gb
    }
    public void setHarDisk(){
        /*totalHardDisk=1;//tb 1 2 4 5 
*/   
    	}
    
    void showDetails(){
    	System.out.println(this  +"os= "+os  +" Ram =" +totalRam +" HD= "+totalHardDisk);
    }
}
