package com.suresh.enum_practise;

class A
{
	
}
interface Moveable
{
	void m1();
}

enum Season implements Moveable //extends A
{
	WINTER,SPRING,SUMMER;
	
	public void m1()
	{
		System.out.println("Season method m1");
	}
}

public class implementingEnumClasses 
{
    public static void main(String[] args)
    {
    	Season s = Season.WINTER;
    	s.m1();
    	Season.SPRING.m1();
    	System.out.println(s.hashCode());
    	
    }
}
