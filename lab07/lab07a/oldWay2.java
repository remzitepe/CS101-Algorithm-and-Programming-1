public class oldWay2{

  public static void main(String[] args) {

    int timesRolled;
    int count;
    ;
    
    timesRolled = 0;
    count = 0;
    
    while( count < 10 ) {

      int roll;
      do {
        roll = 1 + (int) ( 6 * Math.random() );
      } while( roll > 6 );
      
      if( roll == 6 ) {
        count++;
      }
      
      timesRolled++;

    }

    System.out.println( timesRolled );

  }

}

   

