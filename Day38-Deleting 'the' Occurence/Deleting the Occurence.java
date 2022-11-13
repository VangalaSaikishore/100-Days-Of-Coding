import java.util.Scanner;
public class DelOccurence 
{
   public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string ");
    String s=sc.nextLine();
    String strArr[]=s.split(" ");
    for(int i=0;i<strArr.length;i++)
    {
        if(strArr[i].equals("the"))
        {
           strArr[i]="";  
        }
    }
    for(String i:strArr)
    {
        System.out.print(i+" ");
    }
    sc.close();
   } 
}
