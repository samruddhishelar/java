import java.io.*;
class reverse_file
{
    public static void main(String args[]) throws Exception
    {
        String fname = "data.txt";
        FileReader fr = new FileReader(fname);
        String text = "";
        int ch;
        while((ch = fr.read()) != -1)
        {
            text = text + (char)ch;
        }
        fr.close();
        System.out.println("File contents in reverse order with changed case:");
        for(int i = text.length() - 1; i >= 0; i--)
        {
            char c = text.charAt(i);
            if(Character.isUpperCase(c))
                System.out.print(Character.toLowerCase(c));
            else if(Character.isLowerCase(c))
                System.out.print(Character.toUpperCase(c));
            else
                System.out.print(c);
        }
    }
}
