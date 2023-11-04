import java.util.Scanner;
public class arr {
    public static void main(String[] args)
    {
        String[] name={"pro","maloti","paresh"};
        for(int i=0;i<3;i++)
        {
            System.out.println(name[i]);
        }
        Scanner arr=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=arr.nextInt();
        String[] nam=new String[n+1];
        System.out.println("Enter the name of participent");
        for(int j=0;j<=n;j++)
        {
            nam[j]=arr.nextLine();
        }
        for(int k=0;k<=n;k++)
        System.out.println(nam[k]);
        arr.nextLine();
        System.out.println("Enter the size of numarray:");
        int nn=arr.nextInt();
        int[] bb=new int[n+1];
        for(int j=0;j<nn;j++)
        {
            bb[j]=arr.nextInt();
        }
        for(int j=0;j<nn;j++)
        {
            System.out.println(bb[j]);
        }
            
    }
}
