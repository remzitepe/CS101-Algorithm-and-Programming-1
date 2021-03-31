/*
 for & do-while Statements
 @author __Remzi Tepe__
 @version __05/10/2019__
 */
import java.util.Scanner;
public class Lab05a {
   public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    
    // constants
    
    // variables 
    String option;
    int width;
    int wall_thickness;
    int height;

    // program code
    do {
    System.out.println("What is the width?");
    width = scan.nextInt();
    System.out.println("What is the heihgt?");
    height = scan.nextInt();   
    System.out.println("What is the wall thickness?");
    wall_thickness = scan.nextInt();
    
    if ( (width <= 0) || (height <= 0) ||  (wall_thickness <= 0) )
       System.out.println("Integers you input must be positive.");
    else if ( wall_thickness >=  (height - 1) || (wall_thickness >= (width - 1 ) ) )
    {
       for (  int i = 0; i < height; i++)
       {
          for ( int j = 0; j < width; j++)
          {
             if ( ( j >= wall_thickness) && ( i >= wall_thickness) && ( i < ( height - wall_thickness)) && ( j < ( width - wall_thickness)))                                                                                           
                System.out.print(" ");
             else 
                System.out.print("*");
          }
          System.out.println();
         
     }
        System.out.println(" opps... No hole.");
    }
               
    else 
    {
       for (  int i = 0; i < height; i++)
       {
          for ( int j = 0; j < width; j++)
          {
             if ( ( j >= wall_thickness) && ( i >= wall_thickness) && ( i < ( height - wall_thickness)) && ( j < ( width - wall_thickness)))                                                                                           
                System.out.print(" ");
             else 
                System.out.print("*");
          }
          System.out.println();
       }
    }
    System.out.println(" Do you want to run the program again? If you do, press Y.");
    option = scan.next();
    } while ( option.equals("Y"));
    System.out.println("Goodbye");
   }  
}



    