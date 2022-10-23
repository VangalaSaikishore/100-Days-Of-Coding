import java.util.Scanner;
public class LinearSearching
{
  public static void main(String args[])
  {
  int arr[],i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the length of the array:");
  int length=sc.nextInt();
  arr=new int[length];
  System.out.println("enter the elements" +length+ "in the array:");
  for(i=0;i<arr.length;i++)
  {
  arr[i]=sc.nextInt();  
  }  
  System.out.println("enter the searching element in the array:");
  int k;
  k=sc.nextInt();
  for(i=0;i<arr.length;i++)
  {
   if(arr[i]==k) 
   {
   System.out.println(k+"index found at :"+i); 
   break;
   }
  }
  if(i==length)
  {
   System.out.println("element is not found in the array "); 
   sc.close();
  }
  }
}
 
  
 

