import java.util.Scanner;

/**
 * __lab10b___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __20-12-2017__
 */ 
public class lab10b
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    final int sizeOfArray = 10;
    
    // variables
    BigNum[] bigNumsArray;
    String random;
    int n;
    BigNum forCheck;
    int location;
    
    // program code
    bigNumsArray = new BigNum[sizeOfArray];
    
    for (int j = 0; j < sizeOfArray; j++)
    {
      random = "";
      for (int z = 0; z < BigNum.SIZE; z++)
      {
        random = random + (int)(Math.random() * BigNum.BASE);
      }
      bigNumsArray[j] = new BigNum(random);
    }
    for (BigNum x : bigNumsArray)
    {
      System.out.println(x);
    }
    
    System.out.println("Enter value of n.");
    n = scan.nextInt();
    while (!(n < 0))
    {
      forCheck = new BigNum(bigNumsArray[0]);
      for (int x = 0; x < n; x++)
      {
        if (forCheck.isLessThan(bigNumsArray[x]))
        {
          forCheck = new BigNum(bigNumsArray[x]);
        }
      }
      location = 0;
      for (int x = 0; x < n; x++)
      {
        if (forCheck.equals(bigNumsArray[x]))
        {
          location = x + 1;
          System.out.println(location + " is the Location of the largest number on array.");
        }
      }
      bigNumsArray[location - 1] = new BigNum(bigNumsArray[n - 1]);
      bigNumsArray[n - 1] = new BigNum(forCheck);
      
      for (BigNum x : bigNumsArray)
      {
        System.out.println(x);
      }
      
      
      System.out.println("Enter value of n.");
      n = scan.nextInt();
    }
    
    
    
  }
  
}