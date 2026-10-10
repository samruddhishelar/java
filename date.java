import java.util.Scanner;
class InvalidDateException extends Exception 
{
      public String toString()
	{
        return "Invalid Date";
    }
}
class MyDate 
{
    int day;
    int month;
    int year;
    void accept() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day: ");
        day = sc.nextInt();
        System.out.print("Enter Month: ");
        month = sc.nextInt();
        System.out.print("Enter Year: ");
        year = sc.nextInt();
    }
    void display() 
	{
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
    void checkDate()throws InvalidDateException
	{
        if (month < 1 || month > 12) 
		{
            throw new InvalidDateException();
        }
        if (day < 1 || day > 31) 
		{
            throw new InvalidDateException();
        }
        if ((month == 4 || month == 6 ||
             month == 9 || month == 11) && day > 30) 
		{
            throw new InvalidDateException();
		}
        if (month == 2) 
		{
            if (day > 29) 
			{
                throw new InvalidDateException();
            }
            if (day == 29 &&
                (year % 400 != 0 &&
                 year % 100 == 0 ||
                 year % 4 != 0)) 
			{
                throw new InvalidDateException();
            }
        }
	}
}
public class date 
	{
    public static void main(String[] args) 
	{
    MyDate d = new MyDate();
	d.accept();
		try 
		{
            d.checkDate();
            d.display();
        }
        catch (InvalidDateException e) 
		{
            System.out.println("Exception: " + e);
        }
    }
}