import java.util.Scanner;
public class Insertion1
{
    public static void main(String args[])
    {
        int n,i,j,arr[],temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter elements in the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Sorted order:");
        System.out.println();
        for(i=1;i<=n-1;i++)
        {
            temp=arr[i];
            j=i-1;
            while(temp<arr[j] && j>-1)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
        
        arr[j+1]=temp;
        }
     for(i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
}
}
