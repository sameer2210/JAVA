public class MsPaint extends Software {
	/*
	  part of parent class String title; int x; int y; float height; float
	  width; String backgroundColor; void
	  open(){System.out.println("sw opened");} void
	  close(){System.out.println("sw closed");} void
	  min(){System.out.println("sw min");} void
	  max(){System.out.println("sw max");} void
	  restore(){System.out.println("sw restore");} void
	  move(){System.out.println("sw move");}
	 */

	String currentSelectedToolName;
	String canvasBackGroundColor;
	String canvasforeGroundColor;
	float canvasHeight;
	float canvasWidth;

	void draw() {
		System.out.println("drawing...");
		currentSelectedToolName="shape";
	}

	void erase() {
		System.out.println("erase...");
		currentSelectedToolName="Rubber";
	}

	void write() {
		System.out.println("writing...");
		currentSelectedToolName="pen";
	}

	void typeText() {
		System.out.println("typing...");
		currentSelectedToolName="text";
	}

	void pickColor() {
		System.out.println("picking color...");
		currentSelectedToolName="colors";
	}

	void showAllPaintInfo(){
		System.out.println("________________________");
		System.out.println(this +" info ");
		System.out.println("***title " + title);
		System.out.println("***x,y " +x +","+y );
		System.out.println("***height, width" +height +","+width);
		System.out.println("backgroundColor " + backgroundColor);
		System.out.println("currentSelectedToolName " +currentSelectedToolName );
		System.out.println("canvasBackGroundColor " + canvasBackGroundColor);
		System.out.println("canvasforeGroundColor " + canvasforeGroundColor);
		System.out.println("canvasHeight " + canvasHeight);
		System.out.println("canvasWidth " + canvasWidth);
		System.out.println("________________________");
	}
	
	void currentUsedTool(){
		System.out.println("currentSelectedToolName " + currentSelectedToolName);
	}
	


}
