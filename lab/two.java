
package lab;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class par{
    private void show(){
        System.out.println("This is parent class");
    }
}
class chi{
    void prt(){
        System.out.println("This is child class");
    }
 }
public class two {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        chi c=new chi();
        par p=new par();
        Method m=par.class.getDeclaredMethod("show");
        m.setAccessible(true);
        m.invoke(p);
        c.prt();
    }
}
