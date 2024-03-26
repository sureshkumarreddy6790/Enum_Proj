package com.suresh.enumtask;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		TypeOfCoffee tc=null;
		SizeOfCoffee sc=null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter type of coffee:");
		System.out.println("1.Cold Coffee");
		System.out.println("2.black Coffee");
		System.out.println("3.Milk Coffee");
		System.out.println("4.Exit");
		int i = s.nextInt();
		switch (i) {
		case 1 -> tc = TypeOfCoffee.Cold_Coffee;
		case 2 -> tc = TypeOfCoffee.Black_Coffee;
		case 3 -> tc = TypeOfCoffee.Milk_Coffee;
		case 4 -> System.exit(0);
			
		}
		System.out.println("Enter size of the coffee");
		System.out.println("1.Small");
		System.out.println("2.Medium");
		System.out.println("3.Big");
		System.out.println("4.Exit");
		int k = s.nextInt();

		switch (k) {
		case 1 -> sc = SizeOfCoffee.Small;
		case 2 -> sc = SizeOfCoffee.Medium;
		case 3 -> sc = SizeOfCoffee.Big;
		case 4 -> System.exit(0);

		}
		CoffeeOrder co = new CoffeeOrder(tc,sc);
		System.out.println(co.getOrderDetails());
	}
}
