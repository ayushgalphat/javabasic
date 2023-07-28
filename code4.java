package new_kk;
import java.util.*;

// No of dame digit in a number
public class code4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int no = sc.nextInt();
        int count = 0;

        while (n>0) {
            int rem = n % 10;
            if (rem == no) {
                count++;
            }
            n/=10; // n = n/10;
        }
        System.out.println(count);
    }
}
