
package LAB12;
import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=in.nextLine();
        int in1=s.charAt(1);
        
        int in2=s.codePointAt(10);
        
        System.out.println("The character at position 0 is "+in1);
        System.out.println("The character at position 0 is "+in2);
    }
}
