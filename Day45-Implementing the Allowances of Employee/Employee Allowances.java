import java.util.Scanner;

public class Employee
{
    String name;
    double salary;
    double da;
    double hra;
    double pf;
    double grossSal;
    double netSal;
    public Employee(String n, double s) 
    {
        name = n;
        salary = s;
        da = 0;
        hra = 0;
        pf = 0;
        grossSal = 0;
        netSal = 0;
    }
    void calculate() 
    {
        da = salary * 15.0 / 100;
        hra = salary * 10.0 / 100;
        pf = salary * 12.0 / 100;
        grossSal = salary + da + hra;
        netSal = grossSal - pf;
    }

    void display() 
    {

        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Dearness Allowance: " + da);
        System.out.println("House Rent Allowance: " + hra);
        System.out.println("Provident Fund: " + pf);
        System.out.println("Gross Salary: " + grossSal);
        System.out.println("Net Salary: " + netSal);
    }

  public static void main(String args[]) 
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Employee Name: ");
    String empName = in.nextLine();
    System.out.print("Enter Salary: ");
    double empSal = in.nextDouble();
    
    Employee obj = new Employee(empName, empSal);
    obj.calculate();
    obj.display();
    
    in.close();
}
}
