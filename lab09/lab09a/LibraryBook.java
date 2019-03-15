// creates book
public class LibraryBook
{
  // properties
  private String title;
  private String author;
  private String dueDate;
  private int timesLoaned;
  private boolean loan;
  
  // constructors
  //regular constructor
  public LibraryBook(String bookName, String authorName) 
  {
    title = bookName;
    author = authorName;
    dueDate = "";
    timesLoaned = 0;
    loan = false;
  }
  //copy constructor
  public LibraryBook(LibraryBook forCheck)
  {
    title = forCheck.getTitle();
    author = forCheck.getAuthor();
    dueDate = forCheck.getDueDate();
    timesLoaned = forCheck.getTimesLoaned();
    loan = forCheck.onLoan();
  }
  
  
  // methods
  
  /**
   * Checks whether the given intance has same properties as the next instance.
   * @param forCheck inputs an instance of the library book.
   * @return boolean for whether its equal or not.
   */
  
  public boolean equals(LibraryBook forCheck)
  {
      if ((title.equals(forCheck.getTitle())) && (author.equals(forCheck.getAuthor())))
      {
        return true;
      }
      else
      {
        return false;
      }
  }
  
  /**
   * Outputs all information of book.
   */
  public String toString() 
  {
    //variables
    String output;
    
    //program code
    output = ("\n The Title is : " + title + "\n The author is : " + author + "\n The due date is : " + dueDate + "\n The number of time loaned is : " + timesLoaned);
    return output;
  }
  
  /**
   * checks whether the book is loaned or not
   */
  public boolean onLoan() 
  {
    return loan;
  }
  
  /**
   * returns the number of times book is loaned
   */
  public int getTimesLoaned() 
  {
    return timesLoaned;
  }
  
  /**
   * Outputs due date of the book.
   * @return due date of the instance of the library book.
   */
  public String getDueDate() 
  {
    return dueDate;
  }
  
  /**
   * loans the book.
   * @param dueDateNew new date 
   */
  public void loanBook(String dueDateNew) 
  {
    dueDate = dueDateNew;
    timesLoaned++;
    loan = true;
  }
  
  /**
   * returns the book.
   */
  public void returnBook() 
  {
    loan = false;
    dueDate = "";
  }
  
  /**
    * Outputs author of the book.
   * @return author of the instance of the library book.
   */
  public String getAuthor() 
  {
    return author;
  }
  
  /**
    * Outputs title of the book.
   * @return title of the instance of the library book.
   */
  public String getTitle() 
  {
    return title;
  }
  
  /**
   * Checks whether two instances have same names.
   * @param forCheck is the input instance
   * @return has boolean if book name same or not
   */
  public boolean hasSameTitle(LibraryBook forCheck) 
  {
    if (title.equals(forCheck.getTitle()))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  /**
   * Checks whether two instances have same authors.
   * @param forCheck is the input instance
   * @return has boolean if book author same or not
   */
  public boolean hasSameAuthor(LibraryBook forCheck) 
  {
    if (author.equals(forCheck.getAuthor()))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  
}
