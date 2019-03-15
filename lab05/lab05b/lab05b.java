import java.util.Scanner;

/**
 * __lab05b___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __1-11-2017__
 */ 
public class lab05b
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int col;
    int row;
    int x;
    int gaps;
    String len;

    // program code
    
    gaps = 6;
    System.out.println("Please enter value of rows and columns.");
    row = scan.nextInt();
    col = scan.nextInt();
    
    System.out.println("Number of row and columns.");
    for ( int i = 1; row >= i; i++)
    {
      for( int j = 1;col >= j; j++)
      {
        gaps = 6;
        len = i + "," + j;
        System.out.print(len);
        gaps = gaps - len.length();
        
        for (int h = 0;gaps > h; h++ )
        {
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
    
    
    System.out.println("the product of the row & column number (a multiplication table!).");
    for ( int i = 1;row>=i;i++)
    {
      for( int j = 1;col>=j;j++)
      {
        gaps = 6;
        len = (i*j)+"";
        System.out.print(len);
        gaps = gaps - len.length();
        
        for (int h = 0;gaps>h;h++ )
        {
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
    
    
    System.out.println("the cell number beginning from 0 and increasing left to right, top to bottom");
    x=1;
    for ( int i = 1; row >= i; i++)
    {
      for( int j = 1; col >= j; j++)
      {
        gaps = 6;
        len = x+"";
        System.out.print(x);
        gaps = gaps - len.length();
        
        for (int h = 0;gaps > h; h++ )
        {
          System.out.print(" ");
        }
        
        x++;
      }
      System.out.println();
    }
    
    
    System.out.println("the row number in the first column only, putting the String \"-\" into the other cells.");
    for ( int i = 1; row >= i; i++)
    {
      for( int j = 1; col >= j; j++)
      {
        gaps = 6;
        len = i+"";
        
        if (j==1)
        {
          gaps = gaps - len.length();
          System.out.print(len);
        }
        else
        {
          len = ("-");
          gaps = gaps - len.length();
          System.out.print("-");
        }
        
        
        for (int h = 0; gaps > h; h++ )
        {
          System.out.print(" ");
        }
        
        
      }
      System.out.println();
    }
    
  }
  
}