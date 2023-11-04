import java.util.*;
public class my2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter first integer: ");
        x = in.nextInt();
        if (x > 100) {
        System.out.printf("%d's square is greater than 100%n", x);
        }
        else if (x< 100) {
            System.out.printf("%d's square is less than 100%n", x);

        }
        else if (x == 100) {
            System.out.printf("%d's square is equal to 100%n", x);
        }
    }
    
}
