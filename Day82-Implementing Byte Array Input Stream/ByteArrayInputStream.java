import java.io.*;
import java.io.ByteArrayInputStream;
public class MainByteArray 
{
  public static void main(String args[]) 
  {

    // Creates an array of bytes
    byte[] array = { 1, 2, 3, 4 };
    try 
    {
      ByteArrayInputStream input = new ByteArrayInputStream(array);

      // Returns the available number of bytes
      System.out.println("<<<==Available bytes at the beginning==>>>: " + input.available());

      // Reads 2 bytes from the input stream
      input.read();
      input.read();

      // Returns the available number of bytes
      System.out.println("<<<===Available bytes at the end===>>>: " + input.available());

      input.close();
    }
    catch (Exception e) 
    {
      e.getStackTrace();
    }
  }
}
