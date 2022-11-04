import java.util.Scanner;
public class Doublylist
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
 Node head=null;
 Node tail=null;
 public void creation()
 {
  int data,n,m;
  Scanner sc=new Scanner(System.in);
  do
  {
  System.out.println("enter the data:");
  data=sc.nextInt();
  Node new_node=new Node(data);
  if(head==null)
  {
    head=new_node;
    tail=new_node;
  }
  else
  {
   System.out.print("Enter 1 to insert at begining==>2 to insert at last==>3 to enter at specified location:");
   m=sc.nextInt();
   switch(m)
   {
    case 1:
    new_node.next=head;
    head.prev=new_node;
    head=new_node;
    break;

    case 2:
    tail.next=new_node;
    new_node.prev=tail;
    tail=new_node;
    break; 

    case 3:
    System.out.println("enter position of node to be inserted:");
    int p=sc.nextInt();
    Node temp1=head;
    Node ptr=temp1.next;
    for(int i=0;i<(p-1);i++)
    {
      temp1=ptr;
      ptr=ptr.next;
    }
    new_node.prev=temp1;
    new_node.next=ptr;
    temp1.next=new_node;
    ptr.prev=new_node;
    break;
  }
  }
  System.out.print("Do you want to Add more data.if yes please press1-");
  n=sc.nextInt();
}
 while(n==1);
}
public void delete()
{
  int data,n,m,p;
  Scanner sc=new Scanner(System.in);
  do
  {
   if(head==null)
   {
    System.out.println("LL is empty:");
   }
   else
   {
    System.out.print("enter 1 delete the item form begining:==>enter 2 delete the item from last:==>enter 3 to delete the item for specific location: ");
    m=sc.nextInt();
    switch(m)
    {
      case 1:
      Node temp=head;
      temp=temp.next;
      head=temp;
      head.prev=null;
      break;

      case 2:
      Node temp1=tail;
      temp1=temp1.prev;
      temp1.next=null;
      tail=temp1;
      break;

     case 3:
     System.out.print("enter position of node to be deleted:");
     p=sc.nextInt();
     Node temp2=head;
     Node ptr1=temp2.next;
     for(int i=1;i<p-1;i++)
     {
      temp2=ptr1;
      ptr1=ptr1.next;
     }
     temp2.next=ptr1.next;
     ptr1.next.prev=temp2;
     break;
    }
    }
    System.out.print("Do you want to Add more data.if yes please press1-");
    n=sc.nextInt();
  }
   while(n==1);
   sc.close();
  } 
public void traversal()
 {
  Node temp=head;
  if(head==null)
  {
    System.out.print("LL does not exit");
  }
  else
  {
    System.out.print("Remaining elements in the Linked list:");
    System.out.println();
    while(temp!=null)
    {
      System.out.print(temp.data +" ");
      temp=temp.next;  
    }
  }
 } 
 public static void main(String args[])
 {
  Doublylist d=new Doublylist();
  d.creation();
  d.delete();
  d.traversal();
 }  
}
