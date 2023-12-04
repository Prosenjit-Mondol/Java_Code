
package LAB12;

import java.util.*;
public class four {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=in.nextLine();
        int ctr = s.codePointCount(1, 10);
        System.out.println("Codepoint count = "+ctr);
    }
}
