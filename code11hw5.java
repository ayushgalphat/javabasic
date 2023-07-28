package new_kk;
import java.util.*;

//palindrome no
// public class code11hw5 {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
       
//        if (factorial(n)==true) {
//         System.out.println("yes " + n + " is a palindrome no");
//        } else {
//         System.out.println("no " + n+" isn't a palindrome");
//        }
//     }
//     static boolean factorial(int n) {
//         String str = n.toString();
//         int len = str.length();
//         for (int i=0; i<len/2; i++) {
//             if (str.charAt(i) != str.charAt(len-i-1)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

public class code11hw5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       
       if (factorial(n)==true) {
        System.out.println("yes " + n + " is a palindrome no");
       } else {
        System.out.println("no " + n+" isn't a palindrome");
       }
    }
    static boolean factorial(int n) {
        int reversed = 0;
        int temp = n;
        while (n!=0) {
            int rem = n%10;
            reversed = reversed*10 + rem;
            n = n/10;
        } return temp == reversed;
    }
}