import java.util.Scanner;

/**
 * __lab03a___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __18.oct.2017__
 */ 
public class lab03a
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    
    
    // constants
    
    // variables
    int odd=0;
    int even=0;
    int result1;
    int result2;
    int result3;
    int result4;
    int n;
    int sum=0;
    int sumformula;
    // program code
    
    System.out.println("Enter value of n.");
    n = scan.nextInt();
    for(int j = 0; j<=n; j++)
    { 
      if (n>0)
      {
        sum = sum + j;
      }
    }
    for ( int x = 0; x <= 50; x++ ) 
    {
      System.out.println(x);
      
      result1= x%5;
      result2 = x % 2 ;
      result3= x%3;
      result4= x%7;
      
      
      if (( x >=12) && (x<=25 ) )
      {
               
          System.out.println(x + " out of range 12-25");
       
      }
      
      
      if ((result1 == 0) && (x>=5))
      {
        System.out.println("Hi Five.");
        
      }
     
      if (((result3 == 0)&&(x>=3)) || ((result4 == 0)&&(x>=7)))
      {
        System.out.println("Hi 3 or 7.");
        
      } 
           
      if ((result2 == 0) && (x>=2))
      {
        System.out.println("Hi 2.");
        
      }
      if (result2 == 1)
      {
        odd++;
      }
      else
      {
        even++;
      }
      if ((result1 != 0) && (result2 != 0) && (result3 != 0) && (result4 != 0) || (x == 0))
      {
        System.out.println("Hi everyone else.");
      }
      
           
    }
    sumformula = (n*(n+1)/2);
    if (sumformula == sum)
    {
      System.out.println("sum is equal. " + sum);
    }
    else
    {
      System.out.println("sum is not equal. " + sum);
    }
    System.out.println("odd numbers " + odd + " even numbers " + even);
    
  }
  
}