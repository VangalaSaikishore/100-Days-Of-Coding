import java.util.Scanner;
public class Search
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in the Array");
        for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]+" ");
        }
        System.out.println("Enter search elements:");
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
              count++;
            }
        }
        if(count>0)
        {
          System.out.println("Element found " +count+  "times");
        }
        else
        {
          System.out.println("Element not found:");
        }
        sc.close();
    }
    
}      
