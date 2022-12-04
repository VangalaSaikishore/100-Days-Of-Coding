import java.util.Scanner;
public class LeftPascalTriangle
{
  public static void main(String[] args)
  {
    //This represents the row with the max stars
    int numberOfRows;
    System.out.println("Enter the number of rows: ");
    //Getting the number of rows from user
    Scanner sc = new Scanner(System.in);
    numberOfRows = sc.nextInt();

    //This is Outer Loop 1: This prints the first half of
    // the pattern
    for (int i= 1; i<=numberOfRows; i++)
    {
      //Prints the spaces before the first star of each row
      for (int j=i; j<numberOfRows; j++)
      {
        System.out.print(" ");
      }
      //Prints the stars for each row
      for (int k=1; k<=i;k++)
      {
        System.out.print("*");
      }
      //To move the cursor to new line after printing row
      System.out.println();
    }
    //Outer Loop 2: Prints second half of the triangle
    for (int i=numberOfRows; i>=1; i--)
    {
      //Prints the whitespaces before the first star of each row
      for(int j=i; j <=numberOfRows;j++)
      {
        System.out.print(" ");
      }
      //Prints stars of each row
      for(int k=1; k<i ;k++)
      {
        System.out.print("*");
      }
      //To move the cursor to new line after printing row
      System.out.println();
    }
  }
} 
