import java.util.Scanner;
class Bin
{
 int binary(int a[],int target)
 {
   int low=0;
   int high=a.length-1;
   int mid;
   while(low<=high)
   {
     mid=(low+high)/2;
     if(a[mid]==target)
     {
       return mid; 
     }
     else if(a[mid]<target)
     {
        low=mid+1;
     }
     else
     {
        high=mid-1;
     }
   }
   return 0; 
 }   
}
public class BinarySearch
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter size of the Array:");
 int n=sc.nextInt();
 int a[]=new int[n+1];
 System.out.println("enter elements in the Array:");
 for(int i=1;i<=n;i++)
 {
  a[i]=sc.nextInt();
 }
 Bin obj=new Bin();
 System.out.println("enter target");
 int target=sc.nextInt();
 System.out.println(obj.binary(a,target));
 sc.close();
}
}
