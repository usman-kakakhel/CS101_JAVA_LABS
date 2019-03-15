import java.util.Scanner;

/**
 * __lab04b___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __25-10-2017__
 */ 
public class lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

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
      x = 0;
     while (x == 0)
     {
       value = scan.nextInt();
       if (value<0)
       {
         x=1;
       }
       else
       {
       sum = sum + value;
       if (counter == 0)
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
       }
     }
     avg = (double)sum/counter;
     System.out.println("counter= " + counter + ", sum= " + sum + ", average= " + avg + ", max= " + max + ", min= " + min);
   }

}