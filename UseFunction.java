import java.util.*;
public class UseFunction{
    public static void printname(String name)
    {
        System.out.println("Prosenjit Mondol print "+name);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your identity: ");
        String name=in.nextLine();
        printname(name);
        System.out.println("Enter two number :");
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=calculate(a,b);
        System.out.println("The sum of the two number :"+sum);
    }
    public static int calculate(int a,int b)
    {
        return a+b;
    }
}