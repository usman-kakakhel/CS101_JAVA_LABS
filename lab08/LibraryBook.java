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
   * Checks whether the gýven ýntance has same propertýes as the next ýnstance.
   * @param forCheck ýnputs an ýnstance of the lýbrary book.
   * @return boolean for whether ýts equal or not.
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
   * Outputs all ýnformatýon of book.
   */
  public String toString() 
  {
    //variables
    String output;
    
    //program code
    output = (" The Title is : " + title + "\n The author is : " + author + "\n The due date is : " + dueDate + "\n The number of time loaned is : " + timesLoaned);
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
  }
  
  /**
   * Outputs due date of the book.
   * @return due date of the ýnstance of the lýbrary book.
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
   * @return author of the ýnstance of the lýbrary book.
   */
  public String getAuthor() 
  {
    return author;
  }
  
  /**
    * Outputs týtle of the book.
   * @return týtle of the ýnstance of the lýbrary book.
   */
  public String getTitle() 
  {
    return title;
  }
  
  /**
   * Checks whether two ýnstances have same names.
   * @param forCheck ýs the ýnput ýnstance
   * @return has boolean ýf book name same or not
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
   * Checks whether two ýnstances have same authors.
   * @param forCheck ýs the ýnput ýnstance
   * @return has boolean ýf book author same or not
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
