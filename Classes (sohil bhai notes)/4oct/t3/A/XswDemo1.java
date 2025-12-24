public class XswDemo1{
	public static void main(String args[]){
	
	XmsPaint p1 = new XmsPaint();
	p1.title="sis.jpg";
	p1.x=10;
	p1.y=20;
	p1.backgroundColor="gray";
	p1.height=2000;
	p1.width=3000;
	
	p1.currentSelectedToolName="pen";
	p1.canvasBackGroundColor="white";
	p1.canvasforeGroundColor="black";
	p1.canvasHeight=500;
	p1.canvasWidth=900;
	System.out.println("__________________");
	
	p1.showAllPaintInfo();
	
	p1.open();
	p1.close();
	p1.min();
	p1.max();
	p1.restore();
	p1.move();
	
	p1.draw();
	p1.currentUsedTool();
	System.out.println("______________");
	p1.erase();
	p1.currentUsedTool();
	System.out.println("______________");
	
	p1.write();
	p1.currentUsedTool();
	System.out.println("______________");
	p1.typeText();
	p1.currentUsedTool();
	System.out.println("______________");
	p1.pickColor();
	p1.currentUsedTool();
	
	p1.close();
	

	}//end main
}//end class