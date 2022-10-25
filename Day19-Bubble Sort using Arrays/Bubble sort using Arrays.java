import java.util.Scanner;
public class Bubblesort
{
    public static void main(String args[])
    {
        int n,i,k,arr[],temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter elements in the Array :");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(k=0;k<n-i-1;k++)
            {
                if(arr[k]>arr[k+1])
                {
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }       
         System.out.print("elements of sorted order:");
         System.out.println();
         for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            sc.close();
        }
    } 
}
