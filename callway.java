public class callway {
    public static int callwayforn(int n)
    {
        if(n<=1)
        return 1;

        //single
        int way1=callwayforn(n-1);

        //pair
        int way2=(n-1)*callwayforn(n-2);

        return way1+way2;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(callwayforn(n));
    }
}
