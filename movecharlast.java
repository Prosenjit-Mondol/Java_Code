import java.util.*;
public class movecharlast {
    public static void moveChar(String str,int ind,int count,String news) {
        char curchar=str.charAt(ind);
        if(ind==str.length())
        {
            for(int i=0;i<count;i++)
            {

                news+='x';
            }
            System.out.println(news);
            return;
        }
        if(curchar=='x')
        {
            count++;
            moveChar(str, ind+1, count,news);
        }
        else
        {
            news+=curchar;
            moveChar(str, ind+1, count,news);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println("Enter a character that move last");
        char ch=in.next().charAt(0);
        moveChar(str,0,0,"");
    }
}
