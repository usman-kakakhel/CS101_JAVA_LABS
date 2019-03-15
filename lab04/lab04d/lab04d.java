import java.util.Scanner;

/**
 * __lab04d___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __25-10-2017__
 */ 
public class lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
     
      // variables
      String s;
      char ch;
      int count;
      int x ;
      int i;
      // program code
      count=0;
       x = 0;
       i = 0;
      System.out.println("enter one single character.");
      s = scan.next();
      ch = s.charAt(0);
      System.out.println("enter your number.");
      count = scan.nextInt();
      
      while (x < count)
      {
        while (i <= x)
        {
          System.out.print(ch);
          i++;
        }
        i=0;
        x++;
        System.out.println();
      }
      
      /**x=count;
      while ((x <= count)&&(x>=0))
      {
        while ( i >0)
        {
          System.out.print(ch);
          i--;
        }
        i=x;
        x--;
        System.out.println();
      }**/
   }

}