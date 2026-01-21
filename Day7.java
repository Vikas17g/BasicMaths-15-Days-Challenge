import java.util.*;
  public class Day7{
      public static int Largest(int x){
          int largest =0;
          while(x>0){
              int digit = x%10;
              if(digit>largest){
                  largest = digit;
              }
              x = x/10;
          }
          return largest;
      }
      public static int countPrimeDigits(int x) {
    int count = 0;

    while (x > 0) {
        int digit = x % 10;

        if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
            count++;
        }

        x = x / 10;
    }
    return count;
}
    public static boolean HarshadNumber(int x){
        int sum = 0 , original = x;
        while (x>0) {
            int digit = x%10 ;
            sum+=digit;
            x=x/10;

        }
        return original % sum ==0;
    }

    public static void Pattern(int x){
        for(int i=1 ; i<=x ; i++){
            for(int j=1 ; j<=x ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Your Number:");
            int x = sc.nextInt();
                // int result =HarshadNumber(x);
                //   System.out.print(result);
                Pattern(x);

     }
  }