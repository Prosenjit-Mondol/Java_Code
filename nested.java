import java.util.Scanner;
public class nested {
    public static void main(String[] args)
    {
        Scanner pro=new Scanner(System.in);
        int r,c;
        String s;
        System.out.println("Enter the size of rows:");
        r=pro.nextInt();
        System.out.println("Enter the size of colume:");
        c=pro.nextInt();
        System.out.println("Enter symbol to use:");
        s=pro.next();
        for(int i=0;i<r;i++)
        {
            System.out.println();
            for(int j=0;j<c;j++)
            {
                System.out.print(s+" ");
            }
        }
    }
}
