import java.util.*;
public class Day3 {
    public static int SumofDigit(int x){
        int sum = 0 ;
        while(x>0){
            int digit =x%10;
             sum=sum+digit;
             x=x/10;

        }
        return sum;
    }
     public static int ProductofDigit(int x){
        int sum = 0 ;
        while(x>0){
            int digit =x%10;
             sum=sum*digit;
             x=x/10;
        }
        return sum;
    }
    public static Boolean PrimeNumber(int x){
        if(x<=1){
            return false;
        }
        for(int i=2 ; i*i<=x ; i++){
                if(x%i==0){
                return false;
                }
        }
        return true;

    }
     public static void PrintStar(int x){
        for(int i=1 ; i<=x ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Your Number:");
          int x = sc.nextInt();
        //   boolean result = PrimeNumber(x);
        //   System.out.print(result);
        PrintStar(x);

    }
}
