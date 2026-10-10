import java.util.Scanner;

class armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int start, end;
        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for(int n = start; n <= end; n++)
        {
            int num = n;
            int temp = n;
            int count = 0;
            int sum = 0;

            // Count number of digits
            while(temp > 0)
            {
                count++;
                temp = temp / 10;
            }

            // Calculate Armstrong sum
            while(num > 0)
            {
                int digit = num % 10;
                sum = sum + (int)Math.pow(digit, count);
                num = num / 10;
            }

            // Check Armstrong number
            if(sum == n)
            {
                System.out.print(n + " ");
            }
        }
    }
}
