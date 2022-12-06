import java.util.Scanner;
class Student
{
    String Reg_no;
    String sname;
    Student(String Reg_no,String sname)
    {
        this.Reg_no=Reg_no;
        this.sname=sname;
    }
}
class Test extends Student
{
  int m1,m2,m3;
  Test(String Reg_no,String sname,int m1,int m2,int m3)
  {
    super(Reg_no,sname);
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
  }
}
class Result extends Test
{
  double total;
  Result(String Reg_no,String sname,int m1,int m2,int m3)
  {
    super(Reg_no,sname,m1,m2,m3);
  }
  void show()
  {
    total=m1+m2+m3;
    System.out.println("<<<<=====The student details are===''==>>>>");
    System.out.println("<<<<<====Registration Number: "+Reg_no+"====>>>>>");
    System.out.println("<<<<====Name: "+sname+"====>>>>");
    System.out.println("<<<<====Total Marks: "+total+"====>>>>");
  }
}
class MultilevelInheritance 
{
 public static void main(String [] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("<<<<====Enter Student details:====>>>>");
    System.out.println("Student Registration Number ");
    String Reg_no=sc.next();
    System.out.println("<<<====Student Name====>>> ");
    String sname=sc.next();
    System.out.println("<<<====Enter marks of three subjects====>>>");
    System.out.println("<<==Science==>> ");
    int m1=sc.nextInt();
    System.out.println("<<==Maths==>> ");
    int m2=sc.nextInt();
    System.out.println("<<==English==>>");
    int m3=sc.nextInt();
    Result r=new Result(Reg_no,sname,m1,m2,m3);
    r.show();
 }   
}



