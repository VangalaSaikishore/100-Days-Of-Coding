 import java.util.Scanner;
 public class Selection
 {
    public static void main(String args[])
    {
        int arr[],n,i,j,temp,loc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter elements in the Array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Sorted order:");
        System.out.println();
        for(i=0;i<n-1;i++)
        {
            loc=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[loc])
                {
                    loc=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[loc];
            arr[loc]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
 }
