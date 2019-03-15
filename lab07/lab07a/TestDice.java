// tests dýce
public class TestDice
{
  // properties
  private Dice dices;
  private int rolls;
  
  // constructors
  
  // methods
  
  /**
   * outputs number of rolls of dýce
   */
  public String toString() 
  { 
    //variables
    String output;
    //program code
    output = "Number of rolls done in testing: " + rolls +   "dice total is: " + dices.getDiceTotal();
    return(output);
  }
  /**
   * rolls the dýce and tests
   */
  public void testingDice() 
  {
    //variables
    boolean check;
    
    //program code
    dices = new Dice();
    rolls = 0;
    check = true;
    
    
    while(check)
    {
      dices.roll();
      rolls++;
      //System.out.println( die1.getFaceValue() + " " + die2.getFaceValue());
      if((dices.getDie1FaceValue() == 6) && (dices.getDie2FaceValue() == 6))
      {
        check = false;
      }
    }
    
  }
  
}