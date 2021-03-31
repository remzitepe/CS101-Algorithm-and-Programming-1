/*
 * OOP
 * @author__Remzi_Tepe__
 * Qversion__26.11.19__
 * */
public class Die{
    
   private int faceValue;
   
   public Die (){
      faceValue = 0;  
   }
   public int roll() {

      int roll;
    
      roll = 1 + (int) ( 6 * Math.random() );  // it is used to find random number between 1-6
      
      faceValue = roll; 
      return faceValue; // it returns current face value of the die
  }
    public int getFaceValue() {
       return faceValue;           
   }
    // this method used to show the current face value
    public String toString(){
       return " Face value of the die: " + getFaceValue(); 
    }
   

  
}