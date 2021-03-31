 public class Dice {

  Die Die1;
  Die Die2;
  
  public Dice() {
     Die1 = new Die();
     Die2 = new Die();
  }
  
  public int roll() {
     return Die1.roll() + Die2.roll();
  }
  
  public int getDie1FaceValue() {
    return Die1.getFaceValue();
  }

  public int getDie2FaceValue() {
    return Die2.getFaceValue();
  }
  
  public int getDiceTotal() {
    return Die1.getFaceValue() + Die2.getFaceValue();
  }
  
  public String toString() {
    return "Die 1 has value " + getDie1FaceValue() + " and die 2 has value " + getDie2FaceValue() + "Total dice: " + getDiceTotal() + ".";
  }

}