public class recursion_fac {
    public static int factcal(int n) {
        if(n==1 || n==0)
        return 1;

        int fact;
        fact=factcal(n-1);
        int factn = n*fact;
        return factn;
    }
    public static void main(String[] args) {
        int n=5;
        int s=factcal(n);
        System.out.println(s);
    }
}
