import java.util.Scanner;

/**
 * __lab07a___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __29-11-2017__
 */ 
public class lab07a
{

  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int diceNum1;
    int diceNum2;
    boolean check;
    boolean continousCheck;
    int rolls;
    TestDiceGame testing;
    
    // program code
    diceNum1 = 0;
    diceNum2 = 0;
    check = true;
    rolls = 0;
    
    System.out.println( "dice results.");
    while(check)
    {
      diceNum1 = (int)(Math.random() * 6 + 1);
      diceNum2 = (int)(Math.random() * 6 + 1);
      rolls++;
      //System.out.println( diceNum1 + " " + diceNum2);
      if((diceNum1 == 6) && (diceNum2 == 6))
      {
        check = false;
      }
    }
    System.out.println( "Number of rolls." + rolls);
    
    //10 dice now
    /**diceNum1 = 0;
    check = true;
    rolls = 0;
    
    
    System.out.println( "dice results.");
    while(check)
    {
      continousCheck = true;
      for(int x = 0; x < 10; x++)
      {
        diceNum1 = (int)(Math.random() * 6 + 1);
        //diceNum1 = scan.nextInt();
        System.out.print(diceNum1 + ", ");
        if((diceNum1 == 6) && (continousCheck))
        {
          check = false;
        }
        else
        {
          check = true;
          continousCheck = false;
        }
      }
      System.out.println();
      rolls++;
      
    }
    System.out.println( "Number of rolls.");
    System.out.println( rolls);**/
    
    testing = new TestDiceGame();
    testing.playTesting();
    
    
    
  }
  
}