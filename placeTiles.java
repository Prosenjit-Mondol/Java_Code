public class placeTiles {
    public static int place(int n,int m)
    {
        if(n==m)
        return 2;
        if(n<m)
        return 1;
        //vertically
        int ver=place(n-m, m);

        //horizontally
        int hor=place(n-1, m);

        return hor+ver;
    }

    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(place(n, m));
    }
}
