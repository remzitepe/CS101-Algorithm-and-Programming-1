import java.util.Arrays;

public class BigNum {
  
   final public static int SIZE = 10;
   final public static int BASE = 16;
   
   private int[] bigNum;
   

   public BigNum ()
   {
      bigNum = new int[SIZE];
      for ( int i = 0; i < bigNum.length; i++ )
      {
         bigNum[i] = 0;
      }
   }
   
   
   public BigNum ( String num )
   {
      bigNum = new int[SIZE];
      String rev = reverse(num);
      for ( int i = 0  ; i < rev.length() ; i++ )
      {  
         if (rev.charAt(i) == 'a' ) 
           bigNum[i] = 10;
         else if (rev.charAt(i) == 'b' ) 
           bigNum[i] = 11;
         else if (rev.charAt(i) == 'c' ) 
           bigNum[i] = 12;
         else if (rev.charAt(i) == 'd' ) 
           bigNum[i] = 13;
         else if (rev.charAt(i) == 'e' ) 
           bigNum[i] = 14;
         else if (rev.charAt(i) == 'f' ) 
           bigNum[i] = 15;
         else
            bigNum[i] = num.charAt(num.length() - i - 1) - '0';
         
      }
      
      for ( int i = rev.length() ; i < SIZE ; i++) 
      {
         bigNum[i] = 0;
      }
   }
   
 
   public BigNum ( BigNum other )
   {
      int[] numBig;
      numBig = new int[SIZE];
      for ( int i = 0; i < numBig.length; i++ )
      {
         numBig[i] = other.bigNum[i];
      }
      this.bigNum = numBig;
   }
     public void shift( boolean left ) {
       if ( left ) {
        for ( int i = SIZE - 1; i > 0; i-- )
        {
           bigNum[i] = bigNum[i-1]; 
        }
        bigNum[0] = 0;  
       }
       else 
       {
          for ( int i = 0; i < SIZE -1; i++)
             bigNum[i] = bigNum[i+1];
          bigNum[SIZE-1] = 0;
       }
     }
     public String reverse( String s )
     {
       String res = "";
       for ( int i = 0; i < s.length(); i++)
         res = res + s.charAt(s.length() -1 -i );
       return res;
     }
     public String toString() {
       String str;
       str = "";
       String ans = " ";

      for ( int i = bigNum.length - 1; i >= 0; i--) 
      {
        char ch = Character.forDigit( bigNum[i], BASE );
        str += ch;
      }
        ans = str + ans;
    
       return ans;
     }
    public int add ( BigNum other )
   {
      int[] sum; 
      sum = new int[SIZE + 1];
      for ( int i : sum) 
      { 
         sum[i] = 0; 
      } 
      for ( int i = 0; i < SIZE; i++) 
      {  int x = sum[i] %BASE;
         sum[i] = ( sum[i] + this.bigNum[i] + other.bigNum[i] ) % BASE; 
         sum[i + 1] = sum[i + 1] + ( ( x ) + this.bigNum[i] + other.bigNum[i] ) / BASE;    
       
      } 
      
      for ( int i = 0; i < SIZE; i++) 
      { 
         this.bigNum[i] = sum[i]; 
      } 
      return sum[SIZE]; 
   }
   public boolean isLessThan( BigNum other )
   {
      for ( int i = 1; i <= SIZE; i++ )
      {
         if ( this.bigNum[SIZE - i] < other.bigNum[SIZE - i])
         {
            return true;
         }
         else if (  this.bigNum[SIZE - i] > other.bigNum[SIZE - i])
         {
            return false;
         }
      }
      return false;
   }
}

     
   
        
       
     

       
         
       
       
     
     
     
  
   
   
   
    
  
