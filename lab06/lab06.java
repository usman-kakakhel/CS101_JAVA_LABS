import java.util.Scanner;

/**
 * __Lab 06___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __08-11-2017__
 */ 
public class lab06
{
  /**
 * Taylor series expansion by using previous last term.
 * @double x is input parameter which is angle in radians.
 * @double ans is result returned which is sin value of given radian value.
 */
  public static double sin(double x)
  { 
    //variables
    int num;
    double ans;
    double lastTerm;
    
    //program code
    ans = 0;
    lastTerm = 0;
    
    for (int i = 0; i <= 10; i++)
    {
      if(i==0) 
      {
        lastTerm = (power(-1,i) / factorial(2*i + 1)) * power(x,2*i + 1);
      }
      else
      {
        lastTerm = ( power(-1,i) * Math.abs(lastTerm * power(x, 2) ) / ((2*i)*((2*i)+1)) );
      }
      ans = ans + lastTerm;
    }
    return(ans);
  }
  
  /**
 * Power method which calculates the power of the value to a given positive power.
 * @double x is an input which gets value which is to be manipulated.
 * @int y is an input which is the power to which the number is raised.
 * @double ans is the return which is the x to the power y.
 */
  public static double power(double x, int y)
  {
    // variables
    double ans;
    
    // program code
    ans = 1;
    
    if (y > 0)
    {
      for (int i = 0; y > i; i++)
      {
        ans = ans * x;
      }
    }
    
    return ans;
  }
  
  /**
 * Calculates the factorial of a given number.
 * @int n is an input, for which the factorial is to be found.
 * @long ans is returned as the factorial of the given input.
 */
  public static long factorial(int n)
  {
    // variables
    long ans;
    
    // program code
    ans = 1;
    
    for (int i = n; i > 0; i--)
    {
      ans = ans * i;
    }
    return ans;
  }
  
  /**
 * Reverses any String given to it.
 * @String s is its input of the string.
 * @String ans is returned as the reverse of the original string.
 */
  public static String reverse(String s)
  {
    // variables
    String ans;
    
    // program code
    ans = "";
    
    for (int i = s.length(); i > 0; i--)
    {
      ans = ans + s.substring(i-1,i); 
    }
    return ans;
  }
  
  /**
 * Converts binary value into decimal value.
 * @String base2 is the binary input.
 * @int ans is returned as the decimal value of binary.
 */
  public static int toDecimal( String base2)
  {
    // variables
    int ans;
    int sLength;
    String currentBinary;
    int powCount;
    
    // program code
    ans = 0;
    sLength = base2.length();
    powCount = 0;
    
    for (int i = sLength; i > 0; i--)
    {
      currentBinary = base2.substring(i-1,i);
      if (currentBinary.equals("1"))
      {
        ans = ans + (int)power(2,powCount);
      }
      powCount++;
    }
    return ans;
  }
  
  /**
 * Turns decimal value into binary.
 * @int base10 is the decimal input.
 * @String ans is the binary value which is returned.
 */
  public static String toBinary(int base10)
  { 
    // variables
    String ans;
    double maxPow;
    int i;
    
    // program code
    i = 0;
    ans = "";
    maxPow = 0;
    
    while (base10 >= maxPow)
    {
      maxPow = power(2,i);
      i++;
    }
    i = i - 2;
    maxPow = power(2,i); 
    
    while (i >= 0)
    {
      if (base10 >= maxPow)
      {
        base10 = base10 - (int)maxPow;
        ans = ans + "1";
      }
      else
      {
        ans = ans + "0";
      }
      i--;
      maxPow = power(2,i);
    } 
    return ans;
  }
  
  /**
 * Produces gaps when method is called.
 * @String s is the string after which gaps have to be produced.
 * @int gaps is the number of places in which the given numbers and spaces exist.
 * @Does not return anything, just prints gaps.
 */
  public static void gaps(String s, int gaps)
  {
    // program code
    gaps = gaps - s.length();
    
    for (int x = 0; x < gaps; x++)
    {
      System.out.print(" ");
    }
  }
  
  
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // variables
    String out;
    String base2;
    int base10;
    double x;
    double sin;
    double sinWorking;
    String s;
    String s1;
    
    // program code
    
    //print a table with columns n, n-squared, n-cubed & n to the power 4, for values of n from -1 to 10 inclusive
    System.out.println("print a table with columns n, n-squared, n-cubed & n to the power 4, for values of n from -1 to 10 inclusive");
    for (int n = -1; n <= 10; n++)
    {
      for (int p = 1; p <= 4; p++)
      { 
        out = (int)power(n,p) + "";
        System.out.print(out);
        gaps(out,6);
      }
      System.out.println();
    }
    
    //print a table of n and n-factorial, for values of n from 1 to 15
    System.out.println("print a table of n and n-factorial, for values of n from 1 to 15");
    for (int a = 1; a <= 15; a++)
    {
      System.out.print(a);
      out = a + "";
      gaps(out,6);
      System.out.println(factorial(a));
    }
    
    //read two binary (base-2) Strings from the user, convert them to decimal, then add them together and print the result in binary form.
    System.out.print("Enter first base2 value.");
    base2 = scan.nextLine();
    base10 = toDecimal(base2);
    System.out.print("Enter second base2 value.");
    base2 = scan.nextLine();
    base10 = base10 + toDecimal(base2);
    System.out.println("Sum of two binaries is: " + toBinary(base10));
    
    //read a line of text from the user and output it again, but with each word reversed.
    System.out.print("Enter sentence to reverse.");
    s = scan.nextLine();
    out = "";
    
    for (int i = s.length(); i > 0; i--)
    {
      if (s.substring(i-1,i).equals(" "))
      {
        s1 = s.substring(i,s.length());
        s = s.substring(0, i-1);
        out = reverse(s1) + " " + out;
      }
    }
    out = reverse(s) + " " + out;
    System.out.println("Value of reversed word in eat sentence is: " + out);
    
    
    //Taylor series sin
    sin = 0;
    System.out.print("Enter value for sin");
    x = scan.nextDouble();
    x = x % 360;
    x = (x * (Math.PI/180));
    
    System.out.println("n (-1,n) (x,2*n + 1)             (2*n + 1)                    termComputed              previousSum");
    for (int n = 0; n < 10; n++)
    {
      sinWorking = (power(-1,n) / factorial(2*n + 1)) * power(x,2*n + 1);
      sin = sin + sinWorking;
      System.out.print(n);
      gaps(n + "",3);
      System.out.print(power(-1,n));
      gaps(power(-1,n) + "",6);
      System.out.print(power(x,2*n + 1));
      gaps(power(x,2*n + 1) + "",25);
      System.out.print(factorial(2*n + 1));
      gaps(factorial(2*n + 1) + "",25);
      System.out.print(sinWorking);
      gaps(sinWorking + "",25);
      System.out.print(sin);
      System.out.println();
    }
    
    
    System.out.println();
    System.out.println("Value of taylor: " +  sin(x) + " Value of Math.sin: " + Math.sin(x) );
   
  }
  
}