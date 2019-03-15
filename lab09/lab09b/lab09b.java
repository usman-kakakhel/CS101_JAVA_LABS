import java.util.Scanner;
import java.util.ArrayList;
/**
 * __lab09b___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __13-12-2017__
 */ 
public class lab09b
{
  
  /**
   * This method rolls the dice and increments the frequency every time a total of dice is repeated.
   * @return returns the arraylist of integers which has frequencies. 
   */
  public static ArrayList<Integer> rolling()
  {
    // variables
    Dice dices;
    ArrayList<Integer> frequency;
    int value;
    
    // program code
    frequency = new ArrayList<Integer>();
    dices = new Dice();
    
    for (int i = 0; i <= 12; i++)
    {
      frequency.add(0);
    }
    
    for (int i = 0; i < 1000; i++)
    {
      dices.roll();
      for (int j = 2; j <= 12; j++)
      {
        if (dices.getDiceTotal() == j)
        {
          value = frequency.get(j);
          value++;
          frequency.set(j, value);
        }
      }
    }
    
    return frequency;
  }
  
  /**
   * This method prints all the histogram.
   * @param frequency is the arraylist of integers which has frequencies.
   */
  public static void histogram(ArrayList<Integer> frequency)
  {
    // variables
    int maxFreq;
    boolean check;
    int valueOfStar;
    String output;
    
    // program code
    maxFreq = 0;
    check = true;
    output = "";
    System.out.println(frequency);
    
    for (int i = 2; i <= 12; i++)
    {
      if (check)
      {
        maxFreq = frequency.get(i);
        check = false;
      }
      else
      {
        if (maxFreq < frequency.get(i))
        {
          maxFreq = frequency.get(i);
        }
      }
    }
    
    valueOfStar = maxFreq / 10;
    System.out.println("value of star:"+ valueOfStar + "   max freq:" + maxFreq);
    
    for (int j = 10; j >= 1; j--)
    {
      for (int i = 2; i <= 12; i++)
      {
        if ((frequency.get(i) / valueOfStar) >= j)
        {
          output = output + "*";
        }
        else
        {
          output = output + " ";
        }
      }
      output = output + "\n";
    }
    
    System.out.println(output);
  }
  
  /**
   * This is the main method.
   */
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    
    // program code
    
    histogram(rolling());
    
    System.out.println( "END");
  }
  
}