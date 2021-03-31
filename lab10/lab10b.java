
import java.util.Random;
import java.util.Scanner;

public class lab10b {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner( System.in);
      System.out.println("Lab 10b Testing");
      
      BigNum[] bigNums;
      String sizeBigNum;
      BigNum big1;
      BigNum maximum;
      int n;
      int number;
      int biggestNumIndex;
     
      maximum = new BigNum();
      sizeBigNum = "";
      bigNums = new BigNum[10];
      System.out.println("Big Nums: ");
       
      System.out.print("[");
       
     
      for(int j = 0; j < 10; j++)
      {
         for(int i = 0; i < BigNum.SIZE; i++)
         {
            number = (int)(Math.random()*BigNum.BASE);
            sizeBigNum = sizeBigNum + number;
         }
         big1 = new BigNum(sizeBigNum);
         bigNums[j] = big1;
         System.out.print( big1 + "," );
         
         sizeBigNum = "";
      }
      System.out.print("]");
      n= 1;
      while(n > 0){
         System.out.println(" Enter the n value: ");
         n = scan.nextInt();
         biggestNumIndex = 0;
         for(int i = 1; i < n; i++)
         {
            if(!bigNums[i].isLessThan(bigNums[biggestNumIndex]))
            {
               biggestNumIndex = i;
            }
         }
         if(n > 0)
         {
            System.out.println("Biggest number is: " + bigNums[biggestNumIndex]);
         }
         
         if(biggestNumIndex != n - 1)
         {
            BigNum big2 = bigNums[biggestNumIndex];
            bigNums[biggestNumIndex] = bigNums[n-1];
            bigNums[n-1] = big2;
         }
         
         for (BigNum bigNum : bigNums)
         {
            System.out.println(bigNum.toString());
         }
      }
   }
}
