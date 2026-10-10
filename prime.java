import java.util.Scanner;
class NumberException extends Exception 
{
    public String toString()
	{
        return "Number is 0";
    }
}
class PrimeDemo 
{
    static void checkPrime(int n) 
	{
    int count = 0;
    for (int i = 1; i <= n; i++) 
		{
        if (n % i == 0) 
		{
        count++;
        }
        }
    if (count == 2)
        System.out.println(n + " is a Prime Number");
    else
        System.out.println(n + " is Not a Prime Number");
	}
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try 
		{
            if (n == 0) 
			{
                throw new NumberException();
            }
			checkPrime(n);
        }
        catch (NumberException e) 
		{
            System.out.println("Exception: " + e);
        }
    }
}