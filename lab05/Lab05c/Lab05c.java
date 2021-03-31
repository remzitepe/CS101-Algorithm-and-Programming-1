/*
 While Statements
 @author __Remzi Tepe__
 @version __29/10/2019__
 */
import java.util.Scanner;
public class Lab05c{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    // constants
    
    // variables
    
    String aritmetic_operation;
    String clear;
    String quit;
    double value;
    double number;
    double sum_number;
    double diff_number;
    double multiply_number;
    double divide_number;
    
   
    // program code
    sum_number = 0;
    diff_number = 0;
    multiply_number = 0;
    divide_number =  0;
    value = 0.0;
    aritmetic_operation = "";
    do {
    
       System.out.println("[" + value + "]");
       System.out.println(" +,-,*,/ value");
       System.out.println(" Press c to clear");
       System.out.println(" Press q to quit");
       aritmetic_operation = scan.next();
         
       if ( aritmetic_operation.equals("+") )
       {
          number = scan.nextInt();
          value += number;
          System.out.println(" Result: " + value);
       }
       if ( aritmetic_operation.equals("-"))
       {
          number = scan.nextInt();
          value -= number;
          System.out.println(" Result: " + value);
       }
       if ( aritmetic_operation.equals("*"))
       {  
          number = scan.nextInt();
          value *= number;
          System.out.println(" Result: " + value);
       }
       if ( aritmetic_operation.equals("/"))
       {  
          number = scan.nextInt();
          value /= number;
          System.out.println(" Result: " + value);
       }
      
    

    } while ( aritmetic_operation.equals("c") || (!aritmetic_operation.equals("q")) );
    
    
     System.out.println(" Goodbye");
           
  }
}

    
   
       
      
