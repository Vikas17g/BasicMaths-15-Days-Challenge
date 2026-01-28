import java.util.*;
public class Day14 {
    public static boolean SunnyNumber(int x){
        int next = x + 1;
         int master = (int)Math.sqrt(next);
         return master*master == next;
    }

      public static int removeDigitOccurence(int x, int d) {
    int result = 0;
    int place = 1;

    while (x > 0) {
        int digit = x % 10;

        if (digit != d) {
            result = digit * place + result;
            place *= 10;
        }

        x = x / 10;
    }
    return result;
}

public static void Patternyaar(int x){
    for(int i=1 ; i<=x ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print(i);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Your number:");
            int x = sc.nextInt();
        // System.out.println("Enter  your deletion number :");
        //     int d = sc.nextInt();
             // int result = removeDigitOccurence(x , d);
             
              Patternyaar(x);
    }

}
