import java.util.Scanner;

/**
 * __program description___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __11.10.17__
 */ 
public class lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      
      //variables
      int num1;
        
      int num2;
      
      int addition ;
      
      int subtraction;
        
      int multiplication;
        
      double division;
      
      int max;
        
      int min;
      //program code

      System.out.println("Please enter one number.");
      
      num1 = scan.nextInt();
      
      System.out.println("Please enter second number.");
    
      num2 = scan.nextInt();
      
      addition = num1 + num2;
      subtraction = num1 - num2;
      multiplication = num1 * num2;
      division =(double) num1 / num2;
      max = Math.max(num1,num2);
      min = Math.min(num1,num2);
        
      System.out.println("the sum of the numbers is " + addition);
      
      System.out.println("the difference of the numbers is " + subtraction);
      
      System.out.println("the product of the numbers is " + multiplication);
      
      System.out.println("the division of the numbers is " + division);
      
      System.out.println("the max of the numbers is " + max);
      
      System.out.println("the min of the numbers is " + min);
    
       
           
            
        
 
   }

}