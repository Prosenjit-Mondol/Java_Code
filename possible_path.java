import java.util.*;
public class possible_path {

    public static int countpath(int i,int j,int n,int m)
    {
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        int down=countpath(i+1, j, n, m);
        int right=countpath(i, j+1,n, m);
        return down+right;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter two number:");
        int n=in.nextInt();
        int m=in.nextInt();
        int total=countpath(0,0,n,m);
        System.err.println(total);
    }
}
