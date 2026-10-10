import java.util.Scanner;

class Employee
{
    int id;
    String name;
    double salary;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    void display()
    {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}
class MaxEmployee
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee e[] = new Employee[n];
        for(int i = 0; i < n; i++)
        {
            e[i] = new Employee();
            System.out.println("\nEnter details of Employee " + (i + 1));
            e[i].accept();
        }
        int max = 0;
        for(int i = 1; i < n; i++)
        {
            if(e[i].salary > e[max].salary)
            {
                max = i;
            }
        }
        System.out.println("\nEmployee having maximum salary:");
        e[max].display();
    }
}