import java.util.*;
public class Student
 {
  String Registration_Number;
  String Sname;
  float mathsf;
  float engf;
  float sciencef;
  float total;

void input()
{
  Scanner sc = new Scanner(System.in);

  System.out.println("<<<<<====Enter your registration_no====>>>>>");
 Registration_Number = sc.next();
  System.out.println("<<<<====Enter your name====>>>>");
 Sname = sc.next();
 System.out.println("<<<<====Enter Maths, Eng, Science marks====>>>>");
 mathsf = sc.nextFloat();
 engf = sc.nextFloat();
 sciencef = sc.nextFloat();

 sc.close();

}

 void total()
 {
 double total = mathsf + engf + sciencef;

 System.out.println("<<<<===Your total marks===>>>>:"+ total);
}
 public static void main(String[] args) 
 {
  Student s = new Student();
  s.input();
  s.total();
  }
}


