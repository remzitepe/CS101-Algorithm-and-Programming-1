public class DiceGame {

  Dice dice;
  
  public DiceGame() {
    dice = new Dice();
  }
  
  int play() {
    int count;
    count = 1;
    while( dice.roll() != 12 )
       count++;
    return count;
  }

}
  

   
