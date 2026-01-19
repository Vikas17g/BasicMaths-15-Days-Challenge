import java.util.*;
public class Day5 {
    public static int Countnumber(int x){
        int count = 0 ;
        while(x>0) {
            int digit = x%10 ;
            if(digit>5){
                count++;
            }
            x=x/10;
        }
        return count;
    }

      public static int SumofSquare(int x){
             int temp = 0;
        for(int i = 1 ; i<=x ; i++){
            int square = i*i;
                temp = temp+square;
        }
        return temp;

      }
      public static long sumOfSquares(int x) {      // second method 
    return (long)x * (x + 1) * (2L * x + 1) / 6;
}
    

   public static boolean isArmstrong(int x) {
    int original = x;
    int sum = 0;
    int digits = 0;
    int temp = x;

    // count digits
    while (temp > 0) {                          //temp = 153 → digits = 1
                                                //temp = 15 → digits = 2
                                                //temp = 1 → digits = 3
                                                   //temp = 0 → stop
        digits++;
        temp = temp /    10;
    }

    temp = x;   

    // calculate power sum
    while (temp > 0) {
        int digit = temp % 10;
        sum += power(digit, digits);
        temp = temp / 10;
    }

    return sum == original;
}

public static int power(int a, int b) {
    int result = 1;
    for (int i = 1; i <= b; i++) {
        result *= a;
    }
    return result;
}

    public static void Printpattern(int x){
        for(int i=1 ; i<=x ; i++){
            for(int j=1 ; j<=i   ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Number:");
                int x = sc.nextInt();
                Printpattern(x);

    //              if (isArmstrong(x)) {
    //     System.out.println("Armstrong Number");
    // } else {
    //     System.out.println("Not Armstrong Number");
    //  }
   }
}

