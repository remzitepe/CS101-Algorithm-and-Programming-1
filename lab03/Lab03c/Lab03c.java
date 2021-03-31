import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;
public class Lab03c {
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
     
       String name;
       String comment;
       int age,gross_salary;
       String x,y,z,t,a,b,c,d,u,v;
       a = "<!DOCTYPE html>";
       b = " </title> ";
       c = " </body> ";
       d =  "<hr>";
       x = "<p>" ; 
       y = "</p>";
       z = "<h1>";
       t = "</h1>";
       u = "<head>";
       v = "<html>";

      System.out.println();
      name = scan.nextLine();
    
      System.out.println();
      age = scan.nextInt();
 
      System.out.println();
      gross_salary = scan.nextInt();
     
      System.out.println();
      comment = scan.next();
  
      System.out.println( a );
      System.out.println( v );
      System.out.println( u );
      
      // age and salary have to be more than 0 and salary has to be less than 10000
      if ( age >= 0 && gross_salary >= 0 && gross_salary <= 10000)
      {
     
         System.out.println( b + z + z + " Welcome to " + name + "'s Home Page " + b );
         System.out.println( u );
         // if we use an image of an user we can use this method or just move on
      if ( name.equals("einstein") && Files.exists( Paths.get("einstein.jpg") ) )
         System.out.println( d + "<img src=einstein.jpg> " + z + "Name: " +  name  + t );
      else
            System.out.println( d + z + "Name: " +  name  + t );

      System.out.println( x + " Age: " +  age + y );
      
      if ( gross_salary < 1000) // Just take off 5% tax rate because their salaries too low
         System.out.println( x + " Net salary: " + ((gross_salary) - 100) * 95 / 100 + ("  (5% tax taken) ")+ y );
      else if ( gross_salary > 1000 && gross_salary < 5000) // take off 15% tax rate
         System.out.println( x + " Net salary: " + ((gross_salary) - 100) * 85 / 100 + ("  (15% tax taken) ")+ y );
      else  // take off 25% tax rate because their salaries too high
         System.out.println( x + " Net salary: " + ((gross_salary) - 100) * 75 / 100 + ("  (25% tax taken) ")+ y );
    
      System.out.println( x + "Comment :" + comment + y );  
 
    
      System.out.println( d );
      System.out.println( c );
      System.out.println( v );
      } 
      else 
        System.out.println( x + " Error, please write the values correctly " + y);
    
    
    
  }
}