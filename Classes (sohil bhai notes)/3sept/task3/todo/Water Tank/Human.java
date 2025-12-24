public class Human{
    String name;
	void fill(float givenWater,WaterTank wt){
	System.out.println(name  +" going to fill water "+ givenWater);
	   wt.absorb(givenWater);
	System.out.println(name  +" filled water "+ givenWater);
	}


}