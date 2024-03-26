package com.suresh.enum_class;

enum Season1
{
	WINTER,SUMMER,SPRING;
	Season1()
	{
		System.out.println(this+" : "+"is invoked");
	}
}
public class ConstructorInvoked 
{
    public static void main(String[] args)
    {
    	System.out.println(Season1.WINTER);
    	System.out.println(Season1.SUMMER);
    }
}
