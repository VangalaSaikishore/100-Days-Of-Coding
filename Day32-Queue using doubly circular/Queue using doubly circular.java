import java.util.Scanner;
class Queue
{
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node f=null;
    Node r=null;
    public void enqueue()
    {
        System.out.println("Enter data:");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(f==null)
        {
            f=new_node;
            r=new_node;
            new_node.next=f;
            new_node.prev=f;
        }
        else
        {
            new_node.prev=r;
            r.next=new_node;
            r=new_node;
            new_node.next=f;
            f.prev=new_node;
            r=new_node;
        }
    }
    public void dequeue()
    {
        if(f==null)
        {
            System.out.println("underflow:");
        }
        else
        {
            f=f.next;
            f.prev=r;
            r.next=f;
        }
    }
    public void display()
    {
        if(f==null)
        {
            System.out.println("Queue is empty:");
            return;
        }
        Node temp=f;
        System.out.print("Remaining elements in the Queue:");
        System.out.println();
     while(temp!=f.prev)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
    System.out.println(temp.data);
    }  
}  
public class Queuedoublycircularlinked
{
    public static void main(String args[])
    {
        int d;
        Scanner sc=new Scanner(System.in);
        Queue s=new Queue();
        int l;
        do
        {
            System.out.println("Enter 1 to enqueue:");
            System.out.println("Enter 2 to dequeue:");
            System.out.println("Enter 3 to display:");
            System.out.println("Enter your choice:");
            d=sc.nextInt();
            switch(d)
            {
                case 1:
                {
                    s.enqueue();
                    break;
                }
                case 2:
                {
                    s.dequeue();
                    break;
                }
                case 3:
                {
                    s.display();
                    break;
                }
            }
            System.out.println("Enter 0 to go to the main menu:");
            System.out.println("Enter any key to exist");
            l=sc.nextInt();
        }
        while(l==0);
        System.out.println("Exit is succesfully done!!!");
    } 
}

