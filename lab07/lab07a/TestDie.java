// tests the dýe
public class TestDie
{
  // properties
  private Die die1;
  private Die die2;
  private int rolls;
  
  // constructors
  
  // methods
  
  /**
   * outputs rolls of dýe
   */
  public String toString() 
  { 
    //variables
    String output;
    //program code
    output = "Number of rolls done in testing: " + rolls;
    return(output);
  }
  /**
   * tests all the dýes.
   */
  public void testingDies() 
  {
    //variables
    boolean check;
    
    //program code
    die1 = new Die();
    die2 = new Die();
    rolls = 0;
    check = true;
    
    
    while(check)
    {
      die1.roll();
      die2.roll();
      rolls++;
      //System.out.println( die1.getFaceValue() + " " + die2.getFaceValue());
      if((die1.getFaceValue() == 6) && (die2.getFaceValue() == 6))
      {
        check = false;
      }
    }
    
  }
  
}