import java.util.*;

class Vehicle
{
    String company;
    double price;

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter company:");
        company = sc.nextLine();

        System.out.println("Enter price:");
        price = sc.nextDouble();
    }

    void display()
    {
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle
{
    double mileage;

    void accept()
    {
        super.accept();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mileage:");
        mileage = sc.nextDouble();
    }

    void display()
    {
        super.display();
        System.out.println("Enter Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle
{
    double capacity_in_tons;

    void accept()
    {
        super.accept();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter capacity in tons:");
        capacity_in_tons = sc.nextDouble();
    }

    void display()
    {
        super.display();
        System.out.println("Capacity: " + capacity_in_tons);
    }
}

public class vehicle_demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vehicles:");
        int n = sc.nextInt();

        LightMotorVehicle[] light = new LightMotorVehicle[n];
        HeavyMotorVehicle[] heavy = new HeavyMotorVehicle[n];

        int l = 0, h = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter type of vehicle (1-Light, 2-Heavy):");
            int type = sc.nextInt();

            if (type == 1)
            {
                light[l] = new LightMotorVehicle();
                light[l].accept();
                l++;
            }
            else if (type == 2)
            {
                heavy[h] = new HeavyMotorVehicle();
                heavy[h].accept();
                h++;
            }
        }

        System.out.println("\n--- Light Motor Vehicles ---");
        for (int i = 0; i < l; i++)
        {
            light[i].display();
        }

        System.out.println("\n--- Heavy Motor Vehicles ---");
        for (int i = 0; i < h; i++)
        {
            heavy[i].display();
        }
    }
}