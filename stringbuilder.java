import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String nam=in.nextLine();
        StringBuilder s=new StringBuilder(nam);
        System.out.println(s.charAt(0));
        s.setCharAt(0,'M');//add
        System.out.println(s);
        s.insert(0,'P');//insert
        System.out.println(s);
        s.delete(2,4);//delete
        System.out.println(s);
        s.append("S");
        System.out.println(s);
        for (int index = 0; index < s.length()/2; index++) {
            int front=index;
            int back=s.length()-1-index;
            char fc=s.charAt(front);
            char bc=s.charAt(back);
            s.setCharAt(front,bc);
            s.setCharAt(back,fc);

        }
        System.out.println(s);
    }
}
