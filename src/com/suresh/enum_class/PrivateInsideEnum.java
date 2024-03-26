package com.suresh.enum_class;
class Test
{
	int a = 10;
}
abstract class Hello extends Test
{
	
}
enum Season //extends Test
{
	WINTER,SUMMER;
}
public class PrivateInsideEnum 
{
	
    private enum Color
    {
    	RED,GREEN;
    }
    public static void main(String[] args)
    {
    	System.out.println(Color.RED);
    	System.out.println(Color.GREEN);
    }
}
