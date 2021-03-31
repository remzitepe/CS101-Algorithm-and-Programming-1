/*
 * OOP
 * @author__Remzi_Tepe__
 * Qversion__26.11.19__
 * */
public class Dice {

   private Die Die1;
   private Die Die2;
  
   public Dice() {
      Die1 = new Die();
      Die2 = new Die();
  }
  
  public int roll() {
     return Die1.roll() + Die2.roll(); // I add them together because total value is asked
  }
  
  public int getDie1FaceValue() {
     return Die1.getFaceValue(); // it returns current die1 face value
  }

  public int getDie2FaceValue() {
     return Die2.getFaceValue(); // it returns current die2 face value
  }
  
  public int getDiceTotal() {
     return Die1.getFaceValue() + Die2.getFaceValue(); // it returns total of die1 and die2 value 
  }
  
  public String toString() {
     return "Die1 has value " + getDie1FaceValue() + " and die2 has value " + getDie2FaceValue() + " Total dice value: " + getDiceTotal() + ".";
  }

}