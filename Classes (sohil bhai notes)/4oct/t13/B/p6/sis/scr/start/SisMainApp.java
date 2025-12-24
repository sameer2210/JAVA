package sis.product.start;

import java.io.Console;
import java.util.Date;

import sis.product.device.Device;
import sis.product.device.Laptop;
import sis.product.device.Mobile;
import sis.product.fruit.Apple;
import sis.product.fruit.Banana;
import sis.product.fruit.Fruit;

public class SisMainApp {
	public static void main(String args[]){

		Date d1 = new Date();
		System.out.println("welcome to SisMainApp ");
		System.out.println("today is  " + d1 );
		
		Device device1 = new Laptop();
		Device device2 = new Mobile();
		sis.product.food.Pizza p1 = new sis.product.food.Pizza();
		Fruit f1 = new Banana();
		Fruit f2 = new Apple();
		Fruit f3 = new Apple();
		
	
	}//end class
}//end class