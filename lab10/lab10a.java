import java.util.Scanner;

/**
 * __lab10a___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __20-12-2017__
 */ 
public class lab10a
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    BigNum b1;
    BigNum b2;
    BigNum b3;
    
    // program code
    b1 = new BigNum();
    b2 = new BigNum("456");
    b3 = new BigNum(b2);
    
    System.out.println(b1 + "-----" + b2 + "-----" + b3);
    System.out.println("b1 is zero?  " + b1.isZero());
    System.out.println("b2 is zero?  " + b2.isZero());
    System.out.println("b3 is zero?  " + b3.isZero());
    System.out.println("b1 is equal to b2?  " + b1.equals(b2));
    System.out.println("b1 is equal to b3?  " + b1.equals(b3));
    System.out.println("b2 is equal to b3?  " + b2.equals(b3));
    
    b2.shift(false);
    System.out.println(b1 + "-----" + b2 + "-----" + b3);
    b2.shift(true);
    System.out.println(b1 + "-----" + b2 + "-----" + b3);
    
    b1 = new BigNum();
    b2 = new BigNum("4560");
    b3 = new BigNum(b2);
    b2 = new BigNum("9512");
    
    System.out.println(b2);
    System.out.println(b3);
    System.out.println("Carry : " + b2.add(b3) + "  " + b2);
    System.out.println("Carry : " + b3.add(b1) + "  " + b3);
    
  }
  
}