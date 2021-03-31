/*
 Methods
 @author __Remzi Tepe__
 @version __12/11/2019__
 */
import java.util.Scanner;
public class Lab06 {
  /*
   * this method finds the result of x to the power of y
   * @param x is an input to use for the value which is multiplied
   * @param y is an input to use for as power
   * @return shows the result of x to the power of y
   */
  public static Double power( double x, double y)
  {
    double result_powers;
    result_powers = 1;
    if ( y > 0)
    {
       for ( double i = 1; i <= y; i++)
       { 
          result_powers = x * result_powers;
       }
    }
    return result_powers;
  }
  /*
   * this method finds the result n factorial
   * @param a is an input to use for its factorial
   * @return shows the result of n factorial
   */
  public static double factorial(double n)
  {   
     double result_factorial;
     result_factorial = 1;
     for (double i = 1; i <= n; i++)
     {
      result_factorial *= i;
     }
     return result_factorial;
  }
  /*
   * this method finds the reversed form of the input
   * @param s is an input to use to find the reverse form of itself
   * @return shows the reverse form of the input
   */
public static String reverse( String s)
  {   
      String reverse;
      reverse = "";
      int length = s.length();
      for (int i = length ; i > 0 ; i--)
      {
         reverse = reverse + (s.charAt(i-1)); 
      }
         return reverse;
  }
  /*
   * this method finds the result conversion a value from base2 to base10
   * @param base2 is an input to use to find its base10 form
   * @return shows base2 value in base10 form
   */
 public static int toDecimal(int base2)
  {  
     int decimalNumber;
     int remainder;
     int j;
     decimalNumber = 0;
     j = 1;
     while ( base2 != 0)
     {
        remainder = base2 %10;
        decimalNumber = decimalNumber + remainder * j;
        j = j * 2;
        base2 = base2 / 10;
     }  
        
        return decimalNumber;
  }/*
  /*
   * this method finds the result converion a value from base10 to base2
   * @param n is an input to use to find its base2 form
   * @return shows bas10 form of value in base2 form
   */
  public static String toBinary(int base10) 
  {    
       int rem;
       String binary; 
       binary = "";
       while (base10 > 0) {
           rem = base10 % 2;
           binary = rem + binary;
           base10 = base10 / 2;
       }
       return binary;
  }
  public static double sinx(double c)
  {
    double fact_sin;
    double j ;
    double real_sin;
    fact_sin = 1;
    real_sin = 1;
    j = 1;
    while ( j < 1000)
    {  
       fact_sin *= j;
       real_sin = Math.pow(c,j) / fact_sin;
       j = j + 2;
    }
    return real_sin;
    
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    // constants
    
    // variables 
    String previous;
    
    int sum_of_decimals;
    int base2_1;
    int base2_2;
    int k;
    int normal_formLenght;
    int decimalized_1;
    int decimalized_2;
   
    double sin_x;
    double series;
    double integer_x;
    double value;
    
    
      
    // program code
    sin_x = 0;
    previous = "";
    k = 0;
   
    
    System.out.println("  n    n^2   n^3   n^4  ");  
    for ( double x = -1; x < 11; x++)
       System.out.println(" " + power(x,1) + "   " + power(x,2) + "   " + power(x,3) + "   " + power(x,4) );
    
    System.out.println("    n factorial    ");
    for (double n = 1; n < 15; n++)
       System.out.println( n + "! equals " + factorial(n));
    
    System.out.println(" what is your two binary numbers? ");
    
    base2_1 = scan.nextInt();
    base2_2 = scan.nextInt();
   
    System.out.println(" The result in binary form is: " + toBinary(toDecimal(base2_1) + toDecimal(base2_2)));
    
   
    System.out.println(" Please input something to see its reversed form");
    
    String normal_form = scan.nextLine();
    
    normal_form = scan.nextLine();
    normal_formLenght = normal_form.length()-1;
    
    for ( int i = 0; i <= normal_formLenght; i++)
    {
       if ( (normal_form.charAt(i) ==' ') || ( i == normal_formLenght))
       {
          previous = previous + reverse(normal_form.substring(k,i+1)) + " ";
          k = i;
       }
    }
    System.out.println(" reversed form of " + normal_form + " is: " + previous);
    System.out.println(" what is x to find sin(x)? " );
    integer_x = scan.nextDouble();
    System.out.println(" How many series you want to compute sin(x)" );
    series = scan.nextDouble();
    System.out.println(" n      -1^n       x^(2n+1)            (2n+1)!   "); 
    System.out.println(" " + series + "   " + power(-1,series) + "   " + power(integer_x,2*series+1) + "   " + factorial(2*series+1)); 
    
    for ( double i = 0;i <= series; i++)
    { 
       sin_x = (power(-1,i)) * power(integer_x,(2*i+1)) / factorial(2*i+1);
       sin_x += sin_x;
    }
    
    System.out.println(" The answer is (sin(x) ): " + sin_x);
    System.out.println(" Also the real result is: " + Math.sin(integer_x));
    if ( sin_x < Math.sin(integer_x))
       System.out.println(" The real result is bigger than the answer we found from Taylor series");
    else 
       System.out.println(" The real result is less than the answer we found from Taylor series");
    System.out.println(" There might be little deviation because it is just a limited serie not an infinite serie");
    System.out.println(" The difference between Math function and my result is: " + Math.abs(sin_x - Math.sin(integer_x)));

  }
}