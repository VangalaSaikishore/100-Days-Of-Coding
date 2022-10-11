import java.util.Scanner;
public class Arraydimenstional
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("Enter number of rows:");
        n=sc.nextInt();
        System.out.println("Enter number of columns:");
        m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter elements in the array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
