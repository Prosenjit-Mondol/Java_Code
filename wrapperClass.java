import java.util.*;
public class wrapperClass {
    public static void main(String[] args) {
        //premitive to object
        int x=30;
        Integer y=Integer.valueOf(x);
        System.out.println(y);
        Integer z=x;//autoboxing
        System.out.println(z);
        Double e=new Double(3.583);
        System.out.println(e);
        double d=e.doubleValue();
        System.out.println(d);

        // primitive to string

        double i=100;
        String s=Double.toString(i);
        System.out.println(s);

        //string to primitive

        String ss="123";
        double ii=Double.parseDouble(ss);
        System.out.println(ii);
        int iv=Integer.valueOf(ss);//parseInt(ss)
        System.out.println(iv);

        
    }
}
