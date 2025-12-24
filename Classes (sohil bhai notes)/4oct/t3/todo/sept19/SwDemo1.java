
public class SwDemo1 {

	public static void main(String[] args) {
		
		
		MsPaint  paint1 = new MsPaint();
		paint1.title="sis.jpg";
		paint1.x=10;
		paint1.y=10;
		paint1.backgroundColor="gray";
		paint1.height=1000;
		paint1.width=1500;
		
		paint1.currentSelectedToolName="pen";
		paint1.canvasBackGroundColor="white";
		paint1.canvasforeGroundColor="black";
		paint1.canvasHeight=600;
		paint1.canvasWidth=800;
		
        paint1.showAllPaintInfo();
        
        paint1.open();
        paint1.min();
        paint1.max();
        paint1.restore();
        paint1.move();
        
        
        paint1.draw();
        paint1.currentUsedTool();
        System.out.println("+++++++++++++++++++++");
        paint1.erase();
        paint1.currentUsedTool();
        System.out.println("+++++++++++++++++++++");
        paint1.write();
        paint1.currentUsedTool();
        System.out.println("+++++++++++++++++++++");
        paint1.typeText();
        paint1.currentUsedTool();
        System.out.println("+++++++++++++++++++++");
        paint1.pickColor();
        paint1.currentUsedTool();
        
        paint1.close();
        
		
	}

}
