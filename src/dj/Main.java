package dj;

import localmath.Ops;

public class Main 
{
    public static void main(String[] args) 
	{
                int num = Integer.parseInt(args[0]);	
                Ops m1 = new Ops();
        	System.out.println("Squae of " + args[0] + " is :" + m1.square(num));
    	}
}
