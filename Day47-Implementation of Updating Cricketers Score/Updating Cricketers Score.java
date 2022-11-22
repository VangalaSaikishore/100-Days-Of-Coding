import java.util.*;
public class Cricket
{
  String FirstName;
  String LastName;
  int RunsMade;
  int No_of_fours;
  int No_of_sixes;
  Scanner sc = new Scanner(System.in);

   void initial_value()
   {
      System.out.println("Enter First_Name ");
      this.FirstName = sc.next();
      System.out.println("Enter Last_Name ");
      this.LastName = sc.next();
      System.out.println("Enter Run_Made ");
      this.RunsMade = sc.nextInt();
      System.out.println("Enter No_of_fours ");
      this.No_of_fours = sc.nextInt();
      System.out.println("Enter No_of_sixes ");
      this.No_of_sixes = sc.nextInt();
   }
    void updated_run()
   {
       System.out.println("Enter the update run ");
      this.RunsMade = sc.nextInt();
      System.out.println("your run update "+ this.RunsMade);
   }

    void info()
   {
      System.out.print("<<<<======================================>>>>");
      System.out.println();
      System.out.println("===>Name : "+ this.FirstName + this.LastName);
      System.out.println("===>No_of_fours: " + this.No_of_fours);
      System.out.println("===>No of sixes: " +this.No_of_sixes);
      System.out.println("===>Total Run made "+ this.RunsMade);
      System.out.print("<<<<======================================>>>>");
    }

 public static void main(String[] args) 
{
 Cricket c=new Cricket();
 c.initial_value();
 c.updated_run();
 c.info();
}
}
