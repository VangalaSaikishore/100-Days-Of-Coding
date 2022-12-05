import java.util.Scanner;
class Shape 
{
    int length;
    int breadth;
}
class Rectangle extends Shape
{
    int area;
    public void calculateArea()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("<<<====Enter Length====>>> ");
        this.length=sc.nextInt();
        System.out.println("<<<===Enter Breadth ");
        this.breadth=sc.nextInt();
        area = length*breadth;
    }
}
class SingleInheritance
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        //Calculate the area
        r.calculateArea();
        System.out.println("<<<====The Area of rectangle of length \""
                +r.length+"\" and breadth \""+r.breadth+"\" is \""+r.area+"\"====>>>");
    }
}
