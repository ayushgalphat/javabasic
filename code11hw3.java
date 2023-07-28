package new_kk;
import java.util.*;

//
public class code11hw3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int marks = sc.nextInt();
        grades(marks);
    }
    static void grades (int n) {
        if (90<n && n<=100) {
            System.out.println("AA");
        } else if (80<n && n<=90) {
            System.out.println("AB");
        } else if (70<n && n<=80) {
            System.out.println("BB");
        } else if (60<n && n<=70) {
            System.out.println("BC");
        } else if (50<n && n<=60) {
            System.out.println("CC");
        } else if (40<n && n<=50) {
            System.out.println("CD");
        } else if (32<n && n<=40) {
            System.out.println("DD");
        } else if (n<=32) {
            System.out.println("Fail");
        }
    }
}
