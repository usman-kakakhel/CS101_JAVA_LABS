// dýe
public class Die
{
  // properties
  private int faceValue;
  
  // constructors
  
  // methods
  
  /**
   * rolls one dýe.
   */
  public void roll() 
  {
    faceValue = (int)(Math.random() * 6 + 1);
  }
  
  /**
   * sends value of dýe
   */
  public int getFaceValue() 
  {
    //program code
    return faceValue;
  }
  

  
}