/*
 for & do-while Statements
 @author __Remzi Tepe__
 @version __05/10/2019__
 */
import java.util.Scanner;
public class Lab05b4 {
   public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    
    // constants
    
    // variables 
    int column;
    int row;

    // program code
    
    System.out.println("What is the column?");
    column = scan.nextInt();
    System.out.println("What is the row?");
    row = scan.nextInt(); 
    
    for (  int i = 1; i <= row; i++)
    {
          for ( int j = 1; j <= column; j++)
          { 
             if ( j == 1)
                System.out.print("   " + i + "   ");
             else 
                System.out.print("-   ");
          }
          System.out.println();
    }
   }
}