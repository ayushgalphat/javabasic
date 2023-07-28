package new_kk;
import java.util.*;

//Nested Switch cases
public class code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String Dept = sc.next();
        int Employee_ID = sc.nextInt();

        switch (Dept) {
            case "Tech":
            switch (Employee_ID) {
                case 1,2,3,4,5:
                System.out.println(true);
            break;
            default:
            System.out.println(false); 
            } 
            break;
            case "Management":
            switch (Employee_ID) {
                case 6,7:
                System.out.println(true);
            break;
            default:
            System.out.println(false);
            }
            break;
            case "Maintainence":
            switch (Employee_ID) {
                case 8,9,10:
                System.out.println(true);
            break;
            default:
            System.out.println(false);
            }
            break;
            default:
            System.out.println(false);
        }
    }    
}
