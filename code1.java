package new_kk;
import java.util.*;

public class code1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        
        // int max = b;
        // if (a > max) {
        //     max = a;
        // }
        // if (c > max) {
        //     max = c;
        // } 

        //OR
        int max = Math.max(c, Math.max(a,b));

        System.out.println(max);
        
    }
}

