import java.util.*;
public class Day9 {
    public static int DivisibleBy3(int x){
        int count = 0;
        while (x>0) {
            int digit = x%10;
            if(digit%3==0){
                count++;    
            }   
              x=x/10;
            
        }
        return count;
    }

    public static int SumofFirstandLast(int x){
        int last = x % 10;   

    int first = x;
    while (first >= 10) {
        first = first / 10;  
    }

    return first + last;
    }

    public static boolean isSpy(int x) {
    int sum = 0;
    int product = 1;

    while (x > 0) {
        int digit = x % 10;
        sum += digit;
        product *= digit;
        x = x / 10;
    }

    return sum == product;
}

public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
    public static void printPatter(int x) {
    for (int i = 1; i <= x; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your number :");
                int x = sc.nextInt();
                    printPattern(x);

                   //boolean result = isSpy(x);
                   // System.out.println(result);

//                    if (isSpy(x)) {
//                         System.out.println("Spy Number");
//                             } else {
//                                  System.out.println("Not Spy Number");
//                              }


    }
}
