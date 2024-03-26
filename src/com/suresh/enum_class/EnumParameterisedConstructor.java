package com.suresh.enum_class;

enum Planet
{
	MARS("mars planet")
	{
		public String toString()
		{
			return "I am the MARS";
		}
	},EARTH("Earth planet")
	{
		public String toString()
		{
			return "I am the EARTH";
		}
	},VENUS;
	String msg;
	Planet()
	{
		this.msg="Venus planet";
		System.out.println(this+" constructor invoked...");
	}
	Planet(String msg)
	{
		this.msg=msg;
		System.out.println(this+" constructor invoked...");
	}
}
public class EnumParameterisedConstructor
{
    public static void main(String[] args)
    {
    	Planet[] planets = Planet.values();
    	
    	for(Planet planet : planets)
    	{
    		System.out.println("---> "+planet.toString());
    	}
    }
}
