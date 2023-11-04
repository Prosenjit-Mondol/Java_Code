import java.util.Scanner;
public class scanner {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=input.nextLine();
        System.out.println("How old you are ? ");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("Whice foood you like ? ");
        String food=input.nextLine();
        System.out.println("Hello "+name);
        System.out.println(name+" , are you "+age+" years old !!!");
        System.out.println("Really are you like "+food);
    }
}
