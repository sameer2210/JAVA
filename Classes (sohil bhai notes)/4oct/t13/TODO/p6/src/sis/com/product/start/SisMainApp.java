package sis.com.product.start;

import java.io.Console;
import java.util.Date;

import sis.com.product.device.Device;
import sis.com.product.device.Laptop;
import sis.com.product.device.Mobile;
import sis.com.product.fruit.Apple;
import sis.com.product.fruit.Banana;
import sis.com.product.fruit.Fruit;

public class SisMainApp {

	public static void main(String[] args) {
		Date d1  = new Date();
		System.out.println("welcome to SisMainApp ");
		System.out.println("today is "+ d1);
		Device device1 = new Laptop();
		Device device2 = new Mobile();
		sis.com.product.food.Pizza p1  = new sis.com.product.food.Pizza();  
		Fruit f1  =new Banana();
		Fruit f2  = new Apple();
		Fruit f3  = new Apple();
		
		
		
	}

}
