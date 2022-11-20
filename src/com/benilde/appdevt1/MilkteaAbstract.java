package com.benilde.appdevt1;

	public abstract class MilkteaAbstract {
	//public abstract String menu();
	//public abstract String clearScreen();
		double[] prices = {86.50, 92.75, 96.75, 98.00};
		String[] addons = {"Pearls", "Egg Pudding", "Nats de Coco", "Grass Jelly", "Cornflakes"};
		String[] menu = {"Wintermelon", "Okinawa", "Mango Green Tea", "Hazlenut"};
		
		
		public abstract void menu();
		public abstract void ordering();
		public abstract void summary();
		public abstract void optional();
		public abstract void closing();
		public abstract void clearScreen();
		public abstract void Add(int item);
		public abstract float Total();
		public abstract float Total(float discount);
		public abstract void addOns();
		public abstract float Subtract(float payment);
		public abstract int Count();
		public abstract void progInfo();
		public abstract void menuList();
		public abstract String[] GetList();
}
