import java.util.*;
public class Pattern3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
	    int n = sc.nextInt();
        int k = 1,sum=0;
        for(int i = 1; i<= n; i++, k = 1) 
        {
            for(int space= 1; space<= n-i; space++) 
            {
                System.out.print("  ");
            }
            while(k<= 2 * i - 1) 
            {
                System.out.print(k+" ");
                sum=sum+k;
                k++;
            }
            System.out.println();
        }
        System.out.print("<<<=============================>>>");
        System.out.println();
        System.out.println("Sum of the numbers: "+sum);
        System.out.println("<<<=============================>>>"); 
    }
}   
