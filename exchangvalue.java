import java.util.*;
public class exchangvalue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

         System.out.println("Enter a octal number:");
         String occtal=in.nextLine();
         Integer deci=Integer.parseInt(occtal,8);
         System.out.println(deci);

         System.out.println("Enter a binary number:");
         String de=in.nextLine();
         Integer v=Integer.parseInt(de,2);
         System.out.println(v);

         System.out.println("Enter a hexadecimal number:");
         String hex=in.nextLine();
         Integer h=Integer.parseInt(hex,16);
         System.out.println(h);

         System.out.println("Enter a Decimal number:");
         int a=in.nextInt();
         String aa=Integer.toBinaryString(a);
         System.out.println(aa);

         String hexa=Integer.toHexString(a);
         System.out.println(hexa);

         String o=Integer.toOctalString(a);

         System.out.println(o);
    }
}
