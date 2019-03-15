// tests the dýce game
public class TestDiceGame
{
  // properties
  DiceGame diceGame1;
  
  // constructors
  
  // methods
  
  /**
   * plays and tests the game.
   */
  public void playTesting() 
  {
    //variables
    int rolls;
    //program code
    diceGame1 = new DiceGame();
    rolls = diceGame1.play();
    System.out.println("The number of times these dice rolled is : " + rolls);
  }
  
}