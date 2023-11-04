import java.util.*;
public class permutation {

    public static void printperm(String str,String permu) {
        if(str.length()==0)
        {
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curchar=str.charAt(i);
            String news=str.substring(0, i)+str.substring(i+1);
            printperm(news, permu+curchar);
        }
    }

     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=in.nextLine();
        printperm(str,"");//number of permutation is n!
     }
}
