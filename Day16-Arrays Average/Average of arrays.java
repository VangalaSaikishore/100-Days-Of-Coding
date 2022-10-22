import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int sum=0; double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements in the array:");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
        for(int i=0;i<5;i++)
        {
            sum=a[i]+sum;
        }
        avg=sum/5.0;
        System.out.println("\n Addition " +sum+ "\n average " +avg);
    }
    
}
