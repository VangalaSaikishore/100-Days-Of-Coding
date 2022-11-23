import java.util.Scanner;
public class Marathon1 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[7];
        int time[]=new int[7];
        for(int i=0;i<7;i++)
        {
            System.out.println("<<<===Enter the name and time of participant "+(i+1)+"===>>>");
            name[i]=sc.next();
            time[i]=sc.nextInt();
        }
        int min1=time[0];
        String name1=name[0];
        for(int i=1;i<7;i++)
        {
            if(time[i]<min1)
            {
                min1=time[i];
                if(i==0)
                {
                    name1=name[0];
                }
                name1=name[i];
            }
        }
        int min2=time[0];
        String name2=name[0];
        for(int i=1;i<7;i++)
        {
            if(time[i]<min2 && time[i]>min1)
            {
                min2=time[i];
                if(i==0)
                {
                    name2=name[0];
                }
                name2=name[i];
            }
        }
        System.out.println("===========================================================================");
        System.out.println("<<<<========The winner is "+name1+" has taken "+min1+" minutes======>>>>");
        System.out.println("<<<<========The Runner is "+name2+" has taken "+min2+" minutes======>>>>");
        System.out.println("===========================================================================");
    }
}
