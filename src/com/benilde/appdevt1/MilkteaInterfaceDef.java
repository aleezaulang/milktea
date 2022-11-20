package com.benilde.appdevt1;

import java.util.Scanner;

public abstract class MilkteaInterfaceDef implements MIlkteaInterface {
	int index = 0, count = 0;
	double total = 0;
	private int num;
	String[] items = new String [10];
	double[] price = new double[10];
	String[] addon = new String[10];
	Scanner sc = new Scanner(System.in);
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public void optional()
	{
		int ind = 0;
		System.out.println("Enter product number: ");
		num = sc.nextInt();
		System.out.println(addons[num - 1]);
		addon[ind] = addons[num - 1];
		ind++;
	}
	@Override
	public void summary()
	{
		System.out.println("~Order Summary~");
		System.out.println("Item:    \t\tPrice:");
		for (int i = 0; i < items.length; i++) 
		{
			if(addon.length == 0){
				System.out.println(items[i] + " Add-ons: none" + "\t" + price[i]);
			}
				
			else if (addon.length > 0){
				System.out.println(items[i] + " Add-ons: " + addon[i] + "\t" + price[i]);
			}
		}
		System.out.println("\nTotal " + total);
	}
	@Override
	public void closing()
	{
		System.out.println("Thank you for using this Program");
	}
	@Override
	public void ordering()
	{
		System.out.println("How many products you want?");
		count = sc.nextInt();
		System.out.println("Enter product number: ");
		num = sc.nextInt();
		items = new String[count];
		price = new double[count];
		
		
				System.out.println(menu[num -1]);
		
		items[index] = menu[num - 1];
		price[index] = prices[num - 1];
		index++;
		System.out.println();
	}
	@Override
	public void menu()
 	{
		System.out.println("Wintermelon		Php 86.50");
		System.out.println("Okinawa			Php 75.40");
		System.out.println("Mango Green Tea		Php 80.57");
		System.out.println("Hazelnut		Php 90.56");
 	}
	@Override
	public void progInfo()
	{
		System.out.print("Programmed by: ");
		System.out.println("\nGalias, Renato Miguel C.");
		System.out.println("Go, Adrian Peter S.");
		System.out.println("Pestanas, Brent Edrick A.");
		System.out.println("Ulang, Aleeza China");
	}
	@Override
	public void menuList()
	{
		System.out.println("~Welcome to Mighty Tea~");
		System.out.println("[1] - Menu");
		System.out.println("[2] - Order");
		System.out.println("[3] - Order Summary");
		System.out.println("[4] - Programmer's Info");
		System.out.println("[5] - Add-Ons");
		System.out.println("[6] - Quit");
	}
	@Override
	public void clearScreen() {
		
		System.out.flush();
	}
	@Override
	public void Add(int item) {
		int size = items.length;
		 if (index == size)
         {
             
             String[] tempItems = new String[index];
             double[] tempPrice = new double[index];
             for (int i = 0; i < index; i++)
             {
                 tempItems[i] = items[i];
                 tempPrice[i] = price[i];
             }
             size = size * 2;
             items = new String[size];
             price = new double[size];
             for (int i = 0; i < index; i++)
             {
                 items[i] = tempItems[i];
                 price[i] = tempPrice[i];
             }


         }
		items[index] = menu[item - 1];
		price[index] = prices[item - 1];
		index++;
		
	}
	@Override
	public float Subtract(float payment) {
		float result = 0;
		result = (float) (payment - Total());
		return result;
	}
	@Override
	public int Count() {
		
		return index;
	}
	@Override
	public float Total() 
	{
		float result = 0;
		for (int i = 0; i < price.length; i++) 
		{
			result += price[i];
		}
		
		
		return result;
	}
	@Override
	public void addOns()
	{
		System.out.println("[1] Pearls - 15");
		System.out.println("[2] Egg Pudding - 20");
		System.out.println("[3] Nata de Coco - 15");
		System.out.println("[4] Grass Jelly - 20");
		System.out.println("[5] Cornflakes - 10");
	}
	@Override
	public float Total(float discount)
	{
		float result = (float) (Total() / discount);
		
		return result;
	}
}
