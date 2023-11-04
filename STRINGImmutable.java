import java.util.*;
public class STRINGImmutable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //String name=in.nextLine();
        StringBuilder sb=new StringBuilder("Pro");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        //sb.setCharAt(0,'M');//set char at index
        
        sb.insert(2,'M');//inset 
        System.out.println(sb);

        sb.delete(2,4);//delet
        System.out.println(sb);

        sb.append("hero");//add string
        System.out.println(sb);

        for(int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-1-i;

            char fc=sb.charAt(front);
            char fb=sb.charAt(back);

            sb.setCharAt(front,fb);
            sb.setCharAt(back,fc);
            
        }

        System.out.println(sb);
    }
}
