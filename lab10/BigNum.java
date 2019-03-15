// BigNum class
public class BigNum
{
  // properties
  public static int SIZE = 4;
  public static int BASE = 10;
  private int[] arrayOfData;
  
  // constructors
  // constructor with no parameters
  public BigNum()
  {
    arrayOfData = new int[SIZE];
  }
  // constructors with string parameters of data
  public BigNum(String data)
  {
    arrayOfData = new int[SIZE];
    for (int x = 0; x < data.length(); x++)
    {
      //arrayOfData[x] = Integer.parseInt(data.substring(data.length()-x-1, data.length()-x));
      arrayOfData[x] = (int)(data.charAt(data.length() - 1 - x) - 48);
    }
  }
  // constructor with BigNum as parameter
  public BigNum(BigNum forClone)
  {
    arrayOfData = new int[SIZE];
    for (int x = 0; x < SIZE; x++)
    {
      arrayOfData[x] = forClone.getArrayOfData()[x];
    }
  }
  
  
  // methods
  
  /**
   * Sends data of array to who calls it.
   * @return arrayOfData
   */
  public int[] getArrayOfData() 
  {
    return arrayOfData;
  }
  
  /**
   * Sends data of array to who calls it.
   * @return output which has arrayOfData and size and base of class.
   */
  public String toString() 
  {
    String output;
    boolean check;
    check = true;
    output = "[";
    for (int r : arrayOfData)
    {
      if (check)
      {
        output = output + r + "";
        check = false;
      }
      else
      {
        output = output + ", " + r;
      }
    }
    output = output + "] Size = " + SIZE + ", Base = " + BASE;
    return output;
  }
  
  /**
   * checks if this object equals the one it compares.
   * @param forDataCheck is a BigNum 
   * @return check
   */
  public boolean equals(BigNum forDataCheck) 
  {
    boolean check;
    check = true;
    for (int x = 0; x < SIZE; x++)
    {
      if (arrayOfData[x] != forDataCheck.getArrayOfData()[x])
      {
        check = false;
      }
    }
    return check;
  }
  
  /**
   * Checks if array has all zero in it. 
   * @return check
   */
  public boolean isZero() 
  {
    boolean check;
    check = true;
    for (int x : arrayOfData)
    {
      if (x != 0)
      {
        check = false;
      }
    }
    return check;
  }
  
  
  /**
   * multiplies base to the arrayOfData.
   * @param left is a Boolean 
   * @return check
   */
  public void shift(boolean left) 
  {
    if (left)
    {
      for (int x = SIZE - 1; x > 0; x--)
      {
        arrayOfData[x] = arrayOfData[x - 1];
      }
      arrayOfData[0] = 0;
    }
    else
    {
      for (int x = 0; x < SIZE - 1; x++)
      {
        arrayOfData[x] = arrayOfData[x + 1];
      }
      arrayOfData[SIZE - 1] = 0;
    }
  }
  
  
  /**
   * adds anything in the arrayOfData. 
   * @param other is a BigNum 
   * @return check
   */
  public int add(BigNum other) 
  {
    int carry;
    carry = 0;
    
    for (int x = 0; x < SIZE; x++) 
    {
      if ((other.getArrayOfData()[x] + arrayOfData[x] + carry) >= BASE)
      {
        arrayOfData[x] = (other.getArrayOfData()[x] + arrayOfData[x] + carry) - BASE;
        carry = 1;
      }
      else
      {
        arrayOfData[x] = other.getArrayOfData()[x] + arrayOfData[x] + carry;
        carry = 0;
      }
    }
    return carry;
  }
  
  /**
   * checks if given big num is smaller or bigger than the current one. 
   * @param other is a BigNum 
   * @return check
   */
  public boolean isLessThan(BigNum other) 
  {
    boolean check;
    check = false;
    for (int i = SIZE - 1; i >= 0; i--)
    {
      if (other.getArrayOfData()[i] > arrayOfData[i])
      {
        return true;
      }
      else if (other.getArrayOfData()[i] < arrayOfData[i])
      {
        return false;
      }
    }
    return check;
  }
  
}











