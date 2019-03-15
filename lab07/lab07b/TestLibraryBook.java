// testýng of creatýng book
public class TestLibraryBook
{
  // properties
  LibraryBook book1;
  LibraryBook book2;   
  
  // constructors
  // methods
  
  /**
   * creates the book
   */
  public void books() 
  {
    //variables
    
    
    //program code
    
    book1 = new LibraryBook("kite runer", "khaled hossseni");
    book2 = new LibraryBook("angels and demons", "Dan brown");
    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book1.onLoan());
    
    book1.loanBook("4-12-17");
    book2.loanBook("5-12-17");
    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book1.onLoan());
    
    book1.returnBook();
    book2.returnBook();
    System.out.println(book1);
    System.out.println(book2);
    
    System.out.println(book1.onLoan());
    
  }
  
  
  
}