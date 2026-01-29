import java.util.*;

public class Day15 {

    public static int countDigitsDivBy2And3(int x) {
        int count = 0;

        while (x > 0) {
            int digit = x % 10;

            if (digit % 6 == 0) {
                count++;
            }

            x = x / 10;
        }
        return count;
    }

   public static boolean isDisarium(int n) {
    int original = n;
    int sum = 0;

    int digits = 0;
    int temp = n;
    while (temp > 0) {
        digits++;
        temp /= 10;
    }

    
    temp = n;
    while (temp > 0) {
        int digit = temp % 10;
        sum += power(digit, digits);
        digits--;
        temp /= 10;
    }

    return sum == original;
}


public static int power(int base, int exp) {
    int result = 1;
    for (int i = 1; i <= exp; i++) {
        result *= base;
    }
    return result;
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int x = sc.nextInt();

        int result = countDigitsDivBy2And3(x);
        System.out.println(result);
    }
}
