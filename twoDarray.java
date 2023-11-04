import java.util.Scanner;
public class twoDarray {
    public static void main(String[] args)
    {
        Scanner bro=new Scanner(System.in);
        System.out.println("Enter the number of 2D array:");
        int n=bro.nextInt();
        System.out.println("Enter the element of 2D array:");
        String[][] caple=new String[n+1][n+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            caple[i][j]=bro.nextLine();
        }
        System.out.println("The element of 2D array is:");
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            System.out.println(caple[i][j]);
        }
    }
}
