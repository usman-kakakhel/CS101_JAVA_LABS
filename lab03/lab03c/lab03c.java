import java.util.Scanner;
import java.nio.file.*;   
import java.io.*;
/**
 * __lab03c___ 
 * @author __Mian Usman Naeem Kakakhel___
 * @version __18.10.17__
 */ 

public class lab03c
{
  public static void main( String[] args)throws FileNotFoundException
  {
    Scanner scan = new Scanner( System.in);
    PrintStream originalStdOut = System.out;
    //variables
    String name;
    int age =0;
    double salary = 0;
    String comments;
    int x = 0;
    boolean piccheck;
    
    //constants
    final String htmlopen = "<html>" ;
    final String htmlclose = "</html>" ;
    final String headopen = "<head>" ;
    final String headclose = "</head>" ;
    final String titleopen = "<title>" ;
    final String titleclose = "</title>" ;
    final String hr = "<hr>" ;
    final String h1open = "<h1>" ;
    final String h1close = "</h1>" ;
    final String bodyopen = "<body>" ;
    final String bodyclose = "</body>" ;
    final String popen = "<p>" ;
    final String pclose = "</p>" ;
    
    final double tax1 = 0.95;
    final double tax2 = 0.85;
    final double tax3 = 0.75;
    final int value100 = 100; 
    //program code
    
    System.out.println("enter name");
    name = scan.nextLine();
    
    
    System.out.println("enter positive age value");
    age = scan.nextInt();
    if (age<=0)
    {
      System.out.println("This is not correct age.");
      System.exit(0);
    }
    
    
    System.out.println("enter salary which is above 0 but below 10000.");
    salary = scan.nextDouble();
    if ((salary > 10000) && (salary <= 0))
    {
      System.out.println("this is not valid salary");
      System.exit(0);
    }
    
    scan.nextLine();
    
    System.out.println("enter comments");
    comments = scan.nextLine();
    if (salary >= 5000)
    {
      
      salary = (salary-value100) * tax3 ;
    }
    else if (salary <= 1000)
    {
      
      salary = (salary-value100) * tax1 ;
    }
    else
    {
      
      salary = (salary-value100) * tax2 ;
    }
    
    piccheck = Files.exists( Paths.get( name+ ".jpg") );
    
    
    System.setOut( new PrintStream( "magic.htm" ) );
    
    if (piccheck == true)
    {
      System.out.println( "<!DOCTYPE html>" + htmlopen + headopen + titleopen+ name + "'s Home Page" + titleclose + headclose + bodyopen +hr +"<img src=\""+name+".jpg\"" +">"+ h1open + name + h1close + popen + "Age: " + age + pclose + popen + "Gross Salary: " + salary + pclose + popen + "Comments: " + comments + pclose + hr + bodyclose + htmlclose);
    }
    else
    {
      System.out.println( "<!DOCTYPE html>" + htmlopen + headopen + titleopen+ name + "'s Home Page" + titleclose + headclose + bodyopen +hr + h1open + name + h1close + popen + "Age: " + age + pclose + popen + "Gross Salary: " + salary + pclose + popen + "Comments: " + comments + pclose + hr + bodyclose + htmlclose);
    }
    System.out.close();
    System.setOut( originalStdOut);
    System.out.println( "Webpage created.");
  }
}