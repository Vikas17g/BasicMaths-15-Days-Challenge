import java.util.*;
    public class Day11 {

        public static int CountPosition(int x){
            int count = 0 , count1 = 1;
                while (x>0) {
                    int digit = x%10;
                     if (count1 % 2 == 0) {
                        count++;
                     }
                     x=x/10;
                     count1++;
                }
               
                return count;
        }
        public static boolean isBuzz(int x) {
              if (x % 10 == 7 || x % 7 == 0) {
                 return true;
             }
                 return false;
        }
    public static int diffEvenOddDigits(int n) {
    int evenSum = 0;
    int oddSum = 0;

    while (n > 0) {
        int digit = n % 10;

        if (digit % 2 == 0) {
            evenSum += digit;
        } else {
            oddSum += digit;
        }

        n = n / 10;
    }
     return evenSum - oddSum;
}
public static void printPattern(int n) {
    int num = 1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num);
            num++;
        }
        System.out.println();
    }
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int x =sc.nextInt();
            // int result= printPattern(x);
            // System.out.println(result);
        printPattern(x);
            // if (isBuzz(x)) {
            //     System.out.println("Buzz Number");
            //     } else {
            //         System.out.println("Not Buzz Number");
            // }
         }
}
