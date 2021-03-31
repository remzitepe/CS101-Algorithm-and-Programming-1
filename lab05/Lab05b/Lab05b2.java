/*
 for & do-while Statements
 @author __Remzi Tepe__
 @version __05/10/2019__
 */
import java.util.Scanner;
public class Lab05b2 {
   public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    
    // constants
    
    // variables 
    int column;
    int row;
    int x;
    int y;

    // program code
    
    System.out.println("What is the column?");
    column = scan.nextInt();
    System.out.println("What is the row?");
    row = scan.nextInt(); 
    
    for (  int i = 1; i <= row; i++)
    {
          for ( int j = 1; j <= column; j++)
          {
             x = i/10;
             y = j/10;
             if ( x >= 10 || y >= 10)
             {
                if ( x < 1 || y < 1)
                   System.out.print(" " + (i * j));
                else 
                   System.out.print(i * j); 
             }
             else 
             { 
                if ( x< 1 && y < 1 )
                   System.out.print("   " + ( i * j));
                else if ( x < 1 || y < 1)
                   System.out.print("  " + (i * j));
                else 
                    System.out.print(" " + (i * j));
            
              }
          
    }
    System.out.println();
   }
}
}