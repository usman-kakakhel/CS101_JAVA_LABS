import java.util.Scanner;


/**
 * __lab05c___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __1-11-2017__
 */ 

public class lab05c
{
  
  //Factorial method
  public static long factorial(int num)
  {
    //variables
    long ans;
    
    //program code
    ans = 1;
    
    for (int i = 1; i <= num; i++)
    {
      ans = ans * i;
    }
    
    return ans;
  }
  
  //Taylor series for accuracy based SIN
  public static double tas(double acc)
  {
    //constants
    final double accuratevalue = 0.0000001;
    
    //variables
    int num;
    double ans;
    int i;
    
    //program code
    num = 1;
    ans = 0;
    i = 1;
  
    
    acc = acc % 360;
    acc = (acc*(Math.PI/180));
    
    do
    {
      if ((i % 2)==0)
      {
        ans = (ans) - (Math.pow(acc,num)/factorial(num));
      }
      else
      {
        ans = (ans) + (Math.pow(acc,num)/factorial(num));
      }
      num = num + 2;
      i++;
      
      
    } while ((Math.pow(acc,num)/factorial(num)) >= accuratevalue);
    
    return(ans);
  }
  
  //Taylor series Fixed based SIN
  public static double tfs(double acc)
  {
    //constants
    final int fixedvalue = 10;
    //variables
    int num;
    double ans;
    
    //program code
    num = 1;
    ans = 0;
    
    acc = acc % 360;
    acc = (acc*(Math.PI/180));
    
    for (int i = 1; i <= fixedvalue; i++)
    {
      if ((i % 2)==0)
      {
        ans = (ans) - (Math.pow(acc,num)/factorial(num));
      }
      else
      {
        ans = (ans) + (Math.pow(acc,num)/factorial(num));
      }
      System.out.println(factorial(num));
      num = num + 2;
    }
    return(ans);
  }
  
  //Main
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    String command;
    double num;
    double acc;
    int check;
    Boolean exit;
    
    // program code
    num = 0;
    acc = 0;
    exit = false;
    
    System.out.println( "Welcome to \"simple calculator\"");
    do{
      check=1;
      System.out.println( "--------------------------------------");
      System.out.println("["+acc+"]");
      System.out.println( "--------------------------------------");
      System.out.println( "+,-,*,/ value");
      System.out.println( "Sin ");
      System.out.println( "taylor fix value sin(tfs)");
      System.out.println( "taylor accuracy based value sin(tas)");
      System.out.println( "Clear");
      System.out.println( "Quit");
      System.out.println( "--------------------------------------");
      System.out.print( "Select:");
      command = scan.next();
      if ((command.equals("tfs")) || (command.equals("Tfs")))
      {
        check = 0;
        acc = tfs(acc);
      }
      if ((command.equals("tas")) || (command.equals("Tas")))
      {
        check = 0;
        acc = tas(acc);
      }
      if ((command.equals("sin")) || (command.equals("Sin")) || (command.equals("s")) || (command.equals("S")))
      {
        acc = (acc*(Math.PI/180));
        check = 0;
        acc = Math.sin(acc);
      }
      if ((command.equals("C"))|| (command.equals("c")) || (command.equals("clear")) || (command.equals("Clear")))
      {
        num = 0;
        acc = 0;
        check = 0;
      }
      else if ((command.equals("Q"))|| (command.equals("q")) || (command.equals("quit")) || (command.equals("Quit")))
      {
        System.out.println( "Thanks for using\"Simple Calculator\", Goodbye.");
        exit = true;
      
        check =0;
      }
      if (check == 1)
      {
        num = scan.nextDouble();
      }
      if ((command.equals("+")))
      {
        acc = acc + num;
      }
      else if ((command.equals("-")))
      {
        acc = acc - num;
      }
      else if ((command.equals("*")))
      {
        acc = acc * num;
      }
      else if ((command.equals("/")))
      {
        acc = acc / num;
      }
    }while (exit == false);
  }
  
}
