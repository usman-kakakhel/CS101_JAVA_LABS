// d�e
public class Die
{
  // properties
  private int faceValue;
  
  // constructors
  
  // methods
  
  /**
   * rolls one d�e.
   */
  public void roll() 
  {
    faceValue = (int)(Math.random() * 6 + 1);
  }
  
  /**
   * sends value of d�e
   */
  public int getFaceValue() 
  {
    //program code
    return faceValue;
  }
  

  
}