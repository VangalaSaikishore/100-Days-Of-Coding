import java.util.Scanner;
public class Palindrome
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string");
  String str=sc.next();
  String org=str;
  String rev="";
  int length=str.length();
  for(int i=length-1;i>=0;i--)
  {
    rev=rev+str.charAt(i);  
  }
  if(org.equals(rev))
  {
   System.out.println("it is an palindrome");
  }
  else
  {
  System.out.println("it is not an palindrome");  
  }
}
}
