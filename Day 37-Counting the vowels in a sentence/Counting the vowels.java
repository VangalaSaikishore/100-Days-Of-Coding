import java.util.Scanner;
public class Vowels1 
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a line ");
      String str=sc.nextLine();
      int count=0;
      char ch;
      for(int i=0;i<str.length();i++)
      {
        ch=str.charAt(i);
        if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
        {
            count++;
        }
      }
      System.out.println("The number of vowels present in the line are "+count);
    }
}

