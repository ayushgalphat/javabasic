package new_kk;
import java.util.*;

// CaseCheck
public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        char ch = sc.next().trim().charAt(x);
        //trim() is for removing extra spaces
        
        System.out.println(ch);

        //OR
        String word = "fsdaa";
        System.out.println("\n" + word.charAt(1));

        int y = sc.nextInt();
        char letter = sc.next().trim().charAt(y);
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("LowerCase");
        } else {
            System.out.println("UpperCase");
        }
    }
}
