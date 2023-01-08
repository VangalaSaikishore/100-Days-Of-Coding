import java.io.ByteArrayOutputStream;

class MainOutputStream 
{
  public static void main(String[] args) 
  {
   System.out.println("Implementing Byte Array Output Stream");
    String data = "This is a line of text inside the string.";

    try
    {
      // Creates an output stream
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      byte[] array = data.getBytes();

      // Writes data to the output stream
      out.write(array);

      // Retrieves data from the output stream in string format
      String streamData = out.toString();
      System.out.println("Output stream: " + streamData);

      out.close();
    }

    catch(Exception e) 
    {
      e.getStackTrace();
    }
  }
}
