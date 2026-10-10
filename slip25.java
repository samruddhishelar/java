interface Calculator 
{
    void add(int a, int b);
    void subtract(int a, int b);
}
class SimpleCalc implements Calculator 
	{
    public void add(int a, int b) 
	{
        System.out.println("Addition = " + (a + b));
    }
    public void subtract(int a, int b) 
	{
        System.out.println("Subtraction = " + (a - b));
    }
}

class CalculatorDemo 
	{
    public static void main(String[] args) 
	{
    SimpleCalc s = new SimpleCalc();
    s.add(20, 10);
    s.subtract(20, 10);
    }
}