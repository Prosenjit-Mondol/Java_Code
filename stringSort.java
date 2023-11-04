import java.util.Scanner;
import java.util.Arrays;
public class stringSort {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        String[] name=new String[5];
        System.out.println("Enter five name");
        for (int index = 0; index <5; index++) {
            name[index]=st.nextLine();
        }

        Arrays.sort(name);
        for (int x=0;x<5;x++) {
            System.out.println(name[x]);
        }
    }
}
