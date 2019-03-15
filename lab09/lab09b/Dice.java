// creates dice
public class Dice
{
  // properties
  Die die1;
  Die die2;
  // constructors
  
  // methods
  
  /**
   * outputs faceValue of dice
   */
  public String toString() 
  { 
    //variables
    String output;
    //program code
    output = die1.toString() + " " + die2.toString() ;
    return(output);
  }
  
  /**
   * rolls dice.
   */
  public void roll() 
  {
    //program code
    die1 = new Die();
    die2 = new Die();
    die1.roll();
    die2.roll();
  }
  
  /**
   * sends dice 1 value.
   */
  public int getDie1FaceValue() 
  {
    //program code
    return die1.getFaceValue();
  }
  
  
  /**
   * sends dice 2 value.
   */
  public int getDie2FaceValue() 
  {
    //program code
    return die2.getFaceValue();
  }
  
  
  /**
   * sends addition of two dices.
   */
  public int getDiceTotal() 
  {
    //variables
    int diceTotal;
    
    //program code
    diceTotal = die1.getFaceValue() + die2.getFaceValue();
    return diceTotal;
  }
}