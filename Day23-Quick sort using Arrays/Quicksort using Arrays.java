import java.util.Scanner;
public class Quicksort
{
    int partition(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int i=(start-1);
        for(int j=start;j<=end-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int t=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=t;
        return (i+1);
    }
    void Quick1(int arr[],int start,int end)
    {
        if(start<end)
        {
            int p=partition(arr,start,end);
            Quick1(arr,start,p-1);
            Quick1(arr,p+1,end);
        }
    }
        public static void main(String args[])
        {
            int n,i,arr[];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of the Array:");
            n=sc.nextInt();
            arr=new int[n];
            System.out.println("Enter elements in the Array:");
            for(i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Quicksort q=new Quicksort();
            q.Quick1(arr,0,n-1);
            System.out.print("Sorted order:");
            System.out.println();
            for(i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
            sc.close();
        }
    }
    
