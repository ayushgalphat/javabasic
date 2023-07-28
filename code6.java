package new_kk;
import java.util.*;

//Calculator
public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        while (true) {
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op =='/') {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (op == '+') {
                System.out.println(a + b);
            }
            if (op == '-') {
                System.out.println(a - b);
            }
            if (op == '*') {
                System.out.println(a * b);
            }
            if (op == '%') {
                System.out.println(a % b);
            }
            if (op == '/') {
                if ( b != 0) {
                System.out.println(a / b);
            }
            }
        }
        else if (op == 'a' || op == 'A') {
            break;
        } else {
            System.out.println("Invalid");
        }
        } 
    }
}
