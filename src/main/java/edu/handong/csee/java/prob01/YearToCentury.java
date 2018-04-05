package edu.handong.csee.java.prob01;

import java.util.Scanner;

public class YearToCentury {
	/**
	 * This class defines way to change from year to century. 
	 * When user input year, this program tells century that the year belongs to. 
	 * I love a java programming class!!! I want to be a good java programmer!
	 * 
	 * @author Jihye Chae 2018.04.05
	 */
	int year; // define variable

	public YearToCentury() // initialize via a constructor
	{
		year = 0; // initialize year
		/**
		 * This method defines a constructor.
		 * It is initialize via a constructor.
		 * 
		 * @author Jihye Chae 2018.04.05
		 */
	}

	public YearToCentury(int year) {
		this.year = year; // convert
		/**
		 * This method is for converting.
		 * 
		 * @author Jihye Chae 2018.04.05
		 */
	}

	public int yr_to_century() // year to century
	{
		if (year % 100 == 0) // e.g 1900, 2000
		{
			year = (year / 100) + 1; // e.g 1900 -> 19 +1
		} else {
			year = (year / 100); // e.g 1994, 2018 -> 20th, 21st
		}
		return year; // return year
	}

	public static void main(String[] args) { // main
		// TODO Auto-generated method stub
		int yr = 0; // initialize yr
		Scanner keyboard = new Scanner(System.in); // scanner

		System.out.println("Input year: "); // print out message
		yr = keyboard.nextInt(); // input

		YearToCentury year = new YearToCentury(yr); // change year
		System.out.println(yr + " is " + year.yr_to_century() + "th century."); // result message

	}

}
