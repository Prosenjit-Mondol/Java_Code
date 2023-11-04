import java.util.*;
public class Rhombos {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enetr the size of Rhombos:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            System.out.print(" ");
            for(int j=1;j<=n-1;j++)
            System.out.print("*");
            System.out.println();
        }
    }
    
}
