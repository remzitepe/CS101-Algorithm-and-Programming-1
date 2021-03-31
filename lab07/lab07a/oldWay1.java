public class oldWay1 {

  public static void main(String[] args) {
    
    // variables
    int timesRolled;
    int count;
    
    // program code
    timesRolled = 0;
    count = 0;
    
    while( count < 2 ) {

      int roll;
      do {
        roll = 1 + (int) ( 6 * Math.random() );
      } while( roll > 6
             );
      
      if( roll == 6 ) {
        count++;
      }
      
      timesRolled++;

    }

    System.out.println( timesRolled );

  }

}

 
  