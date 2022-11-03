import java.util.Scanner;
class Stack
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    Node temp=null;
    void push()
    {
        System.out.println("enter data:");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(top==null)
        {
            top=new_node;
            temp=top;
        }
        else
        {
            new_node.next=top;
            top=new_node;
            temp.next=top;
        }   
    }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty:");
        }
        else
        {
            top=top.next;
            temp.next=top;
            return;
        }
    }
    void display()
    {
        Node temp=top;
        if(top==null)
        {
            System.out.println("Stack is empty:");
            return;
        }
        System.out.print("Remaining elements in the stack:");
        System.out.println();
        do
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        while(temp!=top && top.next!=null);
        return;
    }   
}
public class Stackcircularlist
    {
        public static void main(String args[])
        {
            int d;
            Scanner sc=new Scanner(System.in);
            Stack s=new Stack();
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
 
 
