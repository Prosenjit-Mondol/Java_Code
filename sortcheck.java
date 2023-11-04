import java.util.*;
public class sortcheck {
    public static boolean isSort(int arr[] , int ind) {
        if(ind==arr.length-1)
        {
            return true;
        }
        if(arr[ind]<=arr[ind+1])
        return isSort(arr, ind+1);
        else
        return false;
    }
    public static void moveChar(String str,int ind,int count,String news,char ch) {
        char curchar=str.charAt(ind);
        if(ind==str.length())
        {
            for(int i=0;i<count;i++)
            news+=ch;
            System.out.println(news);
            return;
        }
        if(curchar==ch)
        {
            count++;
            moveChar(str, ind+1, count,news,ch);
        }
        else
        {
            news+=curchar;
            moveChar(str, ind+1, count,news,ch);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,23,45,55};
        System.out.println(isSort(arr,0));
        System.out.println("Enter a string:");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println("Enter a character that move last");
        char ch=in.next().charAt(0);
        moveChar(str,0,0,"",ch);
    }
}
