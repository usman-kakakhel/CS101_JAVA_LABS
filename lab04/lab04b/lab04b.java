import java.util.Scanner;

/**
 * __lab04b___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __25-10-2017__
 */ 
public class lab04b
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    final int N=100;
    // variables
    int sum ;
    int counter ;
    int min;
    int max;
    double avg;
    int value;
    int x ;
    // program code
    
    sum =0;
    counter =0;
    min=0;
    max=0;
    x =0;
    while ( x<N)
    {
      value = scan.nextInt();
      sum = sum + value;
      if (x == 0)
      {
        min = value;
        max = value;
      }
      if (value > max)
      {
        max = value;
      }
      if (value < min)
      {
        min = value;
      }
      counter++;
      x++;
    }
    avg = (double)sum/counter;
    System.out.println("counter= " + counter + ", sum= " + sum + ", average= " + avg + ", max= " + max + ", min= " + min);
    
  }
  
}