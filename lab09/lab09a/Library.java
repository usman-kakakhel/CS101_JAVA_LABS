import java.util.ArrayList;
// Making a library
public class Library
{
  //properties
  LibraryBook b6;
  ArrayList<LibraryBook>  arrayBooks;
  
  //constructors
  public Library()
  {
    arrayBooks = new ArrayList<LibraryBook>();
  }
  //methods
  
  /**
   * Checks if the library books in this library are null.
   * @return returns a boolean whether library is empty true, or not empty false.
   */
  public boolean isEmpty()
  {
    if (arrayBooks.size() == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  /**
   * This outputs the properties of the object instance
   * @return output returns the string which has property information.
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
      output = arrayBooks.toString();
    }
    return output;
  }
  
  /**
   * Adds books in the library
   * @param bookName is name of book required.
   * @param authorName is name of author required.
   */
  public void add(String bookName, String authorName)
  {
    arrayBooks.add( new LibraryBook(bookName, authorName));
  }
  
  /**
   * sets property to null for an object
   * @param forCheck makes another instance of Library book.
   */
  public void remove(LibraryBook forCheck)
  {
    for (int i = 0; i < arrayBooks.size(); i++)
    {
      if (arrayBooks.get(i) == forCheck)
      {
        arrayBooks.remove(i);
      }
    }
    
  }
  
  /**
   * Finds instance of the book with same title.
   * @param bookName is the name of the book to find the instance.
   * @return b5 returns object with same name acquired
   */
  public LibraryBook findByTitle(String bookName)
  {
    //b6 = new LibraryBook(bookName, "");
    for (int i = 0; i < arrayBooks.size(); i++)
    {
      //if (arrayBooks.get(i).hasSameTitle(b6))
      if (bookName.equals(arrayBooks.get(i).getTitle()))
      {
        return arrayBooks.get(i);
      }
    }
    return null;
  }
  
  
}