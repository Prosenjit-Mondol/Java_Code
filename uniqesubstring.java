import java.util.*;
public class uniqesubstring{

    public static void unisubString(String str,int ind,String news,HashSet<String> set)
    {
        if(ind==str.length())
        {
            if(set.contains(news))
            return;
            else
            {
                System.out.println(news);
                set.add(news);
                return;
            }
        }
        char curchar=str.charAt(ind);
        unisubString(str, ind+1, news+curchar, set);
        unisubString(str, ind+1, news, set);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.err.println("Enter  a  string:");
        String str=in.nextLine();
        HashSet<String> set=new HashSet<>();//uni sub set
        unisubString(str, 0, "",set);// subsequence length is 2 to the power n(str.length())
    }
}