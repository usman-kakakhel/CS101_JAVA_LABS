//the game to play
public class DiceGame
{
  // properties
  Dice dices;
  
  // constructors
  
  // methods
  
  /**
   * plays the game by rolllýng dýce.
   */
  public int play() 
  {
    //variables
    int rolls;
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
    return rolls;
  }
  
}