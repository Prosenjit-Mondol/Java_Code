
package LAB12;
import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=in.nextLine();
        int val1 = s.codePointBefore(1);
        int val2 = s.codePointBefore(9);
        
        System.out.println("Character(unicode point) = "+val1);
        System.out.println("Character(unicode point) = "+val2);
    }
}
