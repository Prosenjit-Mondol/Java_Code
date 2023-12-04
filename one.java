
package LAB12;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=in.nextLine();
        int in1=s.charAt(0);
        int in2=s.charAt(10);
        
        System.out.println("The character at position 0 is "+(char)in1);
        System.out.println("The character at position 0 is "+(char)in2);
    }
}
