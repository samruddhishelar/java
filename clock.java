import java.util.Scanner;

class clock
{
    int hours;
    int minutes;
    int seconds;

    
    clock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    
    boolean isValid()
    {
        if (hours >= 0 && hours <= 23 &&
            minutes >= 0 && minutes <= 59 &&
            seconds >= 0 && seconds <= 59)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    
    void displayAMPM()
    {
        int displayHour;
        String period;

        if (hours == 0)
        {
            displayHour = 12;
            period = "AM";
        }
        else if (hours == 12)
        {
            displayHour = 12;
            period = "PM";
        }
        else if (hours > 12)
        {
            displayHour = hours - 12;
            period = "PM";
        }
        else
        {
            displayHour = hours;
            period = "AM";
        }

        System.out.println("Time in AM/PM format: " +
                displayHour + ":" + minutes + ":" + seconds + " " + period);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        
        clock c = new clock(h, m, s);

        
        if (c.isValid())
        {
            System.out.println("Valid Time");
            c.displayAMPM();
        }
        else
        {
            System.out.println("Invalid Time");
        }

        sc.close();
    }
}