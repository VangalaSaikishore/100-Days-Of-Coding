import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
public class CharacterStreams
{
    void fileOperations1() throws Exception
    {
        System.out.println("Implementing the Character streams:");
        FileReader fr=new FileReader("C:/javaprograms/JAVA/file1.txt");
        System.out.println("Connection created:");
        int x;
        while((x=fr.read())!=-1)
        {
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println("Data retreived:");
        fr.close();
    }
    void fileOperations2() throws Exception
    {
        FileWriter fw=new FileWriter("C:/javaprograms/JAVA/file4.txt",true);
        System.out.println("Connection created:");
        String data="tomorrow is wednesday.";
        fw.write(data);
        System.out.println("data written");
        fw.close();
    }
    void fileOperations3() throws Exception
    {
        FileReader fr=new FileReader("C:/Users/munna/OneDrive/Pictures/pic1.jpg");
        FileWriter fw=new FileWriter("C:/Users/munna/OneDrive/Pictures/pic3.jpg");
        System.out.println("Connection created:");
        int x;
        while((x=fr.read())!=-1)
        {
            fw.write(x);
        }
        System.out.println("data copied");
        fr.close();
        fw.close();
    }

    public static void main(String args[]) throws Exception 
    {
        CharacterStreams s=new CharacterStreams();
        s.fileOperations1();
        s.fileOperations2();
       // s.fileOperations3();
    }
}

