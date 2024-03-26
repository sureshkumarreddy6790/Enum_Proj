package com.suresh.enum_practise;

public class InnerEnumClass
{
    static enum Color
    {
    	RED,YELLOW,GREEN;
    }
    public static void main(String[] args)
    {
    	System.out.println(Color.RED);
    }
}

final class sum extends InnerEnumClass
{
	
}
