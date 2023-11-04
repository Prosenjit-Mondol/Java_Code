import java.util.*;
public class stringbuffer {
    public static void main(String[] args) {
        String s1="prosenjit mondol";

        StringBuffer  sb=new StringBuffer(s1);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); 

        if(sb.equals(s1))
        {
            System.out.println("palindom");
        }
        else
        System.out.println("not palindom");
        sb.setLength(5);
        System.out.println(sb); 

        sb.delete(0, 2);
        System.out.println(sb); 
    }
}
