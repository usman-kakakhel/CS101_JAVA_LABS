import java.util.Scanner;

/**
 * __program description___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __11.10.17__
 */ 
public class lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      //variables
      int side1;

      int side2;  
      
      int side3; 
                  
      double perimeter;
      
      double area;
      
      int flowers;
      
      //constants
      final int flowersinaunit = 17;
      
      //program code
                
      System.out.println("Enter a side.");
      side1 = scan.nextInt();
      System.out.println("Enter a side.");
      side2 = scan.nextInt(); 
      System.out.println("Enter a side.");        
      side3 = scan.nextInt(); 
      perimeter = (double)(side1 + side2 + side3)/2 ;
      area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
      flowers =(int) area * flowersinaunit;
    
                
      System.out.println( "number of flowers are " + flowers);
   }

}