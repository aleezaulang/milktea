package com.benilde.appdevt1;
import java.util.Scanner;
public class MilkteaMain extends MilkteaAbstractDef{
	public static void main(String[] args) {
		mainProg();
		
	}
	
	public static void mainProg()
	{
		Scanner sc = new Scanner(System.in);
		MilkteaAbstractDef mad = new MilkteaAbstractDef();
		int choice, error, num, index= 0;
		double total =0; 
		double[] prices = {86.50, 92.75, 96.75, 98.00};
		String[] addons = {"[1] Pearls - 15", "[2] Egg Pudding - 20", "[3] Nata de Coco - 15", "[4] Grass Jelly - 20", "[5] Cornflakes - 10"};
		String [] menu = {"[1] Wintermelon", "[2] Okinawa", "[3] Mango Green Tea", "[4] Hazlenut"};
		do {
			mad.menuList();
			System.out.println("Enter Choice");
			choice = sc.nextInt();
		switch(choice)
		{
			case 1: 
				mad.menu();
				break;
			case 2:
				mad.menu();
				mad.ordering();
				break;
			case 3:
				mad.summary();
				break;
			case 4: 
				mad.progInfo();
				break;
			case 5: 
				mad.addOns();
				mad.optional();
				break;
			case 6:
			default:
				mad.closing();
				break;
		}
		} while (choice !=7);
		
	}
}