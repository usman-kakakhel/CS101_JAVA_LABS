// die
public class Die
{
  // properties
  private int faceValue;
  
  // constructors
  
  // methods
  
  /**
   * outputs faceValue of die
   */
  public String toString() 
  { 
    //variables
    String output;
    //program code
    output = "value of die : " + faceValue;
    return(output);
  }
  
  /**
   * rolls one die.
   */
  public void roll() 
  {
    faceValue = (int)(Math.random() * 6 + 1);
  }
  
  /**
   * sends value of die
   */
  public int getFaceValue() 
  {
    //program code
    return faceValue;
  }
  

  
}