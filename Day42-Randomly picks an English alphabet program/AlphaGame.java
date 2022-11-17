import java.util.*;
public class AlphaGame {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        char ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
        [rand.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray().length)];
        int flag=0;
        int count=0;
        while(flag!=1)
        {
            System.out.println("==================================================");
            System.out.println("Enter a letter in Upper Case from A-Z");
            char input=sc.next().charAt(0);
        if(ch==input)
        {
            System.out.println("<====================================================>");
            System.out.println("You have guessed the character "+(count+1)+" time");
            flag=1;
            System.out.print("<====================================================>");
            System.out.println();
        }
        else{
            count++;
            flag=0;
        }
        }
        sc.close();
    }
}
