import java.util.*;
public class substring {
    public static void subString(String str,int ind,String news)
    {
        if(ind==str.length())
        {
            System.err.println(news);
            return ;
        }
        char curchar=str.charAt(ind);
        subString(str, ind+1, news+curchar);
        subString(str, ind+1, news);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.err.println("Enter  a  string:");
        String str=in.nextLine();
        subString(str, 0, "");// subsequence length is 2 to the power n(str.length())
    }
}
