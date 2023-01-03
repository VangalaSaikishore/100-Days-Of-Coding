import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ByteStreams
{
    void fileOperations1() throws Exception
    {
        System.out.println("Implementing the byte streams:");
        FileInputStream fis=new FileInputStream("C:/javaprograms/JAVA/file1.txt");
        System.out.println("Connection created:");
        int x;
        while((x=fis.read())!=-1)
        {
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println("Data retreived:");
        fis.close();
    }
    void fileOperations2() throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:/javaprograms/JAVA/file2.txt");
        System.out.println("Connection created:");
        String data="Today is tuesday";
        byte arr[]=data.getBytes();
        fos.write(arr);
        System.out.println("data written");
        fos.close();
    }
    void fileOperations3() throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/munna/OneDrive/Pictures/pic1.jpg");
        FileOutputStream fos=new FileOutputStream("C:/Users/munna/OneDrive/Pictures/pic3.jpg");
        System.out.println("Connection created:");
        int x;
        while((x=fis.read())!=-1)
        {
            fos.write(x);
        }
        System.out.println("data copied");
        fis.close();
        fos.close();
    }

    public static void main(String args[]) throws Exception 
    {
        ByteStreams s=new ByteStreams();
        s.fileOperations1();
       // s.fileOperations2();
       // s.fileOperations3();
    }
}

