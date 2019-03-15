//creates book
public class LibraryBook
{
  // properties
  private String title;
  private String author;
  private String dueDate;
  private int timesLoaned;
  private boolean loan;
  
  // constructors
  public LibraryBook(String bookName, String authorName ) 
  {
    title = bookName;
    author = authorName;
    dueDate = "";
    timesLoaned = 0;
  }
  
  // methods
  
  /**
   * Outputs all ýnformatýon of book.
   */
  public String toString() 
  {
    //variables
    String output;
    
    //program code
    output = ("The Title is : " + title + "\n The author is : " + author + "\n The due date is : " + dueDate + "\n The number of time loaned is : " + timesLoaned);
    return output;
  }
  
  /**
   * checks whether the book ýs loaned or not
   */
  public boolean onLoan() 
  {
    return loan;
  }
  
  /**
   * returns the number of týmes book ýs loaned
   */
  public int getTimesLoaned() 
  {
    return timesLoaned;
    loan = true;
  }
  
  /**
   * loans the book.
   * @param dueDateNew new date 
   */
  public void loanBook(String dueDateNew) 
  {
    dueDate = dueDateNew;
    timesLoaned++;
    loan = false;
  }
  
  /**
   * returns the book.
   */
  public void returnBook() 
  {
    dueDate = "";
  }
  
}
