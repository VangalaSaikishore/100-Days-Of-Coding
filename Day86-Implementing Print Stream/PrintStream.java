import java.io.PrintStream;

class Main 
{
    public static void main(String[] args) 
    {
      System.out.println("Implementing Print Streams");
      
        try {
            PrintStream output = new PrintStream("output.txt");

            int age = 25;

            output.printf("I am %d years old.", age);
            output.close();
        }
        catch(Exception e) 
        {
            e.getStackTrace();
        }
    }
}
