import java.util.Scanner;
 public class Merge
{
    void merge1(int arr[],int start,int mid,int end)
    {
        int l=mid-start+1;
        int r=end-mid;
        int left_subarray[]=new int[l];
        int right_subarray[]=new int[r];
        for(int i=0;i<l;i++)
        {
            left_subarray[i]=arr[start+i];
        }
        for(int j=0;j<r;j++)
        {
            right_subarray[j]=arr[mid+1 +j];
        }
        int i=0,j=0,k=start;
        while(i<l && j<r)
        {
            if(left_subarray[i]<=right_subarray[j])
            {
                arr[k]=left_subarray[i];
                i++;
            }
            else
            {
                arr[k]=right_subarray[j];
                j++;
            }
            k++;
        }
        while(i<l)
        {
            arr[k]=left_subarray[i];
            i++;
            k++;
        }
        while(j<r)
        {
            arr[k]=right_subarray[j];
            j++;
            k++;
        }
    }
    
     void Mergesort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            Mergesort(arr, start, mid);
            Mergesort(arr, mid+1, end);
            merge1(arr, start, mid, end);
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
            Merge1 m=new Merge1();
            m.Mergesort(arr, 0,n-1);
            System.out.print("Sorted order:");
            System.out.println();
            for(i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
            sc.close();
        }
    }
