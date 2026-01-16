import java.util.Scanner;
public class Day2 {

    public static int nFactorial(int x){
        int fact = 1;
        if(x==0 || x== 1){
            return 1;
        }
        while(x>0){
            fact = fact*x;
            x--; 
        }
        return fact;    
    }
    public static void CountEvenOdd(int x){
       int Counteven = 0  , Countodd = 0 ;
            while(x>0){
                int number = x%10;
                if(number%2==0){
                    Counteven++;
                  }else{
                    Countodd++;
                }
                   x=x/10;
               
            }
             System.out.println("EvenNumbers are :"+Counteven);
                System.out.print("OddNumbers are :"+Countodd);
        
    }
    public static boolean ispalindrome(int x){      //i cannot able solve this question by my own using loop
                                                    //But i can solve using array
        int original = x ;
         int rev = 0 ; 
         while(x>0){
            int number = x%10;
            rev = rev*10+number;
                x= x/10;
         }
         return original==rev;
    }
    public static void PrintStar(int x){
        for(int i=1 ; i<=x ; i++){
            for(int j=i ; j<=x ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter Your Number:");
            int x = sc.nextInt();
            // int result = (x);
            //     System.out.println(result);
        PrintStar(x);
           // CountEvenOdd(x);
           // boolean result = ispalindrome(x);
    }
}
