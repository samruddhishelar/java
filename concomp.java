package StringOperation;
public class Con
{
	public void stringCon(String s1,String s2)
	{
	System.out.println("Concatinated String is = "+(s1+s2));
	}
}


package StringOperation;
public class Comp
{
	public void stringComp(String s1,String s2)
	{
	if(s1.equals(s2))
		System.out.println("String "+s1+" and"+s2+" are equals");
	else
		System.out.println("String "+s1+" and "+s2+" are not equals");
	}
}

import StringOperation.*;
class StrPackDemo
{
	public static void main(String args[])
	{
	Con c=new Con();
	c.stringCon("Hello","Friends");
	Comp c1=new Comp();
	c1.stringComp("Hello","Hello1");
	}
}