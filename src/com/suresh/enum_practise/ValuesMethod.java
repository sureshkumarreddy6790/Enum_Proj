package com.suresh.enum_practise;

public class ValuesMethod 
{
    enum Month
    {
    	JAN,FEB,MAR,JUNE;
    }
    public static void main(String[] args)
    {
    	Month[] m = Month.values();
    	for(Month mon: m)
    	{
    		System.out.println(mon);
    	}
    }
}
