// Makýng a library
public class Library
{
  //properties
  LibraryBook b1;
  LibraryBook b2;
  LibraryBook b3;
  LibraryBook b4;
  LibraryBook b5;
  LibraryBook b6;
  //constructors
  public Library()
  {
    b1 = null;
    b2 = null;
    b3 = null;
    b4 = null;
  }
  //methods
  
  /**
   * Checks if the lýbrary books ýn thýs lýbrary are null.
   * @return returns a boolean whether lýbrary ýs empty true, or not empty false.
   */
  public boolean isEmpty()
  {
    if ((b1 == null) && (b2 == null) && (b3 == null) && (b4 == null))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  /**
   * This outputs the propertýes of the object ýnstance
   * @return output returns the strýng whých has property ýnformatýon.
   */
  public String toString()
  {
    //variables
    String output;
    
    //program code
    if (isEmpty()) 
    {
      output = " There are no books in the libarary.";
    }
    else
    {
      if (b1 == null)
      {
        output = " No book in this slot." + "\n";
      }
      else
      {
        output = b1.toString() + "\n";
      }
      
      if (b2 == null)
      {
        output = output + " No book in this slot." + "\n";
      }
      else
      {
        output = output + b2.toString() + "\n";
      }
      
      if (b3 == null)
      {
        output = output + " No book in this slot." + "\n";
      }
      else
      {
        output = output + b3.toString() + "\n";
      }
      
      if (b4 == null)
      {
        output = output + " No book in this slot.";
      }
      else
      {
        output = output + b4.toString();
      }
      
    }
    return output;
  }
  
  /**
   * Adds books ýn the lýbrary
   * @param bookName is name of book requýred.
   * @param authorName is name of author requýred.
   */
  public void add(String bookName, String authorName)
  {
    if (b1 == null)
    {
      b1 = new LibraryBook(bookName, authorName);
    }
    else if (b2 == null)
    {
      b2 = new LibraryBook(bookName, authorName);
    }
    else if (b3 == null)
    {
      b3 = new LibraryBook(bookName, authorName);
    }
    else if (b4 == null)
    {
      b4 = new LibraryBook(bookName, authorName);
    }
    else
    {
      System.out.println(" This book could not be added because no slot is available to add book.");
    }
  }
  
  /**
   * sets property to null for an object
   * @param forCheck makes another ýnstance of Lýbrary book.
   */
  public void remove(LibraryBook forCheck)
  {
    boolean check;
    check = false;
    if (!(b1 == null))
    {
      if (b1.equals(forCheck))
      {
        b1 = null;
        check = true;
      }
    }
    if (!(b2 == null))
    {
      if (b2.equals(forCheck))
      {
        b2 = null;
        check = true;
      }
    }
    if (!(b3 == null))
    {
      if (b3.equals(forCheck))
      {
        b3 = null;
        check = true;
      }
    }
    if (!(b4 == null))
    {
      if (b4.equals(forCheck))
      {
        b4 = null;
        check = true;
      }
    }
    if (!check)
    {
      System.out.println("This book is not in the libarary.");
    }
  }
  
  /**
   * Fýnds ýnstance of the book wýth same týtle.
   * @param bookName ýs the name of the book to fýnd the ýnstance.
   * @return b5 returns object wýth same name acquýred
   */
  public LibraryBook findByTitle(String bookName)
  {
    b5 = null;
    b6 = new LibraryBook(bookName, "");
    if (!(b1 == null))
    {
      if (b6.hasSameTitle(b1))
      {
        b5 = b1;
      }
    }
    if (!(b2 == null))
    {
      if (b6.hasSameTitle(b2))
      {
        b5 = b2;
      }
    }
    if (!(b3 == null))
    {
      if (b6.hasSameTitle(b3))
      {
        b5 = b3;
      }
    }
    if (!(b4 == null))
    {
      if (b6.hasSameTitle(b4))
      {
        b5 = b4;
      }
    }
    return b5;
  }
  
  
}