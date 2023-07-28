package new_kk;
import java.util.Scanner;

//Fibonacchi series
public class code3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int count = 2; count <= x; count++) {
            int temp = b;
            b = b + a;
            a = temp;

        }
        System.out.println(b);
    }
}
