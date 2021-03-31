/*
 * 
 * 
 * 
 * */
public class lab10a {
  public static void main( String[] args ) {
     BigNum b1;
     BigNum b2;
     BigNum b3;
     
     b1 = new BigNum();
     b2 = new BigNum("7ab8");
     b3 = new BigNum( b2 );
     
     System.out.println("b1: " + b1 );
     System.out.println("b2: " + b2 );
     System.out.println("b3: " + b3 );
     
    // b1.shift( true );
     //b2.shift( false );
     // b3.shift( true );
     
     System.out.println("Shifted  b1: " +  b1 );
     System.out.println("Shifted b2: " + b2 );
     System.out.println("Shifted b3: " +  b3 );
      
     b2.add( b3 ); 
     System.out.println( b2 ); 
  }
  
  
  
  
  
  
}