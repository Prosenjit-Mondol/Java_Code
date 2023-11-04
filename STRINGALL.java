import java.util.*;
public class STRINGALL {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your position");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++)
        System.out.println(str.charAt(i));

        System.out.println("Enter two name: ");
        String name1=s.nextLine();
        String name2=s.nextLine();
        int c=name1.compareTo(name2);
        System.out.println("Compare two string "+c);
        System.out.println("Enter string for substring :");
        String sub=s.nextLine();
        String ss=sub.substring((sub.length())/2,sub.length());
        System.out.println("The substyring is "+ss);
    }
}
