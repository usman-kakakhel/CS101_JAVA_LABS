import java.util.Scanner;
//Tests L�brary
public class LibraryTest
{
  //properties
  
  //constructors
  
  //methods
  
  /**
   * Tests l�brary.
   */
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    Library myLibrary = new Library();
    LibraryBook tempBook;
    // variables
    int menu;
    String nextDueDate;
    String namee;
    String authorr;
    boolean check;
    
    // program code
    check = true;
    do
    {
      System.out.println("press 1 to show, 2 to find, 3 to add, 4 to exit.");
      menu = scan.nextInt();
      
      if (menu == 1)
      {
          System.out.println(myLibrary.toString());
      }
      else if (menu == 2)
      {
        System.out.println("enter book name.");
        namee = scan.nextLine();
        namee = scan.nextLine();
        if (myLibrary.findByTitle(namee) == null)
        {
          tempBook = null;
        }
        else
        {
          tempBook = myLibrary.findByTitle(namee);
        }
        if (tempBook == null)
        {
          System.out.println("there is no book by that name.");
        }
        else
        {
          System.out.println(tempBook);
          System.out.println("press 1 to loan this book, 2 to return this book, 3 to remove, any other button to return to main menu.");
          menu = scan.nextInt();
          if (menu == 1)
          {
            if (tempBook.onLoan())
            {
              System.out.println("book is already loaned.");
            }
            else
            {
              System.out.println("enter due date for return.");
              nextDueDate = scan.nextLine();
              nextDueDate = scan.nextLine();
              tempBook.loanBook(nextDueDate);
            }
          }
          else if (menu == 2)
          {
            if (tempBook.onLoan())
            {
              tempBook.returnBook();
            }
            else
            {
              System.out.println("you have not loaned it how are you returning?");
            }
          }
          else if (menu == 3)
          {
            myLibrary.remove(tempBook);
          }
        }
        
      }
      else if (menu == 3)
      {
        System.out.println("Enter name for book.");
        namee = scan.nextLine();
        namee = scan.nextLine();
        System.out.println("Enter author for book.");
        authorr = scan.nextLine();
        myLibrary.add(namee, authorr);
      }
      else if (menu == 4)
      {
        check = false;
      }
    }while (check);
  }
}