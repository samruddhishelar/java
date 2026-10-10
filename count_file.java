import java.io.*;
import java.util.*;
class FileCount
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sc.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(fname));
        int lines = 0;
        int words = 0;
        int characters = 0;
        String str;
        while((str = br.readLine()) != null)
        {
            lines++;
            characters = characters + str.length();
            StringTokenizer st = new StringTokenizer(str);
            words = words + st.countTokens();
        }

        br.close();

        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Characters = " + characters);
    }
}