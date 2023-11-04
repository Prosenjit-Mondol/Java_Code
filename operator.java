import java.util.*;
public class operator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number :");
        int a=in.nextInt();
        int b=in.nextInt();
        String aa=Integer.toBinaryString(a);
        String bb=Integer.toBinaryString(b);
        System.out.println(aa+" "+bb);
        System.out.println("Binary and = "+(a&b));
        System.out.println("Binary or = "+(a|b));
        System.out.println("Binary XOR = "+(a^b));
        System.out.println("Binary complication "+aa+"= "+(~a));
        System.out.println("Binary leftshift "+aa+"= "+(a<<1));
        System.out.println("Binary rightshift "+aa+"= "+(a>>1));
    }
}
