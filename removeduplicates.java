import java.util.*;
public class removeduplicates {
    public static boolean[] map=new boolean[26];

    public static void moveall(String str,int ind, String news)
    {
        if(ind==str.length())
        {
            System.out.println(news);
            return;
        }
        char curchar=str.charAt(ind);
        if(map[curchar-'a']==true)
        {
            moveall(str, ind+1, news);
        }
        else
        {
            news+=curchar;
            map[curchar-'a']=true;
            moveall(str, ind+1, news);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=in.nextLine();
        moveall(str,0,"");
    }
}
