import java.util.Scanner;
public class Arrayinsert
{
 public static void main(String args[])
 {
  int n,m,p;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of elements in the Array:");  
  n=sc.nextInt();
  int a[]=new int[n];  
  int b[]=new int[n+1];
  System.out.println("enter elements in the Array:");
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
  System.out.println("enter index value that to insert the element:");
  m=sc.nextInt();
  System.out.println("enter new value to insert:");
  p=sc.nextInt();
  for(int i=0;i<n+1;i++)
  {
    if(i<m)
    {
       b[i]=a[i]; 
    }
    else if(i==m)
    {
        b[i]=p;
    }
    else
    {
        b[i]=a[i-1];
    }
  }
  System.out.println("elements are: ");
  for(int i=0;i<n+1;i++)
  {
    System.out.println(b[i]);
  }
 }   
}
