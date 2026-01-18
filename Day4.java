import java.util.*;
public class Day4 {
    public static int CountZero(int x){
          int cnt = 0 ;
            while(x>0){
                int digit = x%10;
                if(digit==0){
                    cnt++;
                    
                }
                x=x/10;
            }
            return cnt;
    }

    public static int power(int x , int y){         // x to the power y
            int resultt = 1;
            while ((y>0)) {
            resultt = resultt * x;
            y--;

            }
            return resultt;
    }

    public static boolean isStrong(int x){
         int original = x ;
         int sum = 0 ;

         while (x>0) {
            int digit = x%10;
            sum+=factorial(digit);
            x=x/10;
         }
         return sum==original;
    }
    public static int factorial(int x){
        int fact = 1 ; 
        for(int i = 1 ; i<=x ; i++){
            fact = fact*i;

        }
        return fact;
    }
    public static void pattern(int x){
            for(int i = x ; i>=1 ; i--){
                for(int j = 1; j<=i ; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          pattern(x);

        //     if (isStrong(x)) {
        //         System.out.println("Strong Number");
        //      } else {
        //   System.out.println("Not Strong Number");
   }

     }
    
 
