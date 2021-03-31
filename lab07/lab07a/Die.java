 public class Die{
    
   int faceValue;
   int dice1FaceValue;
   int dice2FaceValue;
   
   public Die (){
      faceValue = 0;
      dice1FaceValue = 0;
      dice2FaceValue  = 0;
   }
   public int roll() {

      int roll;
      do {
         roll = 1 + (int) ( 6 * Math.random() );
      } while( roll > 6 );
    
      faceValue = roll;
      return faceValue;
  }
    
    public int getFaceValue() {
       return faceValue;
   }
    public String toString(){
      return " Face value of the die: " + getFaceValue(); 
    }
   

  
}