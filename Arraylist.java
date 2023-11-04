import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>num= new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of arrays:");
        int n=in.nextInt();
        System.out.println("Enter the element of array:");
        for (int i = 0; i <n; i++) {
            int x=in.nextInt();
            num.add(x);
        }
        num.add(2,2001);
        System.out.println("The size of array is "+num.size());
        System.out.println(num);
        for(int x:num)
        {
            System.out.println(x);
        }
        Iterator it=num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        num.remove(3);
        System.out.println("After removing element ");
        System.out.println(num);

        System.out.println("After sorting element ");
        Collections.sort(num);
        System.out.println(num);
    }
}
