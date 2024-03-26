package com.suresh.enum_class;

public class SwitchEnum 
{
	enum Week
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY;
	}
    public static void main(String[] args)
    {
    	
    	String str = "hello";
    	switch(str)
    	{
    	   case "hello":
    		   System.out.println("hello");
    		   break;
    	   case "HELLO":
    		   System.out.println("HELLO");
    		   break;
    	   default:
    		   System.out.println("Default");
    	}
    	Week w = Week.WEDNESDAY;
    	switch(w)
    	{
    	case SUNDAY:
    		System.out.println("Sunday");
    		break;
    	case MONDAY:
    		System.out.println("MONDAY");
    		break;
    	case TUESDAY:
    		System.out.println("TUESDAY");
    		break;
    	case WEDNESDAY:
    		System.out.println("WEDNESDAY");
    		break;
    	default:
    			System.out.println("Default");
    	}
    }
}
