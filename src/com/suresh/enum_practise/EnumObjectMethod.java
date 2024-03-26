package com.suresh.enum_practise;

enum Planet
{
	EARTH
	{
		public String toString()
		{
			return "EARTH PLANET";
		}
		
	},
	MARS
	{
		public String toString()
		{
			return "MARS PLANET";
		}
	},VENUS
	{
		public String toString()
		{
			return "VENUS PLANET";
		}
	};
	public String toString()
	{
		return "OutSide the Objects...";
	}
	public void m1()
	{
		System.out.println(this);
	}
}

public class EnumObjectMethod
{
	private enum Week
	{
		SUNDAY,MONDAY,WEDNESDAY;
		Week()
		{
			System.out.println("Week Constructor.....");
		}
	}
	public static void main(String[] args)
	{
		System.out.println(Week.SUNDAY);
		Planet.EARTH.m1();
		Planet[] p = Planet.values();
		for(Planet p1:p)
		{
			p1.m1();
		}
	}
}
