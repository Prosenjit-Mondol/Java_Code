import java.util.*;
public class recursion {
    public static void printnum(int i,int n,int sum) {
        if(n==i)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printnum(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the n natural number:");

        int n=in.nextInt();
        printnum(1,n,0);
    }
}
