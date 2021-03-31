/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Lab03a {
  
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);
    
  /* this program is used when we need the numbers out of 12-25:
     if ( x<12 && x>25)
     System.out.println( x ": out of range 12-25" ); */
   
  /* This program is used to find whether values are odd or even:
    int count_even,count_odd;
    count_even = 0;
    count_odd = 0;


    for ( int x = 0; x <= 50; x++)    
    {
      if ( x % 2 == 0)
        count_even+= 1;
      else 
        count_odd+= 1;
}
    System.out.println("the number of even values is " + count_even);
    System.out.println("the number of odd values is " + count_odd);
    */
    
   /*  This is used when we need the numbers divided by five, two ,three or seven, and others:
      for ( int x = 0; x <= 50; x++)
    {
      if ( x %5 == 0 )
        System.out.println( x + " Hi Five!");
      else if ( x %2 == 0 ) 
        System.out.println( x + " Hi Two!");
      else if ( x %3 == 0 || x %7 == 0 )
        System.out.println( x + " Hi Three or Seven!");
      else 
        System.out.println( x + " Hi Others! ");
    }
    */
    int n,y,z;
    n = scan.nextInt();
    y = 0;
    z = n * (n + 1) / 2;
      for (int x = 0; x <= n; x++)
      {
        y += x;
        
      }
      System.out.println( "sum of the x values between 1 and n inclusive is : " + y );
      if ( y == z)
        System.out.println(" Result of the sum formula and sum of the x values between 1 and n inclusive are same");
      else
        System.out.println("Result of the sum formula and sum of the x values between 1 and n inclusive are same");
       
        
  }
  
 
  
  
}
