import java.util.Scanner;

/**
 * __lab04d___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __22-10-2017__
 */ 
public class lab04dextra
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    double d;
    // program code
    
    d = 0.1;
    //while ( d < 1.0 )
    while (d!=1.0)
    {
      System.out.println( d);
      d = d + 0.1;
    }
    System.out.println( d + " <- final value after loop!");
    
  }
  
}

