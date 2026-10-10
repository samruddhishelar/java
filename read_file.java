import java.io.*;
class read_file
{
	public static void main(String args[]) throws Exception
    {
        FileReader fr = new FileReader("data.txt");
        int ch;
        System.out.println("File contents in uppercase:");
        while((ch = fr.read()) != -1)
        {
            System.out.print(Character.toUpperCase((char)ch));
        }
        fr.close();
    }
}
