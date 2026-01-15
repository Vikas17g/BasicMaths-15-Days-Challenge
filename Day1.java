import java.util.*;
  public class Day1{   // For 15 days i will solve basic maths problem.For logic building 
      public static int CountDigit(int x){
         int count = 0;
           while(x>0){
            x = x/10;
              count++;
       }
         System.out.print("Your count is :");
          return count;
     }
      public static int SumOfEven(int x){
            int sum = 0 ;
            for(int i = 1; i <= x; i++) {
                if(i%2==0){
                   sum+=i;
               }
             
            }
             return sum;
      }
      
      public static int ReverseDig(int x){
        int rev = 0 ;
        while(x>0){
          int digit = x%10;
           rev = rev*10+digit;
           x = x/10;

        }
        return rev;
      }

      public static void NumberPattern(int x){
         for (int i=1 ; i<=x; i++) {
           for(int j=1 ; j<=i ; j++){
            System.out.print(j);
           }
          System.out.println();
         }
      } 
 public static void main(String[] args) {
   Scanner sc =  new Scanner(System.in);
   System.out.print("Enter Your Number :");
    int x = sc.nextInt();
    //  int result = ReverseDig(x);
      //  System.out.print(result);
      NumberPattern(x);
  }
}