import java.util.Scanner;
public class switchs{
    public static void main(String[] args)
    {
        Scanner pro=new Scanner(System.in);
        System.out.println("Enter a day:");
        String day=pro.nextLine();
        switch(day)
        {
            case "sunday":
            System.out.println("It is Sunday!");
            break;
            case "monday":
            System.out.println("It is Monday!");
            break;
            case "tuseday":
            System.out.println("It is Tuseday!");
            break;
            case "wednesday":
            System.out.println("It is Wednesday!");
            break;
            case "thursday":
            System.out.println("It is Thurseday!");
            break;
            case "friday":
            System.out.println("It is Friday!");
            break;
            case "saturday":
            System.out.println("It is Saturday!");
            break;
            default:
            System.out.println("Wrong day");
        }
    }
}
