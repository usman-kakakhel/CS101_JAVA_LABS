import java.util.Scanner;

/**
 * __lab03b___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __18.10.17__
 */ 
public class lab03b
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    //variables
    int side1=0;
    int side2=0;  
    int side3=0; 
    double perimeter;
    double area;
    int flowers;
    int x = 0;
    
    //constants
    final int flowersinaunit = 17;
    //program code
    while (x == 0)
    {
      System.out.println("Enter a side 1, which is smaller than the sum of both other sides.");
      side1 = scan.nextInt();
      if  (side1 > 0)
      {
        x=1;
      }
      else
      {
        System.out.println("wrong side entered.");
      }
    }
    x=0;
    while (x == 0)
    {
      System.out.println("Enter a side 2, which is smaller than the sum of both other sides.");
      side2 = scan.nextInt();
      if (side2 > 0)
      {
        x=1;
      }
      else
      {
        System.out.println("wrong side entered.");
      }
    }
    x=0;
    while (x == 0)
    {
      System.out.println("Enter a side 3, which is smaller than the sum of both other sides.");
      side3 = scan.nextInt();
      if ((side3 < side1 + side2) && (side1 > 0)&&(side1 < side2 + side3) &&(side2 < side1 + side3) )
      {
        x=1;
      }
      else
      {
        System.out.println("wrong side entered.");
      }
    }
    perimeter = (double)(side1 + side2 + side3)/2 ;
    area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    flowers =(int) area * flowersinaunit;
    System.out.println( "number of flowers are " + flowers);
  }
}