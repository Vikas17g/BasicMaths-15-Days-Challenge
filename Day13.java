import java.util.*;
public class Day13 {

    public static int CountperfectSquare(int x){
        int count = 0;
        while (x>0) {
            int digit = x%10;
            if(digit == 0 || digit==1 ||  digit==4 || digit ==9 ){
                count++;
            }
            x=x/10;
        }
        return count;
    }
        public static boolean isTrimorphic(int n) {
    int cube = n * n * n;
    int temp = n;

    while (temp > 0) {
        if (cube % 10 != temp % 10) {
            return false;
        }
        cube = cube / 10;
        temp = temp / 10;
    }
    return true;
}

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Number :");
                int x = sc.nextInt();
                  boolean result = isTrimorphic(x);
                  System.out.println(result);
   } 
}
