import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.Iterator;

public class arraysort {
    public static void main(String[] args) {

    ArrayList<Integer> num1= new ArrayList<Integer>();
    ArrayList<Integer> num2= new ArrayList<>();
    ArrayList<Integer> num3= new ArrayList<>();

    num1.add(10);
    num1.add(15);
    num1.add(20);
    num1.add(8);
    System.out.println("Number 1 "+num1);
     
    num2.addAll(num1);

    System.out.println("Number 2 "+num2);
      
    boolean r=num1.equals(num2);
    System.out.println("Number 1 == Number 2 "+r);

    Collection.sort(num1);
    System.out.println("Number 1 sort "+num1);

    }

}
