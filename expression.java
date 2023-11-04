import java.util.Scanner;
public class expression {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter two number:");
        int x=input.nextInt();
        int y=input.nextInt();
        int r=x*y;
        System.out.println("After multiply this two number : "+r);
        r=x/y;
        System.out.println("Dividin x by y :"+r);

    }
}
