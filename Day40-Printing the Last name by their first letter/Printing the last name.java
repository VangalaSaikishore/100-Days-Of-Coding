import java.util.Scanner;
public class Name {
   public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string ");
    String str=sc.nextLine();
    String strArr []=str.split(" ");
    int n=strArr.length;
    String name="";
    for(int i=0;i<n;i++)
    {
        if(i<n-1)
        {
         char ch=strArr[i].charAt(0);
         if(i==0)
         {
         name=name+ch;
         }
         else{
            name=name+" "+ch;
         }
        }
    else{
            name=name+" "+strArr[i];
        }
    }
        System.out.println(name);
        sc.close();
   } 
   
}
