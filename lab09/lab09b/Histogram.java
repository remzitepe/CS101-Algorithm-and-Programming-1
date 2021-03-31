import java.util.ArrayList;

public class Histogram {
  public static void main(String[] args){
     ArrayList<Integer> x;
    
     x = frequency();
     System.out.println(" Frequencies: " + x );
     System.out.println( histogramized( x ));   
  }
   public static ArrayList<Integer> frequency() {
         ArrayList<Integer> frequencies;
         frequencies = new ArrayList<Integer>();
         for ( int i = 0; i < 11; i++)
         {
            frequencies.add( 0 ); 
         }
         Dice dice = new Dice();
         for ( int i = 0; i < 1000; i++)
         {
            dice.roll(); 
            frequencies.set( dice.getDiceTotal() - 2, frequencies.get( dice.getDiceTotal() - 2 ) + 1 );
         }   
         return frequencies;
  } 
   public static String histogramized(ArrayList<Integer> frequencies) {
     
      int max;
      String theHistogram;
      theHistogram = "";
      max = 0;
     for (int x : frequencies )
     {  
         if ( x > max)
         max = x;   
      }  
       System.out.println("Max Frequency: " + max);
       for ( int i = 0; i < 11; i++)
       {
          for ( int j = 0; j < 11 ; j++)
          {
             if ( i <= 10 - ( frequency().get( j ) / 18 ) ) 
               theHistogram = theHistogram + "  ";
            else 
               theHistogram = theHistogram + "* ";
         }
         theHistogram = theHistogram + "\n";
      }
    return theHistogram;
 }
}