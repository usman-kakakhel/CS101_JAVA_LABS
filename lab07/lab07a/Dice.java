// creates dýce
public class Dice
{
  // properties
  Die die1;
  Die die2;
  // constructors
  
  // methods
  /**
   * rolls dýce.
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
   * sends dýce 1 value.
   */
  public int getDie1FaceValue() 
  {
    //program code
    return die1.getFaceValue();
  }
  
  
  /**
   * sends dýce 2 value.
   */
  public int getDie2FaceValue() 
  {
        //program code
    return die2.getFaceValue();
  }
  
  
  /**
   * sends addýtýon of two dýces.
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