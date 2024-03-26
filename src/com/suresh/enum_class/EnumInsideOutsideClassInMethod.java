package com.suresh.enum_class;

enum Year
{
	A2020,B2021,C2022,D2023,E2024;
	private Year()
	{
		System.out.println(this+" : "+"Invoked...");
	}
}
public class EnumInsideOutsideClassInMethod 
{
    public enum Month
    {
    	JAN,FEB,MAR,APR;
    	private Month()
    	{
    		System.out.println(this+" : "+"Invoked...");
    	}
    }
    public static void main(String[] args)
    {
    	enum Week
    	{
    		SUNDAY,MONDAY,TUESDAY,WEDNESDAY;
    		private Week()
    		{
    			System.out.println(this+" : "+"Invoked...");
    		}
    	}
    	System.out.println(Year.C2022);
    	System.out.println(Month.JAN);
    	System.out.println(Week.SUNDAY);
    }
}
