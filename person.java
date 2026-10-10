import java.util.Scanner;

class Person {
    String Personname;
    String Aadharno;
    String Panno;

    Person(String Personname, String Aadharno, String Panno) 
    {
        this.Personname = Personname;
        this.Aadharno = Aadharno;
        this.Panno = Panno;
    }

    void display() 
    {
        System.out.println("Person Name : " + Personname);
        System.out.println("Aadhar No   : " + Aadharno);
        System.out.println("PAN No      : " + Panno);
        System.out.println("---------------------------");
    }
}

public class person {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[5];
        // Accept information for 5 objects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Person " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Aadhar No: ");
            String aadhar = sc.nextLine();

            System.out.print("Enter PAN No: ");
            String pan = sc.nextLine();

            p[i] = new Person(name, aadhar, pan);
            System.out.println();
        }

        // Display information
        System.out.println("\n--- Person Information ---");

        for (int i = 0; i < 5; i++) {
            p[i].display();
        }
        sc.close();
    }
}
