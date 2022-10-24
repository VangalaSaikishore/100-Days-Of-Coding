import java.util.Scanner;
public class Binary
{
 public static void main(String args[])
 {
  int arr[],low,mid=0,high,n,element,c=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of the Array:");
  n=sc.nextInt();
  arr=new int[n];
  System.out.println("enter elements in the Array:");
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
  System.out.println("enter which element do you want:");
  element=sc.nextInt();
  low=0;high=n-1;
  while(low<=high)
  {
   mid=(low+high)/2;
   if(element==arr[mid])
   {
    c++;
    break;
   }
   else if(element>arr[mid])
   {
    low=mid+1;
   }
   else if(element<arr[mid])
   {
    high=mid-1;
   }
  }
  if(c>0)
  {
    System.out.println("element found in array at index:"+mid);
  }
  else
  {
    System.out.println("element not found:");
  }
  sc.close();
 }  
}
