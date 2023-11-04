import java.util.*;
public class stringreverse {
    public static int first=-1;
    public static int last=-1;

    public static void findcurance(String str,int ind,char element) {
        if(ind==str.length())
        {
            System.out.println("First "+first);
            System.out.println("Last "+last);
            return;
        }
        char cuchar=str.charAt(ind);

        if(cuchar==element)
        {
            if(first==-1)
            first=ind;
            else
            last=ind;
        }
        findcurance(str, ind+1, element);
    }

    public static void printRev(String str, int ind) {
        if(ind==0)
        {
            System.out.print(str.charAt(ind));
            return ;
        }
        System.out.print(str.charAt(ind));
        printRev(str, ind-1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=in.nextLine();
        printRev(str, str.length()-1); 
        System.err.println("\nEnter a element:");
        char ele=in.next().charAt(0);
        findcurance(str, 0,ele);
    }
}
