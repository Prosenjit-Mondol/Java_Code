import java.util.*;
public class StringDemo {
    public static void main(String[] args) {
        String s1="Prosenjit Mondol";
        String s2=new String("MAloti + Paresh");
        char[] ss={'a','b','c'};
        System.out.println(s1+" "+s2+" ");
        System.out.println(ss);
        System.out.println(s1.length());
        if(s1.contains("Mondol"))
        System.out.println("Contain");
        if(s1.equalsIgnoreCase(s2))
        System.out.println("Equal");
        else
        System.out.println("s1 and s2 are Not Equal");
        String sum=s1.concat(s2);//s1+s2;
        
        System.out.println(sum);

        String up=s1.toUpperCase();
        System.out.println(up);

        boolean b=s1.startsWith("Pro");
        System.out.println(b);

        String[] name={"pro","ma","pra","sai"};
        for (String iterable_element : name) {
            System.out.println(iterable_element);
        }

        int po=s1.indexOf("Mo");
        System.out.println(po);

        int pol=s1.lastIndexOf("Mo");
        System.out.println(pol);

        String without=sum.trim();//first and last space cancel
        System.out.println(without);

        String rep=s1.replace('P','z');//replace by word
        System.out.println(rep);  
        String[] spl=sum.split(" ");
        for(String sp:spl)
        System.out.println(sp);
    }
}
