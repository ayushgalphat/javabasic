package new_kk;
import java.util.*;

// reversing a digit
public class code5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int ans = 0;

        while (n>0) {
            int rem = n%10;
            n /= 10;

            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }  
}
