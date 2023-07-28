package new_kk;
import java.util.*;

//All Armstrong numbers in given range
public class code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //int n = sc.nextInt();
        //boolean ans = ArmstrongNo(n);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i=n1; i<=n2; i++) {
            if (ArmstrongNo(i)) {
                System.out.println(i);
            }
        }
        
    }
    static boolean ArmstrongNo (int n) {
        int sum = 0;
        int temp = n;

        while (n>0) {
            int rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        } 
        return sum==temp;
    }
}
