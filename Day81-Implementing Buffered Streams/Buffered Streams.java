import java.util.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class BufferedStreams
{
    void fileOperations1() throws Exception
    {
        System.out.println("==============================================================");
        System.out.println("Implementing the Buffered streams:");
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("C:/javaprograms/JAVA/file1.txt"));
        System.out.println("Connection created:");
        int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println("Data retreived:");
        bis.close();
       System.out.println("==============================================================");

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:/javaprograms/JAVA/file4.txt"));
        BufferedReader br=new BufferedReader(new FileReader("C:/javaprograms/JAVA/file4.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:/javaprograms/JAVA/file4.txt"));
        bos.close();
        br.close();
        bw.close();
    }

    public static void main(String args[]) throws Exception 
    {
        BufferedStreams bs=new BufferedStreams();
       bs.fileOperations1(); 
    }
}

