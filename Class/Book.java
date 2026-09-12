import java.util.*;

class Book {
  String bookName;
  double price;
  String publiserName;
  int ISBNNumber;

  Book(String t, String a, double p, int i) {
    bookName = t;
    publiserName = a;
    price = p;
    ISBNNumber = i;
    }

  void display() {
    System.out.println("Title  : " + bookName);
    System.out.println("Publisher : " + publiserName);
    System.out.println("Price  : " + price);
    System.out.println("ISBN : " + ISBNNumber);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String bookName;
    double price;
    String publiserName;
    int ISBNNumber;

    int n;
    System.out.print("Enter number of books: ");
    n = sc.nextInt();
    sc.nextLine();

    Book b[] = new Book[n];
    

    for(int i = 0; i < n; i++){
      System.out.print("Enter book name: ");
      bookName = sc.nextLine();
      System.out.print("Enter publisher name: ");
      publiserName = sc.nextLine();
      System.out.print("Enter price: ");
      price = sc.nextDouble();
      System.out.print("Enter ISBN number: ");
      ISBNNumber = sc.nextInt();
      sc.nextLine();

      b[i] = new Book(bookName, publiserName, price, ISBNNumber);
    }

    for(int i = 0; i < n; i++){
      System.out.println("Book " + (i+1) + " details:");
      b[i].display();
      System.out.println();
    }

  }
}
