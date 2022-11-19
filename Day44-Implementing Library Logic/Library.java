import java.util.*;
import java.util.Scanner;

public class Library {

  String bookName;
  int bookNumber;
  String author;
  String publisher;
  double price;
 int no_of_copy_issued;

 void initil_value() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Book Name: ");
 this.bookName = sc.nextLine();
    System.out.println("Enter Author Name: ");
 this.author = sc.nextLine();
 System.out.println("Enter Book Number: ");
 this.bookNumber = sc.nextInt();
    System.out.println("Enter Book Pulisher:");
 this.publisher = sc.next();
    System.out.println("Enter Book Price: ");
 this.price = sc.nextDouble();
    System.out.println("Enter number of copy issued: ");
 this.no_of_copy_issued = sc.nextInt();
 sc.close();
  }
 void issue_book(int bookNumber, String bookName) {
 if((bookNumber == this.bookNumber) && (bookName.equals(this.bookName))) {
      System.out.println("your book issued successfully!");
      
    } else {
      System.out.println("Book is Not available");
    }
  }
void return_book(int bookNumber, String bookName) {
if ((bookNumber == this.bookNumber) && (bookName.equals(this.bookName))) {
      System.out.println("your book is return successfully!");
    } else {
      System.out.println("BookNumber and BookName is not match");
    }
  }
void book_info() {
  System.out.println("==========================================================");
    System.out.println("bookNumber: " + bookNumber);
    System.out.println("bookName: " + this.bookName);
    System.out.println("book author: " + this.author);
    System.out.println("book publisher: " + this.publisher);
    System.out.println("price: " + this.price);
    System.out.println("no of copy issued: " + this.no_of_copy_issued);
    System.out.println("=========================================================");
  }
public static void main(String[] args) {
    Library b=new Library();
{
  System.out.println("============================================================");
 b.initil_value();
 b.book_info();
 b.issue_book(18,"Webtechnology");
 b.return_book(18,"Webtechnology");
 System.out.println("============================================================");
  } 
}
}
