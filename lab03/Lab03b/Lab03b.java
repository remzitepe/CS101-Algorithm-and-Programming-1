/* 
  garden area calculation to plant flowers in garden
  created by Remzi Tepe 
  date: 15/10/2019
 
   */
import java.util.Scanner;
public class Lab03b {
  
  public static void main(String args[]){
    int a,b,c,s,x;
    
    Scanner calculate = new Scanner(System.in);
    
    // To find your garden's area you need to use Heron's formula.
    s = (a + b + c) / 2;
    
    // x equals garden's area's squared.
    x = (s * (s - a) * (s - b) * (s - c));
    
    System.out.println("any side of a triangle is always should be shorter than the sum of the other two sides!!!");
    
    // To calculate the area of the garden you need lenghts of sides.
    
    System.out.println("What is your triangular-shaped garden first side's(a) length?");
    a = calculate.nextInt();
    
    System.out.println("What is your triangular-shaped garden second side's(b) length?");
    b = calculate.nextInt();
    
    System.out.println("What is your triangular-shaped garden third side's(c) length?");
    c = calculate.nextInt();
  
    if ( (a + b) > c) // we need to get 3 values 
    {
       // Also you can plant only 17 flowers in each square meter. So that;
       System.out.print("Your garden's area is " +  Math.sqrt(x));
       System.out.println( " and you can plant " +  17 *  Math.sqrt(x) +  " flowers");
    }
    else 
       System.out.println(" it is not possible to create a triangle with these lenght of sides");  

  }
  
}
