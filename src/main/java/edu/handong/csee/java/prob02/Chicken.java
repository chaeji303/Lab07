package edu.handong.csee.java.prob02;

import java.util.Scanner;

public class Chicken { //class
	/**
	 * This class defines ranking of chicken. 
	 * I love a java programming class!!! I want to be a good java programmer!
	 * 
	 * @author Jihye Chae 
	 * 2018.04.05
	 */

	private String name; //define name
	private double price; //define price
	private int stars; //define stars

	public Chicken() { 
		// TODO Auto-generated constructor stub
		/**
		 * This method defines a constructor.
		 * It is initialise via a constructor.
		 * 
		 * @author Jihye Chae 
		 * 2018.04.05
		 */
		this.name = ""; //initialisation of name
		this.price = 0.0; //initialisation of price
		this.stars = 0; //initialisation of stars
	}

	public Chicken(String name, double price, int stars)
	{
		this.name = name; //call constructor
		this.price = price; //call constructor
		this.stars = stars; //call constructor
	}

	public String get_name()
	{
		return this.name; //return name
	}

	public double get_price()
	{
		return this.price; //return price
	}

	public int get_stars()
	{
		return this.stars; //return stars
	}

	public void set_name(String name)
	{
		this.name = name; //call constructor
	}

	public void set_price(double price)
	{
		this.price = price; //call constructor
	}

	public void set_stars(int stars)
	{
		this.stars = stars; //call constructor
	}


	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); //chicken menu 
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5); //chicken menu
		Chicken menu3 = new Chicken("Spicy_mustard", 16000.00, 1); //chicken menu

		menu1.set_stars(3); //input
		menu2.set_stars(4); //input
		menu3.set_stars(1); //input

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); // print out message
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars()); // print out message
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars()); // print out message
	}
	// TODO Auto-generated method stub

}

