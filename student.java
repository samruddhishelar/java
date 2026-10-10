import java.util.Scanner;
class AttendanceException extends Exception 
{
	public String toString()
	{
        return "Student is Not Eligible for Exam";
    }
}
class Student 
{
    String student_name;
    int student_rollno;
    int total_lectures;
    int attended_lectures;
	void accept()
	{
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter Student Name: ");
	student_name = sc.nextLine();

    System.out.print("Enter Student Roll No: ");
    student_rollno = sc.nextInt();

    System.out.print("Enter Total Lectures: ");
    total_lectures = sc.nextInt();

    System.out.print("Enter Attended Lectures: ");
    attended_lectures = sc.nextInt();
	}
	
    void display()
	{
    System.out.println("Student Name: "+student_name);
    System.out.println("Student Roll No: "+student_rollno);
    System.out.println("Total Lectures: "+total_lectures);
    System.out.println("Attended Lectures: " + attended_lectures);
    }
}
public class student 
{
    public static void main(String[] args) 
	{
		Student s=new Student();
        try 
		{
			s.accept();
            double percentage =
                (s.attended_lectures * 100.0) / s.total_lectures;
            if (percentage < 75) 
			{
                throw new AttendanceException();
            }
            System.out.println("\nStudent Details:");
            s.display();
            System.out.println("Attendance Percentage: " + percentage + "%");
		}
        catch (AttendanceException e) 
		{
            System.out.println("Exception: " + e);
        }
    }
}
