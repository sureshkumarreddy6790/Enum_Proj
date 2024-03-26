package com.suresh.enum_practise;

enum Season1
{
	WINTER("WINTER SEASON"),SUMMER("SUMMER SEASON"),RAINY();
	String season;
	Season1()
	{
		this.season="RAINY SEASON";
		System.out.println(season);
	}
	Season1(String season)
	{
		this.season=season;
		System.out.println(season);
	}
}

public class ConstructorInEnum
{
    public static void main(String[] args)
    {
		System.out.println(Season1.WINTER);
	}
}
