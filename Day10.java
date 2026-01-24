import java.util.*;
    public class Day10 {

    public static int countDigit(int num, int d) {
    int count = 0;

    while (num > 0) {
        int digit = num % 10;

        if (digit == d) {
            count++;
        }

        num = num / 10;
    }
    return count;
}
    public static boolean isDuck(int x) {
    while (x > 0) {
        if (x % 10 == 0) {
            return true;
        }
        x = x / 10;
    }
    return false;
}

public static int replaceZeroWithOne(int n) {
    int result = 0;
    int place = 1;

    if (n == 0) return 1; 

    while (n > 0) {
        int digit = n % 10;

        if (digit == 0) {
            digit = 1;
        }

        result = digit * place + result;
        place *= 10;

        n = n / 10;
    }
    return result;
}


    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your number :");
                int x = sc.nextInt();
                //  System.out.print("Enter Your Targeted Number :");
                //   int d = sc.nextInt();
                //    int result = countDigit(x, d);
            //    if (isDuck(x)) {
            //     System.out.println("Duck Number");
            //     } else {
            //      System.out.println("Not Duck Number");

            int result = replaceZeroWithOne(x);
                System.out.println(result);
            }
      }



