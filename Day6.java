import java.util.*;
public class Day6 {
    public static int Countnumber(int x){
        if(x==0){
            return 1;
        }
        int count = 0 ;
        while(x>0) {
            int digit = x%10 ;
            if(digit<5){
                count++;
            }
            x=x/10;
        }
        return count;
    }
    
    public static int SumofOdd(int x){
        int sum = 0;
        for(int i=1 ; i<=x ; i++){
             if(i%2!=0){
                sum+=i;
          }
          
        }
        return sum;
    }

    public static boolean PerfectNumber(int x){
        if(x<=1){
            return false;
        }
        int sum = 0 ;
        for(int i=1 ; i<=x/2 ; i++){
            if(x%i==0){
                sum+=i;
            }
        }
        return sum==x;

    }

    public static void Pattern(int x){
        for(int i=1 ; i<=x ; i++){
            for(int j=i ; j<=x
                 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:");
          int x = sc.nextInt();
            // int result = PerfectNumber(x);
            //     System.out.println(result);

            Pattern(x);
    }
}