import java.util.*;  
public class LinkedList1
{  
 public static void main(String args[])
{  
  
  LinkedList<String> ll=new LinkedList<String>();  
  ll.add("Ravi");  
  ll.add("vijay");  
  ll.add("Ravi");  
  ll.add("Ajay"); 
  ll.add("pavan");
  ll.add("Aditya");
  ll.add("Krishna");
  
  Iterator<String> itr=ll.iterator();  
  while(itr.hasNext())
  {  
     System.out.println(itr.next());  
  }

  System.out.println("<<==Removing vijay from LL==>>");
  ll.remove("vijay");  
  System.out.println("<<==After removing the vijay==>>"
                      +ll);
 }  
}  
