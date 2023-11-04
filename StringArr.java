import java.util.Arrays;
import java.util.Scanner;
public class StringArr {
    public static void main(String[] args) {
        String[] name=new String[5];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 5 name: ");
        for(int i=0;i<name.length;i++)
        {
            name[i]=input.nextLine();
        }
        for(String x:name)
        {
            System.out.println(x);
        }
        System.out.println("After sorting :");
        Arrays.sort(name);
        
    }

}