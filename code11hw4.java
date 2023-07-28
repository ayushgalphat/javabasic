package new_kk;
import java.util.*;

//Factorial of a no
public class code11hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }
    static int factorial(int n) {
        int product=1;
        if (n==0) {
            return product;
        }
        while (n>0) {
            product *= n;
            n=n-1;
        }
        return product;
    }
}
