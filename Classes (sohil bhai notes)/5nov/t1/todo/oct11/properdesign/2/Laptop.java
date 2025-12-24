
abstract public class Laptop {

   protected String os;
   protected int totalRam;
   protected int totalHardDisk;
    public void on(){System.out.println(this+"on");}
    public void off(){System.out.println(this+"off");}
    
    abstract public void installOs();
    abstract public void installRam();
    abstract  public void setHarDisk();

    
    void showDetails(){
    	System.out.println(this  +"os= "+os  +" Ram =" +totalRam +" HD= "+totalHardDisk);
    }
}
