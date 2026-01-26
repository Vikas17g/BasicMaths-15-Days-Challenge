import java.util.*;
public class Day12 {
    public static int countFirstDigitEqual(int x){
        //finding first digit
        int temp =x;
        while (temp>=10) {
                temp=temp/10;

        }
        int firstdigit = temp;
    
            //counting the digit
             int count = 0;
    while (x > 0) {
        int digit = x % 10;
        if (digit == firstdigit) {
            count++;
        }
        x = x / 10;
    }
    return count;
}
    public static boolean isAutomorphic(int x) {
    int square = x * x;
    int temp = x;

    while (temp > 0) {
        if (square % 10 != temp % 10) {
            return false;
        }
        square /= 10;
        temp /= 10;
    }
    return true;
}

    public static int AlternativeAddition(int x){
        int count =0 , sum =0;
        while (x>0) {
            int digit = x%10;
           
            if(count % 2 != 0){
                sum+=digit;
            }

            x=x/10;
              count++;
        }
         return sum;

       
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int x = sc.nextInt();
           int result =AlternativeAddition(x);
            System.out.println(result);
    }
}
