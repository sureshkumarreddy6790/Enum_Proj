package com.suresh.enum_class;
enum Color
{
	RED,GREEN,YELLOW,LANVENDAR;
	
	public void m1()
	{
		
	}
}
public class ComparingEnumConsts 
{
    public static void main(String[] args)
    {
    	Color c1 = Color.RED;
    	Color c2 = Color.RED;
    	if(c1==c2)
    	{
    		System.out.println("c1==c2 are equal...");
    	}
    	//c2 = Color.GREEN;
    	if(c1.equals(c2))
    	{
    		System.out.println("c1.equals(c2) are equals...");
    	}
    	else
    	{
    		System.out.println("c1.equals(c2) are not equals...");
    	}
    }
}
