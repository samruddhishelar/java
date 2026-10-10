import java.util.Scanner;
import java.util.Arrays;

class sum_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	    int n, sum = 0;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum = " + sum);

        Arrays.sort(a);

        System.out.println("Array elements in ascending order:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}