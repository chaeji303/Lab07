package edu.handong.csee.java.prob01;

import java.util.Scanner;

/**
 * This class defines way to change from year to century.
 * When user input year, this program tells century that the year belongs to.
 * I love a java programming class!!!
 * I want to be a good java programmer!
 * 
 * @author Jihye Chae
 * 2018.04.05
 */

public class YearToCentury {
	int year; // define variable
	
	public YearToCentury() //initialize via a constructor
	{
		year = 0; // initialize year
	}
	
	public YearToCentury(int year)
	{
		this.year = year;
	}
	
	public int yr_to_century()
	{
		if (year % 100 == 0)
		{
			year = (year / 100) - 1;
		}
		else
		{
			year = (year / 100);
		}
		return year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input year: ");
		yr = keyboard.nextInt();
		
		YearToCentury year = new YearToCentury(yr);
		System.out.println(yr + " is " + year.yr_to_century() + "th century.");
		

	}

}
