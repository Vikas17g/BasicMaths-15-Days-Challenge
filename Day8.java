import java.util.Scanner;

public class Day8 {
    public static int CheckDivisible(int x) {
    int count = 0;
    for (int i = 1; i <= x; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            count++;
        }
    }
    return count;
}

public static int secondLargestDigit(int n) {
    int largest = -1;
    int second = -1;

    while (n > 0) {
        int d = n % 10;

        if (d > largest) {
            second = largest;
            largest = d;
        } else if (d < largest && d > second) {
            second = d;
        }

        n = n / 10;
    }

    return second;
}
public static boolean isNeon(int x) {
    int square = x * x;
    int sum = 0;

    while (square > 0) {
        sum += square % 10;
        square = square / 10;
    }

    return sum == x;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int x = sc.nextInt();
        // int result =secondLargestDigit(x);
        // System.out.print(result);
            if (isNeon(x)) {
              System.out.println("Neon");
             } else {
                System.out.println("Not Neon");
}
    }
}
