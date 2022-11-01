import java.util.Scanner;
 class stack
 {
    int top=-1;
    int n=10;
    int a[]=new int[n];
    void push()
    {
        Scanner sc=new Scanner(System.in);
        if(top==(n-1))
        {
            System.out.println("Overflow:");
        }
        else
        {
            System.out.println("enter the data:");
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("Item inserted:");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow:");
        }
        else
        {
          top=top-1;  
          System.out.println("item deleted:");
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty:");
        }
        else
        {
        System.out.println("items are");
        for(int j=top;j>=0;j--)
        {
        System.out.println(a[j]);
        }
       }
    }
}
    public class Stackarray
    {
        public static void main(String args[])
        {
            int d;
            Scanner sc=new Scanner(System.in);
            stack s=new stack();
            int l;
            do
            {
                System.out.println("press1 to push:");
                System.out.println("press2 to pop:");
                System.out.println("press3 to display:");
                System.out.println("enter your choice:");
                d=sc.nextInt();
                switch(d)
                {
                    case 1:
                    {
                        s.push();
                        break;
                    }
                    case 2:
                    {
                        s.pop();
                        break;
                    }
                    case 3:
                    {
                        s.display();
                        break;
                    }
                }
               System.out.println("Enter 0 to go back to main menu:");
               System.out.println("enter any key to exit:");
               l=sc.nextInt(); 
            }
            while(l==0);
            System.out.println("exit succesfully");
        }
    }
