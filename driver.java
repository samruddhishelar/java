
import java.util.Scanner;
class AgeException extends Exception 
{
    public String toString()
	{
        return "Age is below 18 years";
    }
}
class Driver 
{
    String license_no;
    String name;
    String address;
    int age;
    Driver(String license_no, String name, String address, int age) 
	{
        this.license_no = license_no;
        this.name = name;
        this.address = address;
        this.age = age;
    }
	void display()
	{
	System.out.println("License number="+license_no);
	System.out.println("Driver Name="+name);
	System.out.println("Driver Address="+address);
	System.out.println("Driver Age="+age);
    }
}
class driver
	{
    public static void main(String[] args) 
		{
        try 
		{
        Driver d = new Driver("MH12AB1234", "Ramesh", 
                                  "Baramati", 15);
		if (d.age < 18) 
		{
			throw new AgeException();
		}
		d.display();
        }
        catch (AgeException e) {
            System.out.println("Exception: " + e);
        }
		}
	}