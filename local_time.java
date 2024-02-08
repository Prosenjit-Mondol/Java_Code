
package practics;

import java.util.Calendar;
public class local_time {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println("Current Time and Date");
        System.out.format("%tB %te, %tY%n",c,c,c);
        System.out.format("%tl:%tM,%tp%n",c,c,c);
    }
}
