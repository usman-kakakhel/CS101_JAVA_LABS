// Tests lýbrary book
public class TestLibraryBook
{
  
  /**
   * Tests lýbrary book.
   */
  
  public static void main(String[] args) 
  {
    //variables
    LibraryBook book1;
    LibraryBook book2;
    
    //program Code
    
    //two references to a single object
    book1 =  new LibraryBook("Angels and Demons", "Dan Brown");
    book2 = book1;
    if (book1 == book2)
    {
      System.out.println("same objects");
    }
    else
    {
      System.out.println("different objects but might have same parameter values.");
    }
    if (book1.equals(book2))
    {
      System.out.println("might be different objects but same parameter vaues");
    }
    else
    {
      System.out.println("parameter values not same");
    }
    System.out.println();
    //two references to two individual objects with different properties
    book1 =  new LibraryBook("Angels and Demons", "Dan Brown");
    book2 = new LibraryBook("The Kite runner", "Khaled hosseni");
    if (book1 == book2)
    {
      System.out.println("same objects");
    }
    else
    {
      System.out.println("different objects but might have same parameter values.");
    }
    if (book1.equals(book2))
    {
      System.out.println("might be different objects but same parameter vaues");
    }
    else
    {
      System.out.println("parameter values not same");
    }
    
    
    System.out.println();
     //two references to two individual objects with identical relevant properties
    book1 =  new LibraryBook("Angels and Demons", "Khaled hosseni");
    book2 =  new LibraryBook("Angels and Demons", "Khaled hosseni");
    if (book1 == book2)
    {
      System.out.println("same objects");
    }
    else
    {
      System.out.println("different objects but might have same parameter values.");
    }
    if (book1.equals(book2))
    {
      System.out.println("might be different objects but same parameter vaues");
    }
    else
    {
      System.out.println("parameter values not same");
    }
    
    System.out.println();
    //cloning objects and testing whether correctly cloaned
    book1 =  new LibraryBook("Angels and Demons", "Khaled hosseni");
    book2 = new LibraryBook(book1);
   
    System.out.println("Do they have same author: " + book1.hasSameAuthor(book2));
    System.out.println("Do they have same title: " + book1.hasSameTitle(book2));
    
  }
}