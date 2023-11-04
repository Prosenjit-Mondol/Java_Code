import java.util.*;
public class bitManipulation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number :");
        int a=in.nextInt();
        int pos=2;
        int bitmask=1<<pos;

        //bit mask
        if((bitmask & a)==0)
        System.out.println("bit was zero");
        else
        System.out.println("bit was one");

        //set bit
        int po=1;
        int bitset=1<<po;
        int n=bitset | a;
        System.out.println(n);

        //clear bit
        int num=5;
        int p=2;
        int bitmas=1<<p;
        int notbitmas=~(bitmas);
        int newn=notbitmas & num;
        System.out.println(newn);

        //bit update
        int aa=5;
        int pp=1;
        System.out.println("Enter number for update:");
        int oper=in.nextInt();//oper=1 : set ,oper=0: clear
        int bitm=1<<pp;
        if(oper==1)
        {
            //set
            
            int newnumber=bitm |aa;
            System.out.println(newnumber);
        }
        else
        {
            //clear
            int newbitm=~(bitm);
            int newnumber=newbitm & aa;
            System.out.println(newnumber);
        }
    }
}
